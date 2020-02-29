//
//	Name:		Chen, Harrison
//	Project:	5
//	Due:		Wednesday May 15, 2019
//	Course:		CS-1400-02-Sp19
//
//	Description:
//			A demo to test the Ship superclass and the CruiseShip and CargoShip subclasses.

import java.util.Scanner;
import java.io.*;
public class ShipDemo
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("Welcom to Company by H. Chen");
		System.out.println();
		System.out.println("Ship name              Type");
		System.out.println("--------------------   ---------------");
		try{
			Scanner inFile = new Scanner(new File("myships.txt"));
               		String companyName = inFile.nextLine();
                	int numOfShip = inFile.nextInt();
			Ship[] shipInventory = new Ship[numOfShip];
                	for(int i = 0; i < numOfShip; i++){
                        	char shipType = inFile.next().charAt(0);
                        	String shipName = inFile.next();
                        	while(!inFile.hasNextInt()){
                                	shipName += " " + inFile.next(); 
                        	}
                        	String shipYearBuilt = inFile.next();
                        	switch(shipType){
                                	case 'c':
                                        	int numOfPassenger = inFile.nextInt();
                                        	shipInventory[i] = new CruiseShip(shipName, shipYearBuilt, numOfPassenger);
                                        	break;
                                	case 'C':
                                        	int capacity = inFile.nextInt();
                                        	shipInventory[i] = new CargoShip(shipName, shipYearBuilt, capacity);
                                        	break;
                                	default:
                                        	System.out.println("unknow type of ship" + shipType);
                                        	System.exit(1);
                        	}
                	}
			for(int i = 0; i < shipInventory.length; i++){
                        	System.out.println(shipInventory[i]);
                	}
			System.out.println();
			System.out.println("Total Ships = " + shipInventory.length);
			System.out.println("Total Passenger = " + CruiseShip.totalMaxPassenger);
			System.out.println("Total Tonage = " + CargoShip.totalCapacity);
		}catch(FileNotFoundException e){
			System.err.println("File not found.");
			System.exit(1);
		}catch(Exception e){
			System.err.println("Error:" + e.getMessage());
			System.exit(1);
		}
	}
}

