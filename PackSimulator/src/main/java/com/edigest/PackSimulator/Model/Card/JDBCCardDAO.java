package com.edigest.PackSimulator.Model.Card;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCCardDAO { //implements CardDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCCardDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Card getCardByRarityAndSet(String rarity, String setName) {
		Card card = new Card();
		String sqlSelectAllCards = "SELECT * from card WHERE rarity = ? AND setname = ? ORDER BY RANDOM() LIMIT 1;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllCards, rarity, setName);
		while (results.next()) {
			card = mapRowToCard(results);
		}
		return card;
	}

	
	private Card mapRowToCard(SqlRowSet results) {
		Card theCard = new Card();
		
		theCard.setName(results.getString("cardname"));
		theCard.setRarity(results.getString("rarity"));
		theCard.setSetName(results.getString("setname"));
		
		return theCard;
	}
	

}
