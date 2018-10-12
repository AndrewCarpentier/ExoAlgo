package fr.andrew.figure;

import java.util.Scanner;

public class losange {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		 

		System.out.println("Entrez le nombre de ligne que vous voulez");
		int n=in.nextInt();
		System.out.println();
		

			for(int i=0;i<=n;i++){
				for(int y=0;y<=(((n*2)-1)-(i+1));y++){
				System.out.print("  ");
				}
				for(int y=0;y<((i*2)+1);y++){
				System.out.print(" *");
				}			
				System.out.println();
			}
			for(int i = n-1; i>=0;i--){
				for(int y=0;y<=(((n*2)-1)-(i+1));y++){
				System.out.print("  ");
				}
				for(int y=0;y<((i*2)+1);y++){
				System.out.print(" *");
				}		
				System.out.println();

				
		in.close();

			}
	}

}
