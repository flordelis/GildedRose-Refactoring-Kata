package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQuality_forSulfuraItem() {
        Item[] items = new Item[] {  new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void updateQuality_forAgedBrieItem() {
        Item[] items = new Item[] {  new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }

    @Test
    public void updateQuality_forBackstagePassesItem_withSellInMaiorQueDez() {
        Item[] items = new Item[] {  new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
    }

    @Test
    public void updateQuality_forBackstagePassesItem_withSellInMenorIgualADez() {
        Item[] items = new Item[] {  new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
    }

    @Test
    public void updateQuality_forBackstagePassesItem_withSellInMenorIgualACinco() {
        Item[] items = new Item[] {  new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
    }

    @Test
    public void updateQuality_forBackstagePassesItem_withSellInVencido() {
        Item[] items = new Item[] {  new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }


    @Test
    public void updateQuality_forConguredItem() {
        Item[] items = new Item[] {  new Item("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }

    @Test
    public void updateQuality_forCommonsItem() {
        Item[] items = new Item[] {  new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
    }

    @Test
    public void updateQuality_forCommonsItem_withSellInVencido() {
        Item[] items = new Item[] {  new Item("+5 Dexterity Vest", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
    }



}
