package com.jaber.demo.services;

import com.jaber.demo.entities.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    public List<Item> getItems(){
        return List.of(
                new Item("1","Brown Brim","https://i.ibb.co/ZYW3VTp/brown-brim.png",14),
                new Item("2","Blue Beanie","https://i.ibb.co/ypkgK0X/blue-beanie.png",15),
                new Item("3","Brown Cowboy","https://i.ibb.co/QdJwgmp/brown-cowboy.png",16),
                new Item("4","Grey Brim","https://i.ibb.co/RjBLWxB/grey-brim.png",12)
        );
    }
}
