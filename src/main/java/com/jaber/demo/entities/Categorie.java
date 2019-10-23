package com.jaber.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
public class Categorie {
    private String id;
    private String title;
    private String routeName;
    private ArrayList<Item> Items ;
}
