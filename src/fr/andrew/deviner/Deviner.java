package fr.andrew.deviner;

public class Deviner {
	
	private boolean faux = false;
	public int nbAleatoire = (int) (Math.random() * ( 0 + 100 )) ;	
	public int nombreUtilisateur;
	public boolean supinf100 = false;
	private int chanceUtiliser = 1;
	
	public Deviner() {
		super();
	}
	
	public Deviner(int nombreUtilisateur) {
		this.nombreUtilisateur = nombreUtilisateur;
	}
	
	public void verificationNombreUtilisateur(int nombreUtilisateur) {
			if(nombreUtilisateur < nbAleatoire) {
				System.out.println("C'est plus");
				faux = true;
				chanceUtiliser++;
			}else if(nombreUtilisateur > nbAleatoire) {
				System.out.println("C'est moins");	
				faux = true;
				chanceUtiliser++;
			}else {
				System.out.println("Bravo vous avez trouvez le nombre aleatoire en " +chanceUtiliser+ " tentative");
				faux = false;
			}
	}
	
	
	public boolean verificationFalse() {				
		return faux;
	}
	
	public boolean verificationsupinf100() {
		return supinf100;
	}
	
	//getter setter

	public int getNbAleatoire() {
		return nbAleatoire;
	}

	public void setNbAleatoire(int nbAleatoire) {
		this.nbAleatoire = nbAleatoire;
	}

	public int getNombreUtilisateur() {
		return nombreUtilisateur;
	}

	public void setNombreUtilisateur(int nombreUtilisateur) {
		this.nombreUtilisateur = nombreUtilisateur;
	}

	public boolean isSupinf100() {
		return supinf100;
	}

	public void setSupinf100(boolean supinf100) {
		this.supinf100 = supinf100;
	}
	
	

}