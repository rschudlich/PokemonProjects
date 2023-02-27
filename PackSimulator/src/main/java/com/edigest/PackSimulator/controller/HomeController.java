package com.edigest.PackSimulator.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edigest.PackSimulator.Model.Card.Card;
import com.edigest.PackSimulator.Model.Card.CardDAO;
import com.edigest.PackSimulator.Model.Pack.Pack;

@Controller
public class HomeController {
	
	@Autowired
	private CardDAO cardDao;

	@RequestMapping(path="/")
	public ModelAndView homePage(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(path="/pack", method=RequestMethod.GET)
	public String displayPackPage(@RequestParam(value = "packs", defaultValue = "Silver Tempest") String packName,@RequestParam(value = "quantity", defaultValue = "1") String packNum, ModelMap map) {
		Pack currentPack = new Pack();
		int packAmount = Integer.valueOf(packNum);
		List<String> cardList = new ArrayList<String>();
		currentPack.setName(packName);
		for (int i=0; i < packAmount; i++) {
			String rarity = currentPack.randomizeRarity(packName);
			// Once database connection is secure, we can delete the below line.
			cardList.add(currentPack.randomizeCard(rarity));
			Card cardByRarity = cardDao.getCardByRarityAndSet(rarity, packName);
			cardList.add(currentPack.randomizeCard(cardByRarity.getName()));
		}
		map.put("packName", packName);
		map.put("cardList", cardList);
		return "home";
	}
	
	
	  
}
