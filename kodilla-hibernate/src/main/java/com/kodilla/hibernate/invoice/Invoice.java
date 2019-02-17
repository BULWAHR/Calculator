package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "INVOICES")
@Entity
public class Invoice {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;
    @Column(name = "NUMBER")
    private String number;
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Item> items;

    public Invoice(){
    }

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    public int getId() {    return id;    }


    public void setId(int id) {  this.id = id;   }

    public String getNumber() {  return number;   }

    public void setNumber(String number) { this.number = number;   }

    public List<Item> getItems() { return items;   }

    public void setItems(List<Item> items) {  this.items = items;   }
}
