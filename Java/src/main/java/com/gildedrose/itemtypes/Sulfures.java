package com.gildedrose.itemtypes;

import com.gildedrose.Item;

public class Sulfures extends Item {
    public Sulfures(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    protected void updateQuality() {
        //nothing to do.
    }

}
