package fr.andrew;

import java.util.Scanner;

public class carre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nombreEtoileParCote = 0;

	/*
	  	System.out.println("nombreEtoileParCote");
		nombreEtoileParCote = sc.nextInt();
		
		for(int j = 0 ; j < nombreEtoileParCote ; j++){
			System.out.println();
			for(int i = 0 ; i < nombreEtoileParCote ; i++) {
				System.out.print("* ");
			}
		}
		*/
		
		System.out.println("nombreEtoileParCote");
		nombreEtoileParCote = sc.nextInt();;

		for(int i = 0 ; i < nombreEtoileParCote; i++) {
			for(int j = 0 ; j < nombreEtoileParCote; j++) {
				if(i == 0 || i ==(nombreEtoileParCote - 1) || j == 0 || j == (nombreEtoileParCote-1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();			
		}
	}
}