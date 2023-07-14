package com.john.webshop.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderLine {
    @Id
    private Integer orderLineId;

//    @OneToOne()
//    private Product product;

    private int quantity;

//    @ManyToOne
//    private Order order;
}
