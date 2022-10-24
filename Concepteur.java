package tp;

public class Concepteur extends Salarie {
	public Concepteur(String code, String nom, String prenom , String date, String nbrAnnee) {
		super(code,  nom, prenom, date);
	}
	private int nbrAnnee;
	
	public int getNbrAnnee() {
		return this.nbrAnnee;
	}
	public void setNbrAnnee(int x) {
		this.nbrAnnee=x;
	}
}
