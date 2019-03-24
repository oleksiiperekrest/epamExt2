package com.company.lesson3.repository;

import com.company.lesson3.entity.Item;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class ItemRepository {


    private Item[] items;

    public ItemRepository(Item[] items) {
        this.items = items;


    }

    //TODO: CRUD

    public Item findItemById(Long id) {

        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                return item;
            }
        }
        return null;
//        throw new UnsupportedOperationException("Unimplemented");
    }
}
