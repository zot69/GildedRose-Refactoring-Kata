package com.gildedrose.items;

import com.gildedrose.items.types.Conjured;
import com.gildedrose.items.types.Sulfures;
import com.gildedrose.items.types.AgedBrie;
import com.gildedrose.items.types.ConcertTicket;

public class ItemFactory {
    public static Item create(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new ConcertTicket(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfures(sellIn, quality);
            case "Conjured Mana Cake":
                return new Conjured(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }
}
