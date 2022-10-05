public class Librarie{
	private Carte carti[] = new Carte[300];
	private int nrCarti;
	
	// constructor
	public Librarie(){}
	
	// adauga o carte in librarie
	// in: un obiect de tip carte, care va fi adaugat in lista de carti
	// out: no output, e constructor
	public void adaugaCarte(Carte c){
		carti[nrCarti++] = c;
	}
	
	// adauga creeaza un obiect de tip carte si il adauga in librarie
	// in: String titlu carte, String autor carte, int pret carte
	// out: no output, e constructor
	public void adaugaCarte(String titlu, String autor, int pret){
		Carte c = new Carte(titlu, autor, pret);
		carti[nrCarti++] = c;
	}
	
	//metoda get pentru numarul de carti din librarie
	public int getNrCarti(){
		return nrCarti;
	}
	
	// cauta cartea cu pretul minim si o returneaza
	// in: no input
	// output: un obiect de tip carte sau null daca nu sunt carti
	public Carte getCartePretMinim(){
		if (nrCarti > 0){
			int min = 9999999;
			int poz = -1;
			for (int i = 0; i < nrCarti; i++){
				if (min > carti[i].getPret()){
					min = carti[i].getPret();
					poz = i;
				}
			}
			return (carti[poz]);
		}
		else return null;
	}

	// cauta cartea cu pretul maxim si o returneaza
	// in: no input
	// output: un obiect de tip carte sau null daca nu sunt carti
	public Carte getCartePretMaxim(){
		if (nrCarti > 0){
			int max = -1;
			int poz = -1;
			for (int i = 0; i < nrCarti; i++){
				if (max < carti[i].getPret()){
					max = carti[i].getPret();
					poz = i;
				}
			}
			return (carti[poz]);
		}
		else return null;
	}
	
	// calculeaza media preturilor din librarie
	// in: no input
	// output: int medie preturi sau -1 daca nu sunt carti
	public int mediePreturiCarti(){
		if (nrCarti > 0){
			int sum = 0;
			for (int i = 0; i < nrCarti; i++){
				sum += carti[i].getPret();
			}
			return (sum / nrCarti);
		}
		else 
			return -1;
	}
	
	// metoda to string, returneaza toate detaliile cartilor intr-un format ordonat sau un mesaj cum nu sunt carti, in cazul in care libraria nu are carti
	public String toString(){
		if (nrCarti > 0){
			StringBuffer sb = new StringBuffer("Libraria are urmatoarele carti: \n");
			for (int i = 0; i < nrCarti; i++){
				sb.append(carti[i] + "\n");
			}
			return (sb.toString());
		}
		else
			return ("Libraria nu are carti");
	}
	
}