public class Librarie{
	private Carte carti[] = new Carte[100];
	private int nrCarti;
	
	public Librarie(){}
	
	public void adaugaCarte(Carte c){
		carti[nrCarti++] = c;
	}
	
	public void adaugaCarte(String titlu, String autor, int pret){
		Carte c = new Carte(titlu, autor, pret);
		carti[nrCarti++] = c;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer("Libraria are urmatoarele carti: \n");
		for (int i = 0; i < nrCarti; i++){
			sb.append(carti[i] + "\n");
		}
		return (sb.toString());
	}
	
}