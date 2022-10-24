package tp;

public class Salarie {

	private String code;
	private String nom;
	private String prenom;
	private String date;
	
	public Salarie( String code,String nom, String prenom, String date) { //constructeur 
		this.code=code;
		this.nom=nom;
		this.prenom=prenom;
		this.date=date;
	}
	
	public String getCode() {
		return this.code;
	}
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public String getDate() {
		return this.date;	
	}
	public void setCode(String x) {
		this.code = x;
	}
	public void setNom(String y) {
		this.nom = y;
	}
	public void setPrenom(String z) {
		this.prenom=z;
	}
	public void setDate(String n) {
		this.date=n;
	}
	}
