package com.gildedrose;

public class ItemWrapper {

    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public void increaseQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    public void decreaseQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }           
    }

    public void decreaseSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    public boolean hasName(String name) {
       return item.name.equals(name);
    }

    public void reinicializaQuality() {
       item.quality = item.quality - item.quality;
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public int getQuality () {
        return item.quality;
    }

    public String getName () {
        return item.name;
    }

}