package Ensim.guyrocheteau.fr;

public abstract class Contrat {
	
	protected String numeroContrat;
	protected boolean contratValide =false;
	
	public abstract void creationContrat();
	
	public abstract void determinerGaranties();
	
	public abstract double determinerCotisation();

}
