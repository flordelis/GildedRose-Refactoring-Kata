package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ItemWrapper item = new ItemWrapper(items[i]);           
            updateQuality(item);
            updateSellIn(item);
            handlePastSellIn(item);            
        }
    }

    public void updateSellIn(ItemWrapper item){
        if (!item.hasName("Sulfuras, Hand of Ragnaros")) {
            item.decreaseSellIn();
        }
    }

    public void updateQuality(ItemWrapper item) {
        if (!item.hasName("Aged Brie")
                && !item.hasName("Backstage passes to a TAFKAL80ETC concert")) {
            if (!item.hasName("Sulfuras, Hand of Ragnaros")) {
                item.decreaseQuality();
            }    
        } else {
            if (item.getQuality() < 50) {
                item.increaseQuality();

                if (item.hasName("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.getSellIn() < 11) {
                        item.increaseQuality();
                    }
                    if (item.getSellIn() < 6) {
                        item.increaseQuality();
                    }
                }
            }  
        }
    }

    public void handlePastSellIn( ItemWrapper item) {
        if (item.getSellIn() < 0) {
            if (!item.hasName("Aged Brie")) {
                if (!item.hasName("Backstage passes to a TAFKAL80ETC concert")) {
                    if (!item.hasName("Sulfuras, Hand of Ragnaros")) {
                        item.decreaseQuality();
                    }                        
                } else {
                    item.reinicializaQuality();
                }
            } else {
                item.increaseQuality();
            }
        }
    }   
}