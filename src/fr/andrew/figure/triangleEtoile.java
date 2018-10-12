package fr.andrew.figure;

import java.util.Scanner;

public class triangleEtoile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		 
		int n;
		
		System.out.println("Entrez le nombre de ligne que vous voulez");
		n=in.nextInt();
		System.out.println();
		for(int i=0;i<=n;i++){
			for(int y=0;y<=(((n*2)-1)-(i+1));y++){
			System.out.print(" ");
			}
			for(int y=0;y<((i*2)+1);y++){
			System.out.print("*");
			}			
			System.out.println();
		}
				
		in.close();

	}

}
