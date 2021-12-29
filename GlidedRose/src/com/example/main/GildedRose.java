package com.example.main;

public class GildedRose {
	
	 Item[] items;
	 public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
	 public final static String BRIE = "Aged Brie";
	 public final static String BACKSTAGE_PASSES_ITEM = "Backstage passes to a TAFKAL80ETC concert";
	 public final static String CONJURED_ITEM = "Conjured";

	    public GildedRose(Item[] items) {
	        this.items = items;
	    }

	    public void updateQuality() {
	        for (Item item: items) {
	            if (!item.name.equals(BRIE)
	                    && !item.name.equals(BACKSTAGE_PASSES_ITEM)) {
	                if (checkGreaterThan0Quantity(item)) {
	                    if (!item.name.equals(SULFURAS)) {
	                        decreaseQuality(item);
	                    }
	                }
	            } else {
	                if (checkLessThan50Quantity(item)) {
	                	increaseQuality(item);

	                    if (item.name.equals(BACKSTAGE_PASSES_ITEM)) {      
	                        if (item.sellIn < 11) {
	                            if (checkLessThan50Quantity(item)) {
	                            	increaseQuality(item);
	                            }
	                        }
	                    }
	                }
	            }

	            if (!item.name.equals(SULFURAS)) {
	                item.sellIn = item.sellIn - 1;
	            }

	            if (item.sellIn < 0) {
	                if (!item.name.equals(BRIE)) {
	                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
	                        if (checkGreaterThan0Quantity(item)) {
	                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
	                                decreaseQuality(item);
	                            }
	                        }
	                    } else {
	                        item.quality = item.quality - item.quality;
	                    }
	                } else {
	                    if (checkLessThan50Quantity(item)) {
	                    	increaseQuality(item);
	                    }
	                }
	            }
	        }
	    }
	    
	    public void increaseQuality(Item item) {
	    	item.quality = item.quality + 1;
	    }
	    
	    public void decreaseQuality(Item item) {
	    	item.quality = item.quality - 1;
	    }
	    
	    public boolean checkLessThan50Quantity(Item item) {
	    	return item.quality < 50;
	    }
	    
	    public boolean checkGreaterThan0Quantity(Item item) {
	    	return item.quality > 0;
	    }
	    
	    public boolean name(String name) {
	    	nameFactory nF = new nameFactory();
	    	nameInteface nIf = nF.getInstance();
	    	boolean flag = nIf.checkName(name);
	    	return true;
	    }

}
