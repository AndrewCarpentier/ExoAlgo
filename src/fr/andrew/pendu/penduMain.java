package fr.andrew.pendu;

import java.util.Scanner;

public class penduMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String mot = "bonjour";
		int lettreTrouver = 0;
		boolean lettreDejaUtiliser = false;
		int erreur = 0;
		int x = 0;
		char [] tableau = new char[mot.length()];
		char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [] lettreUtiliser = new char [alphabet.length];
		
		System.out.println("entrez votre mot");
		mot = sc.next().toLowerCase();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	do {
		if(erreur < 11) {
			System.out.println("Entrez une lettre");
			String lettre = sc.next();		
			lettreDejaUtiliser = true;
			for(int j = 0 ; j < alphabet.length; j++) {
				if(lettre.toLowerCase().charAt(0) == lettreUtiliser[j]) {
					System.out.println("vous avez deja utiliser cette lettre");
					lettreDejaUtiliser = false;
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}
				
				if(lettre.toLowerCase().charAt(0) == alphabet[j]) {
					lettreUtiliser[j] = lettre.toLowerCase().charAt(0);
				}			
			}
			if(lettreDejaUtiliser){
				x = 0;
				for(int i = 0; i < mot.length() ; i++) {			
					System.out.print("*");
					if(lettre.toLowerCase().charAt(0) == mot.charAt(i)) {
						lettreTrouver++;
						x++;
						tableau[i] = lettre.toUpperCase().charAt(0);						
					}
					
				}
				if(x == 0) {
					erreur++;
				}
				System.out.println();
				System.out.println();
				System.out.println(tableau);	
				
				if(lettreTrouver == mot.length()) {					
					System.out.println("Bravo vous avez trouver le mot avec " +erreur+ " erreur");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}else {
					System.out.println();
					System.out.println("----Erreur----");
					System.out.println(erreur);
					System.out.println("----Lettre Trouver----");
					System.out.println(lettreUtiliser);
					System.out.println("\n\n\n\n\n\n\n\n");
				}					
			}
		}else {
			System.out.println("Vous avez perdu");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			break;
		}
		
	}while(lettreTrouver < mot.length());
			
		
		sc.close();
	}

}
