package ecp;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		System.out.println("enter number of stars");
		Scanner scan = new Scanner(System.in);
		int numStars = scan.nextInt();
		// TODO Auto-generated method stub
		for(int i=0; i<=numStars; i++) {
			for(int j=0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		for(int i=numStars-1; i>=0; i--) {
			for(int j=0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}

}
