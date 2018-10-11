package fr.andrew;

import java.util.Scanner;

public class comparaisonNombre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nombreUtilisateur = 0;

		
		System.out.println("Saisissez le nombre de nombre voulu");
		int nombreDeNombre = sc.nextInt();
			
		int nombrePlusPetit = Integer.MAX_VALUE;
		int nombrePlusGrand = Integer.MIN_VALUE;
		System.out.println("----");		
			for(int i = 0 ; i < nombreDeNombre; i++) {
				nombreUtilisateur = sc.nextInt();
				
				if(nombreUtilisateur < nombrePlusPetit) {
					nombrePlusPetit = nombreUtilisateur;
				}
				if(nombreUtilisateur > nombrePlusGrand) {
					nombrePlusGrand = nombreUtilisateur;
				}
			}
			System.out.println("nombre le plus petit " +nombrePlusPetit);
			System.out.println("nombre le plus grand " +nombrePlusGrand);
		
	sc.close();
	}

}
