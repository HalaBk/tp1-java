package tp;

public class Analyste extends Salarie {
	public Analyste(String code, String nom, String prenom , String date, String nbrDeplacement) {
		super(code,  nom, prenom, date);
	}
	private int nbrDeplacement;
	
	public int getNbrDeplacement() {
		return this.nbrDeplacement;
	}
	public void setNbrDeplacement(int x) {
		this.nbrDeplacement=x;
	}
}
