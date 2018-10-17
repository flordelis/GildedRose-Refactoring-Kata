package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;

    Map<String, UpdateQualityRule> rules;

    public GildedRose(Item[] items) {
        this.items = items;
        rules = new HashMap<>();
        additionalRules();
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ItemWrapper item = new ItemWrapper(items[i]);
            UpdateQualityRule rule = createRule(item);
            rule.updateQuality(item);
            rule.updateSellIn(item);
            rule.handlePastSellIn(item);
         }
    }

    public UpdateQualityRule createRule( ItemWrapper item) {
        if(rules.containsKey(item.getName())) {
           return rules.get(item.getName());
        } 
        return new CommonsItemRule();
    }

    public void additionalRules() {
        rules.put("Sulfuras, Hand of Ragnaros", new LegenderyItemRule());
        rules.put("Aged Brie", new AgedItemRule());
        rules.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesItemRule());
        rules.put("Conjured Mana Cake", new ConjuredItemRule());
    }   
}
