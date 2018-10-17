package com.gildedrose;

public class ConjuredItemRule extends CommonsItemRule {

    @Override
    public void updateQuality(ItemWrapper item) {
        super.updateQuality(item);
        item.decreaseQuality();
    }
    
    @Override
    public void handlePastSellIn(ItemWrapper item) {}

}