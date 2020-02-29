
//
//	Name:		Chen, Harrison
//	Project:	4
//	Due:		Friday April 22, 2019
//	Course:		cs-1400-03-SP19
//
//	Description:
//			A class called PeriodicTable, which gets data and store it in an array, 
//			and be able to search and print data
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class PeriodicTable
{
	private Element[] elementArray;

	public PeriodicTable() throws IOException{
		loadTable();
	}

	public void loadTable() throws IOException{
		File periodicTableInfo = new File("/user/tvnguyen7/data/periodictable.dat");
        	Scanner inputFile = new Scanner(periodicTableInfo);
		ArrayList<Element> elementList = new ArrayList<Element>();
		int num;
		String name, sym;
		double mass;
		while(inputFile.hasNext()){
			num = inputFile.nextInt();
                        sym = inputFile.next();
                        mass = inputFile.nextDouble();
                        name = inputFile.next();
			elementList.add(new Element(num, name, sym, mass));
		}
		int numOfElements = elementList.size();
		elementArray = new Element[numOfElements];
		for(int i = 0; i < numOfElements; i++){
			elementArray[i] = elementList.get(i);
		}
	}

	public void printTable(){
		int numOfElements = elementArray.length;
		double totalMass = 0;
		double averageMass;
		System.out.printf("Periodic Table (%d)\n\n", numOfElements);
		System.out.println("ANo. Name                 Abr    Mass");
		System.out.println("---- -------------------- --- -------");
		for(int i = 0; i < numOfElements; i++){
			System.out.println(elementArray[i]);
			totalMass += elementArray[i].getAtomicMass();
		}
		averageMass = totalMass / numOfElements;
		System.out.printf("The average mass:             %6.2f\n", averageMass);
	}

	public int findAtomicNumber(int atomicNumber){
		int index = -1;
		for(int i = 0; i < elementArray.length; i++){
			if(elementArray[i].getAtomicNumber() == atomicNumber){
				index = i;
			}
		}
		return index;
	}

	public int findSymbol(String symbol){
		int i = 0;
		while(i < elementArray.length && !symbol.equalsIgnoreCase(elementArray[i].getSymbol())){
			i++;
		}
		return i < elementArray.length ? i : -1;
	}

	public int findName(String name){
		int i = 0;
		while(i < elementArray.length && !elementArray[i].getName().toLowerCase().startsWith(name)){
			i++;
		}
		return i < elementArray.length ? i : -1;
	}

	public int getNumberOfElements(){
		return elementArray.length;
	}

	public Element getElement(int index){
		return elementArray[index];
	}
}
