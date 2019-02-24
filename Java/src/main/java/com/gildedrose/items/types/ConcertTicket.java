package com.gildedrose.items.types;

import com.gildedrose.items.Item;

public class ConcertTicket extends Item {

    public ConcertTicket(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality++;

            if (sellIn < 11 && quality < 50) {
                quality++;
            }

            if (sellIn < 6 && quality < 50) {
                quality++;
            }
        }

        sellIn--;

        if (sellIn < 0) {
            quality = 0;
        }
    }

}
