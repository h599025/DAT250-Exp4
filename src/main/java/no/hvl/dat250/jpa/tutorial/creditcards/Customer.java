package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    public Set<Address> addresses = new HashSet<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    public Set<CreditCard> creditCards = new HashSet<>();

    public Customer(String name) {
        this.name = name;
    }

    public Customer() { }

    public String getName() {
        return name;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }
}
