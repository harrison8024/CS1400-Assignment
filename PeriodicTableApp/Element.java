//
//	Name:		Chen, Harrison
//	Project:	4
//	Due:		Friday April 22, 2019
//	Course:		cs-1400-03-SP19
//
//	Description:
//			A class called Element, that stores the element's properties.
public class Element
{
	private int atomicNumber;
	private String name;
	private String symbol;
	private double atomicMass;

	public Element(int atomicNumber, String name, String symbol, double atomicMass){
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;
		this.atomicMass = atomicMass;
	}

	public int getAtomicNumber(){
		return atomicNumber;
	}

	public String getName(){
		return name;
	}

	public String getSymbol(){
		return symbol;
	}

	public double getAtomicMass(){
		return atomicMass;
	}

	@Override
	public String toString(){
		return String.format("%4d %-20s %-3s %7.2f", atomicNumber, name, symbol, atomicMass);
	}
}
