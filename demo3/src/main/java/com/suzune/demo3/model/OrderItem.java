package com.suzune.demo3.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Order_Items")
public class OrderItem {
    @EmbeddedId
    private OrderItemId id ;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order ;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @MapsId("productId")
    private Product product ;

    @Column(name = "quantity" , nullable = false)
    private int quantity ;
    @Column(name = "unit_price" ,nullable = false, precision = 12 , scale = 2)
    private BigDecimal unitPrice ;
}
