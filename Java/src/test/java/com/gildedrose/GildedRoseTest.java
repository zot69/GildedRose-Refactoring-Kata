package com.gildedrose;

import com.gildedrose.items.Item;
import com.gildedrose.items.ItemFactory;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQuality() throws Exception {

        //Test re-written in order to have a full coverage of the existing code, allowing further refactoring without regressions.
        //I proceed with test coverage tool of the IDE and then by doing some mutation try/error until I get 100% success of this test.

        //Uses CombinationApprovals to avoid writing 50 tests methods and because we can be confident in this code (functional).

        CombinationApprovals.verifyAllCombinations(
                this::executeUpdateQuality,
                new String[]{"Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros", "Another item"},
                new Integer[]{0, 11, -1, 6, 3},
                new Integer[]{0, 2, 50, 49});
    }

    private String executeUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { ItemFactory.create(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.getItems()[0].toString();
    }

}
