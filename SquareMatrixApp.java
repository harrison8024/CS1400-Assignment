//
//	Name:	 	Chen, Harrison
//	Homework:	5
//	Due:		Friday April 26, 2019
//	Course:		cs-1400-03-sp19
//
//	Description:
//			An app that is used to test class SquareMatrix.
//

public class SquareMatrixApp
{
	public static void main(String[] args){
		System.out.println("SquareMatrix Number by H.Chen");
		SquareMatrix m1 = new SquareMatrix(4); 
		SquareMatrix m2 = new SquareMatrix(4);
		m1.set(0, 0, 2); 		m1.get(0, 0);
		System.out.println(m1);
		m1.setIdentity();
		System.out.println(m1);
		m2.set(0, 0, 2);
		System.out.println(m2);
		SquareMatrix m3 = m1.multiply(m2);
		m1.print();
		boolean same = m1.equals(m2);
		if(same){
			System.out.println("m1 = m2");
		}else{
			System.out.println("m1 != m2");
		}
		System.out.println(m3);
		SquareMatrix m4 = new SquareMatrix(2);
		SquareMatrix m5 = new SquareMatrix(2);
		m4.set(0,0,1);
		m4.set(0,1,2);
		m4.set(1,0,3);
		m4.set(1,1,4);
		m5.set(0,0,2);
		m5.set(0,1,0);
		m5.set(1,0,1);
		m5.set(1,1,2);
		SquareMatrix m6 = m4.multiply(m5);
		m6.print();
		int[] a = m1.toArray();
	}
}
