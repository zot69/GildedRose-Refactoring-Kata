package com.gildedrose;

import com.gildedrose.itemtypes.Sulfures;
import com.gildedrose.itemtypes.AgedBrie;
import com.gildedrose.itemtypes.ConcertTicket;

public class ItemFactory {
    public static Item create(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new ConcertTicket(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfures(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }
}
