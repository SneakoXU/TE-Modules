package com.techelevator.model.jdbc;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
//import org.apache.commons.dbcp2.BasicDataSource;

import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCCatCardDAO implements CatCardDAO {

	//private BasicDataSource catDataSource;
	private JdbcTemplate jdbcTemplate;
	private Logger log = LoggerFactory.getLogger(getClass());

	public JDBCCatCardDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<CatCard> list() {
		List<CatCard> catCards = new ArrayList<>();
		String sql = "SELECT id, img_url, fact, caption FROM catcards ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			CatCard card = mapRowToCard(results);
			catCards.add(card);
		}
		return catCards;
	}

	@Override
	public CatCard get(long id) {
		CatCard card = null;
		String sql = "SELECT id, img_url, fact, caption FROM catcards WHERE id = ? ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,id);
		if(results.next()) {
			card = mapRowToCard(results);
		} else {
			throw new CatCardNotFoundException();
		}

		return card;
	}
	
	@SuppressWarnings("null")
	@Override
	public CatCard getRandom(CatPicService catPicService, CatFactService catFactService) {
		//String sql = "SELECT img_url, fact FROM catcards WHERE img_url = ? AND fact = ?";
		CatCard card = null;
		//CatFact catFact = new CatFact();
		
		//CatPic catPic = new CatPic();
		//SqlRowSet result = jdbcTemplate.queryForRowSet(sql, catPic.getFile(), catFact.getText());
		//if(result != null) {
			//card = mapRowToCard(result);
		//}else {
		//	throw new CatCardNotFoundException();
		//}
		//catFact.toString();
		card.setCatFact(catFactService.toString());
		card.setImgUrl(catPicService.toString());
		

		return card;
	}

	@Override
	public boolean update(long cardId, CatCard changedCard) {
		String sql = "UPDATE catcards SET img_url = ?, fact = ?, caption = ? WHERE id = ? ";
		return jdbcTemplate.update(sql, changedCard.getImgUrl(), changedCard.getCatFact(), changedCard.getCaption(), cardId) == 1;
	}

	@Override
	public boolean delete(long id) {
		String sql = "DELETE FROM catcards WHERE id = ? ";
		return jdbcTemplate.update(sql, id) == 1;
	}

	@Override
	public boolean save(CatCard card) {
		String sql = "INSERT INTO catcards (id, img_url, fact, caption) VALUES (DEFAULT, ?, ?, ?)";
		return jdbcTemplate.update(sql,card.getImgUrl(),card.getCatFact(),card.getCaption()) == 1;
	}

	private boolean exists(long id) {
		return jdbcTemplate.queryForObject("select * from catcards where id = ?", new Object[]{id}, boolean.class);
	}
	
	private CatCard mapRowToCard(SqlRowSet rs) {
		CatCard cc = new CatCard();
		cc.setCatCardId(rs.getLong("id"));
		cc.setCatFact(rs.getString("fact"));
		cc.setImgUrl(rs.getString("img_url"));
		cc.setCaption(rs.getString("caption"));
		return cc;
	};

}
