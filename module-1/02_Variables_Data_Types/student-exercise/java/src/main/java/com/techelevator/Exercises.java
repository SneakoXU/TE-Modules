package com.techelevator;

import java.util.PrimitiveIterator.OfDouble;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int numberOfRaccoons = 3;
		int raccoonsGoHome = 2;
		int raccoonsLeft = numberOfRaccoons - raccoonsGoHome;
		System.out.println(raccoonsLeft);
		
		

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int diffFlowersBees = numberOfFlowers - numberOfBees;
		System.out.println(diffFlowersBees);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int pigeonsEatingBreadcrumbs = lonelyPigeon + anotherPigeon;
		System.out.println(pigeonsEatingBreadcrumbs);
		
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		
		int owlsOnFence = 3;
		owlsOnFence += 2;

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int beaversWorking = 2;
		int beaversSwimming = 1;
		beaversWorking = beaversWorking - beaversSwimming;
		System.out.println(beaversWorking);

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		
		int toucansOnTree = 2;
		toucansOnTree += 1;
		System.out.println(toucansOnTree);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int squirrelsInATree = 4;
		int numberOfNuts = 2;
		int diffSquirrelsAndNuts = squirrelsInATree - numberOfNuts;
		System.out.println(diffSquirrelsAndNuts);
		

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		double valueOfQuarter = .25;
		double valueOfDime = .10;
		double valueOfNickel = .05;
		double totalValue = valueOfQuarter + valueOfDime + (2 * valueOfNickel);
		System.out.println(totalValue);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		
		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffinsMade = brierMuffins + macadamsMuffins + flanneryMuffins;
		System.out.println(totalMuffinsMade);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		double priceOfYoyo = .24;
		double priceOfWhistle = .14;
		double totalSpent = priceOfYoyo + priceOfWhistle;
		System.out.println(totalSpent);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int totalLargeMarshmallows = 8;
		int totalMiniMarshmallows = 10;
		int totalMarshmallowsUsed = totalLargeMarshmallows + totalMiniMarshmallows;
		System.out.println(totalMarshmallowsUsed);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int inchesOfSnowAtHilt = 29;
		int inchesOfSnowAtBrecknock = 17;
		int diffInSnow = inchesOfSnowAtHilt - inchesOfSnowAtBrecknock;
		System.out.println(diffInSnow);

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		double totalMoney = 10.00;
		double toyTruckTotal = 3.00;
		double pencilTotal = 2.00;
		double moneyLeft = totalMoney - (toyTruckTotal + pencilTotal);
		System.out.println(moneyLeft);
		

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		
		int totalMarbles = 16;
		int lostMarbles = 7;
		totalMarbles -= lostMarbles;
		System.out.println(totalMarbles);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int seashellsOwned = 19;
		int seashellGoal = 25;
		int shellsToReachGoal = seashellGoal - seashellsOwned;
		System.out.println(shellsToReachGoal);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println(greenBalloons);

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int totalBooks = 38;
		totalBooks += 10;
		System.out.println(totalBooks);
		

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		
		int numberOfLegs = 6;
		int totalBees = 8;
		int totalLegs = numberOfLegs * totalBees;
		System.out.println(totalLegs);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		double costOfIceCreamCone = .99;
		double numOfCones = 0;
		double costOfTwoCones = numOfCones * costOfIceCreamCone;
		System.out.println(costOfTwoCones);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		
		int rocksForBorder = 125;
		int totalRocksOwned = 64;
		int rocksStillNeeded = rocksForBorder - totalRocksOwned;
		System.out.println(rocksStillNeeded);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		int hiltMarbles = 38;
		hiltMarbles -= 15;

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		
		int milesToConcert = 78;
		int milesDriven = 32;
		int milesLeft = milesToConcert - milesDriven;
		System.out.println(milesLeft);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int shovelSatMorning = 90;
		int shovelSatAfternoon = 45;
		int totalSatShovelTime = shovelSatMorning + shovelSatAfternoon;
		System.out.println(totalSatShovelTime + " minutes");

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		
		int hotDogsBought = 6;
		double costOfHotDogs = .50;
		double totalPaidForHotDogs = hotDogsBought * costOfHotDogs;
		System.out.println(totalPaidForHotDogs);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		
		double moneyInPocket = .50D;
		double costOfPencil = .07D;
		double pencilsCanBuyDec = moneyInPocket/costOfPencil;
		int pencilsCanBuy = (int) pencilsCanBuyDec;
		//System.out.format("%.2f%n", pencilsCanBuy);
		System.out.println(pencilsCanBuy);
		

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int butterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = butterfliesSeen - orangeButterflies;
		System.out.println(redButterflies);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double totalKateMoney = 1.00;
		double costOfCandy = .54;
		double totalChange = totalKateMoney - costOfCandy;
		System.out.println(totalChange);
		
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int totalTreesInBackyard = 13;
		totalTreesInBackyard += 12;
		System.out.println(totalTreesInBackyard);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int daysUntilGrandma = 2;
		int hoursInADay = 24;
		int hoursUntilGrandma = daysUntilGrandma * hoursInADay;
		System.out.println(hoursUntilGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		
		int numberOfCousins = 4;
		int piecesOfGum = 5;
		int totalGumNeeded = numberOfCousins * piecesOfGum;
		System.out.println(totalGumNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		double danMoney = 3.00;
		double priceCandyBar = 1.00;
		double moneyRemaining = danMoney - priceCandyBar;
		System.out.format("$%.2f%n", moneyRemaining);
		
		

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		
		int boatsOnLake = 5;
		int peopleOnBoat = 3;
		int totalPeople = boatsOnLake * peopleOnBoat;
		System.out.println(totalPeople);
		

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int ellenLegos = 380;
		int legosLost = 57;
		int legosLeft = ellenLegos - legosLost;
		System.out.println(legosLeft);
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		
		int muffinsArthur = 35;
		int muffinsGoal = 83;
		int muffinsTo83 = muffinsGoal - muffinsArthur;
		System.out.println(muffinsTo83);
		

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		
		int crayonsWilly = 1400;
		int crayonsLucy = 290;
		int diffCrayonsWillyLucy = crayonsWilly - crayonsLucy;
		System.out.println(diffCrayonsWillyLucy);
		

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;
		System.out.println(totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int totalCupcakes = 96;
		int numberOfChildren = 8;
		int cupcakesPerChild = totalCupcakes / numberOfChildren;
		System.out.println(cupcakesPerChild);
		

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		
		int madeCookies = 47;
		int cookiesPerJar = 6;
		int cookiesNotInJar = madeCookies%cookiesPerJar;
		System.out.println(cookiesNotInJar);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		
		int croissants = 59;
		int numberOfNeighbors = 8;
		int croissantsLeft = croissants % numberOfNeighbors;
		System.out.println(croissantsLeft);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int cookiesPerTray = 12;
		int totalCookies = 276;
		int numberOfTraysNeeded = totalCookies/cookiesPerTray;
		System.out.println(numberOfTraysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		
		int totalPretzels = 480;
		int servingPretzels = 12;
		int totalServingsMade = totalPretzels/servingPretzels;
		System.out.println(totalServingsMade);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		
		int lemonCupcakes = 53;
		lemonCupcakes -= 2;
		int cupcakesPerBox = 3;
		int numberOfBoxes = lemonCupcakes/cupcakesPerBox;
		System.out.println(numberOfBoxes);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		
		int totalCarrots = 74;
		int numberOfPeople = 12;
		int carrotsUneaten = totalCarrots%numberOfPeople;
		

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int totalTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int totalShelvesFilled = totalTeddyBears / teddyBearsPerShelf;
		System.out.println(totalShelvesFilled);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int picturesPerAlbum = 20;
		int totalPictures = 480;
		int albumsNeeded = totalPictures / picturesPerAlbum;
		System.out.println(albumsNeeded);
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		
		int tradingCards = 94;
		int cardsPerBox = 8;
		int filledBoxes = tradingCards/cardsPerBox;
		int cardsInUnfilledBox = tradingCards%cardsPerBox;
		System.out.println(filledBoxes + " " + cardsInUnfilledBox);

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		
		int books = 210;
		int numberOfShelves = 10;
		int booksPerShelf = books / numberOfShelves;
		System.out.println(booksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		
		int croissantsBaked = 17;
		int guests = 7;
		int croissantsPerGuest = croissantsBaked/guests;
		System.out.println(croissantsPerGuest);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		
		int totalFeetPerRoom = 168;
		double billHourlyRate = 168/2.15;
		double jillHourlyRate = 168/1.90;
		double totalHourlyRate = billHourlyRate + jillHourlyRate;
		int numberOfRooms = 5;
		int totalFeetOfAllRooms = numberOfRooms*totalFeetPerRoom;
		double feetPerRoom = (double) totalFeetOfAllRooms;
		double timeToPaint = feetPerRoom/totalHourlyRate;
		System.out.println(timeToPaint);
		//System.out.format("%.2f" + " hours%n",timeToPaint);
		
		
		
		
		

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String firstName = "Niko";
		String lastName = "Suntay";
		String middleInitial = "M";
		String formalName = lastName + ", " + firstName + " " + middleInitial + ".";
		System.out.println(formalName);
		
		

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		
		double distanceNewYorkToChicago = 800;
		double distanceTravelled = 537;
		double percentTripCompleted = 100 * (distanceTravelled/distanceNewYorkToChicago);
		System.out.println(percentTripCompleted);
		int tripCastToInt = (int) percentTripCompleted;
		System.out.println(tripCastToInt);
		
		


	}

}
