package fr.andrew;

import java.util.Scanner;

import fr.andrew.deviner.Deviner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deviner deviner = new Deviner();
		
		int nombreUtilisateur = 0;	
		
		System.out.println("Entrez un nombre entre 0 et 100");
		do {
			nombreUtilisateur = sc.nextInt();
			deviner.verificationNombreUtilisateur(nombreUtilisateur);
			deviner.verificationSupInf100(nombreUtilisateur);
		}while(deviner.verificationFalse() || deviner.verificationSupInf100False());
		
		sc.close();
	}
}
