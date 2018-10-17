package com.gildedrose;

public interface UpdateQualityRule {
    
    void updateSellIn(ItemWrapper item);
    void updateQuality(ItemWrapper item);
    void handlePastSellIn(ItemWrapper item);
}