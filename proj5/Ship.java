//
//	Name:		Chen, Harrison
//	Project:	5
//	Due:		Wednesday May 15, 2019
//	Course:		CS-1400-02-Sp19
//
//	Description:
//			A class for ship, which stores the name of the ship and the year that the ship is built.

public abstract class Ship
{
	private String name;
	private String year;

	public Ship(String name, String year){
		setName(name);
		setYear(year);
	}

	public void setName(String name){
		this.name = name;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getName(){
		return name;
	}

	public String getYear(){
		return year;
	}

	@Override
	public String toString(){
		return String.format("%-20s Year:%s", name, year);
	}
}
