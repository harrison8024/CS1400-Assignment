//
//      Name:           Chen, Harrison
//      Project:        5
//      Due:            Wednesday May 15, 2019
//      Course:         CS-1400-02-Sp19
//
//      Description:
//                      A class for Cruise ship, extended from ship, that adds the maximum number of passenger.

public class CruiseShip extends Ship
{
	private int maxNumOfPassenger;
	public static int totalMaxPassenger;

	public CruiseShip(String name, String year, int maxNum){
		super(name, year);
		setMaxNumOfPassenger(maxNum);
	}

	public void setMaxNumOfPassenger(int maxNum){
		totalMaxPassenger += (maxNum - maxNumOfPassenger);	//subtract the original number then add the new number passenger.
		maxNumOfPassenger = maxNum;
	}

	public int getMaxNumOfPassenger(){
		return maxNumOfPassenger;
	}

	@Override
	public String toString(){
		return String.format("%-20s   Cruise:%d", super.getName(), getMaxNumOfPassenger());
	}
}
