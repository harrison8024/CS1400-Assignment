
//
//      Name:           Chen, Harrison
//      Project:        5
//      Due:            Wednesday May 15, 2019
//      Course:         CS-1400-02-Sp19
//
//      Description:
//                      A class for Cargo ship, extended from ship, that adds the capacity in tons.

public class CargoShip extends Ship
{
	private int capacityInTons;
	public static int totalCapacity;

	public CargoShip(String name, String year, int capacity){
		super(name, year);
		setCapacity(capacity);
	}

	public void setCapacity(int capacity){
		totalCapacity += (capacity - capacityInTons);	//Subtract the original capacity then add the new capacity.
		capacityInTons = capacity;
	}

	public int getCapacity(){
		return capacityInTons;
	}

	@Override
	public String toString(){
		return String.format("%-20s   Cargo:%d", super.getName(), getCapacity());
	}
}
