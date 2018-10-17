package com.gildedrose;

public class CommonsItemRule implements UpdateQualityRule {

    @Override
    public void updateSellIn(ItemWrapper item) {
        item.decreaseSellIn(); 
    }

    @Override
    public void updateQuality(ItemWrapper item) {    
        item.decreaseQuality();       
    }

    @Override
    public void handlePastSellIn(ItemWrapper item) {
        if(item.getSellIn() < 0) {
            item.decreaseQuality();
        }
    }

}