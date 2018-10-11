package fr.andrew;

import java.util.Scanner;

import fr.andrew.deviner.Deviner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int nombreUtilisateur = 0;
		
		Deviner deviner = new Deviner();
		deviner.setNombreUtilisateur(nombreUtilisateur);
		deviner.setSupinf100(false);
		
		System.out.println("Entrez un nombre entre 0 et 100");

		do {
			nombreUtilisateur = sc.nextInt();
			deviner.verificationNombreUtilisateur(nombreUtilisateur);
			if(nombreUtilisateur < 0 || nombreUtilisateur > 100) {
				System.out.println("Entrez une valeur entre 0 et 100");
				deviner.setSupinf100(true);		
			}else if(deviner.verificationFalse()){
				deviner.setSupinf100(false);
			}
		}while(deviner.verificationFalse() || deviner.verificationsupinf100());
		
		sc.close();
	}
}
