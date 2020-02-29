//
//	Name:		Chen, Harrison
//	Project:	1
//	Due:		Friday February 15, 2019
//	Course:		cs-1400-03-sp19
//
//	Description:
//			Calculates Quaratic Equation


import java.util.Scanner;

public class QuadraticEquation
{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("H. Chen's Quadratic Equation Solver");
		System.out.println();
		System.out.print("Enter values for a b c?");
		int a, b, c;
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		System.out.println();
		double discriminant;
		if(a == 0){
			System.out.println("Not a Quadratic equation.");
		}else{
			discriminant = b*b - 4*a*c;
			if(discriminant < 0){
				System.out.println("Roots are imaginary.");
			}else{
				double x1, x2;
				x1 = (Math.sqrt(discriminant) * 1 - b)/2.0/a;
				x2 = (Math.sqrt(discriminant) * -1 - b)/2.0/a;
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}		
	}
}
