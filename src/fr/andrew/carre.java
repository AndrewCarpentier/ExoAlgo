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
		
		for(int i = 0 ; i < nombreEtoileParCote ; i++) {
			if(i == 0){
				for(int j = 0; j < nombreEtoileParCote ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else if(i == (nombreEtoileParCote-1)) {
				for(int j = 0; j < nombreEtoileParCote ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else if( i != 0 || i != (nombreEtoileParCote-2)) {
				for(int j = 0; j < nombreEtoileParCote ; j++) {
					if(j == 0 || j == (nombreEtoileParCote-1)) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}					
				}
				System.out.println();
			}
		}
		
	}
}
