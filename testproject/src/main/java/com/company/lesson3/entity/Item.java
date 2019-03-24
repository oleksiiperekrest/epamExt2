package com.company.lesson3.entity;

public class Item {

    private final Long itemId;
    private final String name;
    private final Integer price;

    public Item(Long itemId, String name, int price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
