package com.gildedrose.items.types;

import com.gildedrose.items.Item;

public class Conjured extends Item {

    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(quality > 0) {
            quality -= 2;
        }

        sellIn--;

        if(sellIn < 0 && quality > 0) {
            quality -= 2;
        }

        if(quality < 0) {
            quality = 0;
        }
    }

}
