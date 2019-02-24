package com.gildedrose.items;

public class Item {

    protected String name;
    protected int sellIn;
    protected int quality;

    //Made it protected so we use the new Factory
    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    public void updateQuality() {
        //default treatment

        if(quality > 0) {
            quality--;
        }

        sellIn--;

        if(sellIn < 0 && quality > 0) {
            quality--;
        }

    }

}
