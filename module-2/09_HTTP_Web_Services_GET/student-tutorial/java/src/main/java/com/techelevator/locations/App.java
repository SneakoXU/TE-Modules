package com.techelevator.locations;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Location;
import com.techelevator.services.ConsoleService;
import com.techelevator.services.LocationService;

public class App {

  private static final String API_URL = "http://localhost:3000/locations";

  public static void main(String[] args) {
	  run();
  }
  
  private static void run() {
	  
	
	ConsoleService consoleService = new ConsoleService();
	LocationService locationService = new LocationService(API_URL);
//	Scanner scanner = new Scanner (System.in);
	int menuSelection = 999;
//	menuSelection = consoleService.printMainMenu();
	
	
      while (menuSelection != 0) {
    	  menuSelection = consoleService.printMainMenu();
          if (menuSelection == 1) {
            // TODO: list all locations
        	  System.out.println("WUT");
        	 consoleService.printLocations(locationService.getAll()); 
          } else if (menuSelection == 2) {
            // TODO: get one location

          } else if (menuSelection == 0) {
            // exit
            consoleService.exit();
          } else {
            // defensive programming: anything else is not valid
            System.out.println("Invalid Selection");
          }
        }
//      scanner.close();
      System.exit(0);
  }

}
