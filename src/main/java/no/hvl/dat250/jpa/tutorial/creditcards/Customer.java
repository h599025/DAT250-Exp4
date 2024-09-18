package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    public Collection<Address> addresses;

    @ManyToMany(cascade = CascadeType.PERSIST)
    public Collection<CreditCard> creditCards;

    public Customer() {}
    public Customer(Long id, String name, Collection<Address> addresses, Collection<CreditCard> creditCards) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
        this.creditCards = creditCards;
    }

    public String getName() {
        return name;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        return creditCards;
    }
}
