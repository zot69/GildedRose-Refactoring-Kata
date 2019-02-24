package com.gildedrose.items.types;

import com.gildedrose.items.Item;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality++;
        }

        sellIn--;

        if (sellIn < 0 && quality < 50) {
            quality++;
        }
    }

}
