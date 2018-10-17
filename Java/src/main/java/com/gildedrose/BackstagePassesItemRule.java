package com.gildedrose;

public class BackstagePassesItemRule extends AgedItemRule {

    @Override
    public void updateQuality(ItemWrapper item) {
        super.updateQuality(item);
        if (item.getSellIn() < 11) {
            item.increaseQuality();
        }
        if (item.getSellIn() < 6) {
            item.increaseQuality();
        }
    }

    @Override
    public void handlePastSellIn(ItemWrapper item) {       
        if (item.getSellIn() < 0) {
            item.reinicializaQuality();
        } 
    }

}