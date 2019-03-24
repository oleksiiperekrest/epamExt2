package com.company.lesson3.service;

import com.company.lesson3.entity.Item;
import com.company.lesson3.repository.ItemRepository;

public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item findItemById(Long id) {
        return itemRepository.findItemById(id);
    }
}
