package fr.andrew.deviner;

public class Deviner {
	
	private boolean faux = false;
	protected int nbAleatoire = (int) (Math.random() * ( 0 + 100 )) ;	
	protected boolean supinf100 = false;
	private int chanceUtiliser = 1;
	
	
	public Deviner() {
		super();
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
	
	public void verificationSupInf100(int nombreUtilisateur){
		if(nombreUtilisateur < 0 || nombreUtilisateur > 100) {
			System.out.println("Entrez une valeur entre 0 et 100");
			supinf100=true;		
		}else {
			supinf100=false;
		}
	}
	
	public boolean verificationFalse() {				
		return faux;
	}
	
	public boolean verificationSupInf100False() {
		return supinf100;
	}
	
	//getter setter

	public int getNbAleatoire() {
		return nbAleatoire;
	}

	public void setNbAleatoire(int nbAleatoire) {
		this.nbAleatoire = nbAleatoire;
	}

	public boolean isSupinf100() {
		return supinf100;
	}

	public void setSupinf100(boolean supinf100) {
		this.supinf100 = supinf100;
	}
	
	

}