package com.hstn.internet_shop.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private long id;

    private String title;

    private String description;

    private int price;

    private String city;

    private String author;

}
