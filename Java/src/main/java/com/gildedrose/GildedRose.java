package com.gildedrose;

import com.gildedrose.items.Item;

import java.util.Arrays;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(Item::updateQuality);
    }

    public Item[] getItems() {
        return items;
    }
}