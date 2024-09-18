package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import no.hvl.dat250.jpa.tutorial.creditcards.*;

import java.util.Collection;

public class CreditCardsMain {

  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {
    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      createObjects(em);
      em.getTransaction().commit();
    }

  }

  private static void createObjects(EntityManager em) {
    Customer customer = new Customer("Max Mustermann");
    Pincode pincode = new Pincode("123", 1);
    Address address = new Address("Inndalsveien", 28);
    CreditCard creditCard1 = new CreditCard(12345, -10000, -5000);
    CreditCard creditCard2 = new CreditCard(123, 2000, 1);
    Bank bank = new Bank("Pengebank");

    customer.getAddresses().add(address);
    customer.getCreditCards().add(creditCard1);
    customer.getCreditCards().add(creditCard2);
    creditCard1.setPincode(pincode);
    creditCard2.setPincode(pincode);
    //bank.getOwnedCards().add(creditCard1);
    //bank.getOwnedCards().add(creditCard2);
    creditCard1.setOwningBank(bank);
    creditCard2.setOwningBank(bank);

    em.persist(creditCard2);
    em.persist(creditCard1);
    em.persist(bank);
    em.persist(address);
    em.persist(pincode);
    em.persist(customer);
  }
}
