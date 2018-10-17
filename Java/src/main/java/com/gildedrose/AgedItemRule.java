package com.gildedrose;

public class AgedItemRule extends CommonsItemRule {

    @Override
    public void updateQuality(ItemWrapper item) {
        item.increaseQuality();       
    }

    @Override
    public void handlePastSellIn(ItemWrapper item) {
        if (item.getSellIn() < 0) { 
            item.increaseQuality();
        }
    }

}