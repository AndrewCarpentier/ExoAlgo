package fr.andrew.figure;

import java.util.Scanner;

public class triangleRectangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Entrez le nombre de ligne que vous voulez");
		n = sc.nextInt();
		System.out.println();
		
		for(int i = 0 ; i<=n ; i++) {
			for(int y=1;y<(i+1);y++){
				System.out.print(" " +y);
				}			
			System.out.println();
		}
		
		sc.close();		
	}
}
