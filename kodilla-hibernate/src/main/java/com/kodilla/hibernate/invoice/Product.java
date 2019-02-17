package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    List<Item> items;

    public List<Item> getItems() {   return items;   }

    public void setItems(List<Item> items) {  this.items = items;   }

    public Product() {
    }

    public Product(String name) {   this.name = name;   }


    public int getId() {   return id;   }

    public void setId(int id) {   this.id = id;   }


    public String getName() {   return name;   }

    public void setName(String name) {    this.name = name;   }
}