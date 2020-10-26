package com.techelevator.dao.jdbc;

import com.techelevator.dao.SiteDAO;
import com.techelevator.model.Park;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCSiteDAO implements SiteDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCSiteDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Site> getSitesThatAllowRVs(int parkId) {
    	List<Site> sitesThatAllowRVs = new ArrayList<>();
    	String sqlForSites = "SELECT * FROM site s JOIN campground c ON s.campground_id = c.campground_id JOIN park p ON c.park_id = p.park_id WHERE s.max_rv_length > 0 AND p.park_id = ?";
        SqlRowSet rows = jdbcTemplate.queryForRowSet(sqlForSites, parkId);
        while(rows.next()) {
    		Site site = mapRowToSite(rows);
    		sitesThatAllowRVs.add(site); 		
    	}
    	
    	return sitesThatAllowRVs;
    }
    
    @Override
    public List<Site> availableSitesByParkId(int parkId){
    	
    	List<Site> sitesAvailable = new ArrayList<>();
    	String sqlForSites = "SELECT * FROM site s LEFT OUTER JOIN reservation r ON s.site_id = r.site_id JOIN campground c ON s.campground_id = c.campground_id JOIN park p ON c.park_id = p.park_id WHERE r.site_id IS NULL AND p.park_id = ?";
    	SqlRowSet results = jdbcTemplate.queryForRowSet(sqlForSites, parkId);
    	while(results.next()) {
    		Site availSite = mapRowToSite(results);
    		sitesAvailable.add(availSite);
    	}
    	
    	return sitesAvailable;
    }
    
    @Override
    public List<Site> futureAvailableSites(int parkId, LocalDate fromDate, LocalDate toDate){
    	
    	List<Site> futureSites = new ArrayList<>();
    	String sqlForFutureSites = "SELECT * " + 
    			"FROM site s " + 
    			"        JOIN reservation r ON s.site_id = r.site_id " + 
    			"        JOIN campground c ON s.campground_id = c.campground_id " + 
    			"        JOIN park p ON c.park_id = p.park_id " +
    			"WHERE p.park_id = ? AND (r.from_date NOT BETWEEN ? AND ?) AND (r.to_date NOT BETWEEN ? AND ?) ";
    	SqlRowSet results = jdbcTemplate.queryForRowSet(sqlForFutureSites, parkId, fromDate,toDate, fromDate, toDate);
    	while(results.next()) {
    		Site futureAvailSite = mapRowToSite(results);
    		futureSites.add(futureAvailSite);
    	}
    	
    	
    	
    	return futureSites;
    	
    }

    private Site mapRowToSite(SqlRowSet results) {
        Site site = new Site();
        site.setSiteId(results.getInt("site_id"));
        site.setCampgroundId(results.getInt("campground_id"));
        site.setSiteNumber(results.getInt("site_number"));
        site.setMaxOccupancy(results.getInt("max_occupancy"));
        site.setAccessible(results.getBoolean("accessible"));
        site.setMaxRvLength(results.getInt("max_rv_length"));
        site.setUtilities(results.getBoolean("utilities"));
        return site;
    }
}
