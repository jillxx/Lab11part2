/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Jiao Xu
*           *****           # Date: 5/7/2018
*            ***            # Project Name: Lab 11 part2
*             *             # Description: Here is my Car List program.
*                           ====================================================
 */
package com.cars.gc;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		int carNum = 0;

		// creat inventory arrayList
		ArrayList<NewCar> inventory = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		inventory.add(new NewCar("Nikolai", "Model S", 2017, 54999.90));
		inventory.add(new NewCar("Fourd", "Escapade", 2017, 31999.90));
		inventory.add(new NewCar("Chewie", "Vette", 2017, 44989.95));
		inventory.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		inventory.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
		inventory.add(new UsedCar("GC", "Witherell", 2016, 14450.00, 3500.3));

		/*
		 * // taking the number of cars carNum = Validator.getInt(scan,
		 * "How many cars are you entering: ");
		 * 
		 * // adding informations for each car into the inventory for (int i = 1; i <=
		 * carNum; i++) { NewCar thisCar = new NewCar();
		 * thisCar.setMake(Validator.getString(scan, "Enter Car #" + i + " Make: "));
		 * 
		 * thisCar.setModel(Validator.getString(scan, "Enter Car #" + i + " Model: "));
		 * 
		 * thisCar.setYear(Validator.getInt(scan, "Enter Car #" + i + " Year: "));
		 * 
		 * thisCar.setPrice(Validator.getDouble(scan, "Enter Car #" + i + " Price: "));
		 * System.out.println();
		 * 
		 * inventory.add(thisCar);
		 * 
		 * }
		 */

		// show the result inventory in format
		while (inventory.size() != 0) {
			System.out.println("Current Inventory:");

			for (int i = 0; i < inventory.size(); i++) {
				System.out.print((i + 1) + ". ");
				System.out.println(inventory.get(i));
			}
			System.out.println(inventory.size() + 1 + ". Quit");

			// prompt user to chose a car
			int choic = Validator.getInt(scan, "\nWhat car would you like? ");

			if (choic != inventory.size() + 1) {// condition on if the user chose to quit
				System.out.println(inventory.get(choic - 1));

			} else {
				break;//if the user chose quit number
			}

			// prompt user to make a decision on buying the chosen car
			String decision = Validator.getString(scan, "Would you like to buy this car? ");
			if (decision.equalsIgnoreCase("y")) {
				System.out.println("Excellent! Our finance department will be in touch shortly.");
				System.out.println();

				// remove the chosen car from inventory
				inventory.remove(choic - 1);
			} else {
				break;
			}

		}
		System.out.println("Have a great day!");

		scan.close();
	}
}
