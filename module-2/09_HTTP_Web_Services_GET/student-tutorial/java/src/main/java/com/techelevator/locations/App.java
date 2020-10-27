package com.techelevator.locations;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Location;
import com.techelevator.services.ConsoleService;
import com.techelevator.services.LocationService;

public class App {

  private static final String API_URL = "http://localhost:3000/locations";

  public static void main(String[] args) {
    //int menuSelection = 999;

    ConsoleService consoleService = new ConsoleService();
    LocationService locationService = new LocationService("http://localhost:3000/locations/");
    int menuSelection = 0;
    Scanner scanner = new Scanner(System.in);
    consoleService.printMainMenu();
    try {
      menuSelection = Integer.parseInt(scanner.nextLine());
      while (menuSelection != 0) {
    	     
          if (menuSelection == 1) {
            // TODO: list all locations
        	  
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
    } catch (NumberFormatException exception) {
      System.out.println("Error parsing the input for menu selection.");
    }
    System.out.println("");
    
    
    
   // menuSelection = Integer.parseInt(scanner.nextLine());



  }

}
