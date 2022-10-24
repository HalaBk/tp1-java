package tp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class main {
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		Map <String,Concepteur> hmapConcepteur = new HashMap<String, Concepteur>(); //permet de stpcker les trucs saisie dans la condition1 dans un hmap  
		Map <String,Analyste> hmapAnalyste = new HashMap<String, Analyste>();
		Map<String,Salarie> hmapSalarie = new HashMap<String, Salarie>();
		try {
			while(true) {
			System.out.println("1-Ajouter une concepteur");
			System.out.println("2-Supprimer une concepteur");
			System.out.println("3-Lister les concepteurs existants");
			System.out.println("4-Ajouter un analyste");
			System.out.println("5-Supprimer un analyste");
			System.out.println("6-Lister les salariés existants en mettant en évidence la fonction ");
			String i ="";
			System.out.println("faite votre choix (1,2,3,4,5,6):");
			i=in.readLine();
			//Ajouter un concepteur 
			if (i.equals("1")) {
				System.out.println("saisir le code, nom, prenom, date et nbrAnnee ");
				i=in.readLine();
				String[] tab =i.split("-"); 
				String code = tab[0];
				String nom =tab[1];
				String prenom=tab[2];
				String date=tab[3];
				String nbrAnnee=tab[4];
			System.out.println(code);
			System.out.println(nom );
			System.out.println(prenom);
			System.out.println(date);
			System.out.println(nbrAnnee);
			
			Concepteur concepteurListe = new Concepteur(code,nom,prenom,date,nbrAnnee);//inserer les elements saisie dans variable concepteur liste			
			hmapConcepteur.put(code, concepteurListe);
			}
			else if(i.equals("2")) {
				try {
					String j ="";
					System.out.println("Veuillez saisir le code");
					j=in.readLine();
					hmapConcepteur.remove(j);
					System.out.println("le concepteur est supprimé\n");
				}catch(IOException e){
					System.out.println("code introuvable");
				}
				
			}
			else if (i.equals("3")) {
				Iterator iterator=hmapConcepteur.entrySet().iterator();
				ArrayList<Concepteur> listC = new ArrayList<Concepteur>();
				int index=0;
				while (iterator.hasNext()) {
					Map.Entry mapentry=(Map.Entry) iterator.next();
					listC.add((Concepteur)mapentry.getValue());
					System.out.println(listC.get(index).getCode()+" "+listC.get(index).getNom()+" "+listC.get(index).getPrenom()+" "+listC.get(index).getDate()+" "+listC.get(index).getNbrAnnee());
					index+=1;
				}}
			else if (i.equals("4")) {
				System.out.println("saisir le code, nom, prenom, date et nbrDeplacement ");
				i=in.readLine();
				String[] tab =i.split("-"); 
				String code = tab[0];
				String nom =tab[1];
				String prenom=tab[2];
				String date=tab[3];
				String nbrDeplacement=tab[4];
			System.out.println(code);
			System.out.println(nom );
			System.out.println(prenom);
			System.out.println(date);
			System.out.println(nbrDeplacement);
			
			Analyste analysteListe = new Analyste(code,nom,prenom,date,nbrDeplacement);//inserer les elements saisie dans variable concepteur liste			
			hmapAnalyste.put(code, analysteListe);
			}
			else if(i.equals("5")) {
				try {
					String x ="";
					System.out.println("Veuillez saisir le code");
					x=in.readLine();
					hmapAnalyste.remove(x);
					System.out.println("l'analyste est supprimé\n");
				}catch(IOException e){
					System.out.println("code introuvable");
				}}
			else if (i.equals("6")) {
				Iterator iterator=hmapAnalyste.entrySet().iterator();
				ArrayList<Analyste> listC = new ArrayList<Analyste>();
				int index=0;
				while (iterator.hasNext()) {
					Map.Entry mapentry=(Map.Entry) iterator.next();
					listC.add((Analyste)mapentry.getValue());
					System.out.println(listC.get(index).getCode()+" "+listC.get(index).getNom()+" "+listC.get(index).getPrenom()+" "+listC.get(index).getDate()+" "+listC.get(index).getNbrDeplacement());
					index+=1;
					hmapSalarie.putAll(hmapAnalyste);
					hmapSalarie.putAll(hmapConcepteur);
					
					Set set = hmapSalarie.entrySet();
				      Iterator iterator2 = set.iterator();
				      System.out.println("Avant le tri: ");
				      while(iterator2.hasNext()) {
				         Map.Entry me = (Map.Entry)iterator2.next();
				         System.out.print(me.getKey() + ": ");
				         System.out.println(me.getValue());}
				      Map sortedMap = new TreeMap(hmapSalarie);
				}}
				
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
	} 
}