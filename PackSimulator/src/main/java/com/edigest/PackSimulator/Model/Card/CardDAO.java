package com.edigest.PackSimulator.Model.Card;

public interface CardDAO {
	public Card getCardByRarityAndSet(String rarity, String setName);

}
