package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Integer creditLimit;
    private Integer balance;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="bank_id")
    private Bank bank;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="pincode_id")
    private Pincode pincode;

    public CreditCard() {}
    public CreditCard(Integer number, Integer creditLimit, Integer balance) {
        this.number = number;
        this.creditLimit = creditLimit;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public Pincode getPincode() {
        return pincode;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    public Bank getOwningBank() {
        return bank;
    }

    public void setOwningBank(Bank bank) {
        this.bank = bank;
    }
}
