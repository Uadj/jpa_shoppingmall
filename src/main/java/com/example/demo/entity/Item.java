package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, length = 50)
    private String itemNm;
    
    @Column(name="price", nullable = false)
    private int price;
    
    @Column(nullable = false)
    private int stockNumber;
    
    @Column(nullable = false)
    private String itemDetail;
    
    private ItemSellStatus itemSelStatus;
    
    private LocalDateTime regTime;
    
    private LocalDateTime updateTime;
}
