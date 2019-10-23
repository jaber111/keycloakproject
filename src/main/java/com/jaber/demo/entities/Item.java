package com.jaber.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Item {
    private String id;
    private String name;
    private String imgUrl;
    private double price;
}
