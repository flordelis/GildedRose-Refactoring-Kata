package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQuality_forSulfuraItem() {
        Item[] items = new Item[] {  new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    public void updateQuality_forAgedBrie() {
        Item[] items = new Item[] {  new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
    }

}
