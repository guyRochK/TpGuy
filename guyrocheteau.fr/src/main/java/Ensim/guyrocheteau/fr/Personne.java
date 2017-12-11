package Ensim.guyrocheteau.fr;

import java.util.Date;

public class Personne {
	
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	
	
	public Personne(){
		
	}
	
	public boolean estClient(){
		
		if(getEstUnClient()==false){
			return false;
		}
		else
			return true;
		
	}
	
	public void obtenirNomComplet(){
		System.out.println("nom : "+getNom()+"prenom : "+getPrenom());
		
	}
	
	public void obtenirDateNaissance(){
		
		System.out.println("date naissance : "+getDateDeNaissance());
		
	}
	
	public Contrat creerContrat(int i){
		
		int cpt=0;
		
		switch(i){
		
		case 1 : ContratAuto CA = new ContratAuto();
		cpt++;
		return CA;
		
		case 2 : ContratPrevoyance CP = new ContratPrevoyance();
		cpt++;
		return CP;
		
		case 3 : ContratMRH CM = new ContratMRH();
		cpt++;
		return CM;
		
		default :
		System.out.println("Contrat inexistant");
		}
		
		return null;
			
	}
	
	public void resilierContrat(Contrat c){
		
		if(c.contratValide==true){
			
			c.contratValide=false;
			estUnClient=false;
			System.out.println("Contrat résilié");
		}
		else
			System.out.println("Impossible de le résilier car n'existe pas");
		
	}
	
	@SuppressWarnings("null")
	public void resilierContrat(String numContra){
		
		Contrat Ct = null;
		if(numContra.equals(Ct.numeroContrat)){
			System.out.println("contrat résilié");
		}
		else
		{
			System.out.println("impossible de résilier le contrat");
		}	
		
	}
	
	public void obtenirContrats(){
		
	}
	
	public void obtenirContratsAuto(){
		
	}
	
	public void obtenirContratMRH(){
		
	}
	
	public String tostring(){
		return "nom : "+getNom()+"prenom : "+getPrenom()+"Date Naissance"+getDateDeNaissance();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Boolean getEstUnClient() {
		return estUnClient;
	}
	public void setEstUnClient(Boolean estUnClient) {
		this.estUnClient = estUnClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	

}
