//
//	Name:		Chen, Harrison
//	Project:	4
//	Due:		Friday April 22, 2019
//	Course:		cs-1400-03-SP19
//
//	Description:
//			Read information about elements in the periodic table
//			and allow user to query information in the Periodic Table via a menu system.

import java.util.Scanner;
import java.io.*;

public class PeriodicTableApp
{
	private static PeriodicTable periodicTable;

	public static void print(){
		periodicTable.printTable();
	}

	public static Element findAtomicNumber(int atomicNumber){
		int elementLocation = periodicTable.findAtomicNumber(atomicNumber);
		if(elementLocation == -1){
			System.err.println("Cannot find atomic number:" + atomicNumber);
			System.exit(1);
		}
		return periodicTable.getElement(elementLocation);
	}

	public static Element findSymbol(String symbol){
		int elementLocation = periodicTable.findSymbol(symbol);
		if(elementLocation == -1){
                        System.err.println("Cannot find element symbol:" + symbol);
                        System.exit(1);
                }
                        return periodicTable.getElement(elementLocation);
	}

	public static Element findName(String name){
		int elementLocation = periodicTable.findName(name);
		if(elementLocation == -1){
                        System.err.println("Cannot find element name:" + name);
                        System.exit(1);
                }
                        return periodicTable.getElement(elementLocation);
	}

	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		periodicTable = new PeriodicTable();
		System.out.println("Periodic Table by H. Chen");
                System.out.println();
                System.out.println(periodicTable.getNumberOfElements() + " elements");
                System.out.println();
		if(args.length > 0){
			switch(args[0]){
				case "print":
					print();
					break;
				case "number":
					try{
						System.out.println(findAtomicNumber(Integer.parseInt(args[1])));
					}catch (NumberFormatException e){
						System.err.println("Argument" + args[1] + "must be an integer");
					}
					break;
				case "symbol":
					System.out.println(findSymbol(args[1]));
					break;
				case "name":
					System.out.println(findName(args[1]));
					break;
			}
		}else{
			char optionSelected;
			do{
				System.out.println("P - Print table");
				System.out.println("A - Search atomic number");
				System.out.println("S - Search symbol");
				System.out.println("N - Search name");
				System.out.println("T - Print table sorted by name");
				System.out.println("Q - Quit");
				System.out.println();
				System.out.print("Select? ");
				optionSelected = keyboard.next().toUpperCase().charAt(0);
				switch(optionSelected){
					case 'P':
						periodicTable.printTable();
						break;
					case 'A':
						System.out.print("Enter the atomic number to search? ");
						int atomicNumber = keyboard.nextInt();
						System.out.println(findAtomicNumber(atomicNumber));
						break;
					case 'S':
						System.out.print("Enter the symbol to search? ");
						String symbol = keyboard.next();
						System.out.println(findSymbol(symbol));
						break;
					case 'N':
						System.out.println("Enter the name to search? ");
						String name = keyboard.next().toLowerCase();
						System.out.println(findName(name));
						break;
					case 'T':
						//Sort
						//Print Table
						System.out.println("Sorted Table");
						break;
				}
			}while(optionSelected != 'Q');
		}
	}
}
