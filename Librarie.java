public class Librarie{
	private Carte carti[] = new Carte[100];
	private int nrCarti;
	
	public Librarie(){}
	
	
	// constructor,
	// in: un obiect de tip carte, care va fi adaugat in lista de carti
	// out: no output, e constructor
	public void adaugaCarte(Carte c){
		carti[nrCarti++] = c;
	}
	
	// constructor, primeste datele unei carti si instantiaza o carte, dupa care o adauga in lista de carti
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
	// output: un obiect de tip carte
	public Carte getCartePretMinim(){
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

	// cauta cartea cu pretul maxim si o returneaza
	// in: no input
	// output: un obiect de tip carte
	public Carte getCartePretMaxim(){
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
	
	// calculeaza media preturilor din librarie
	// in: no input
	// output: int medie preturi
	public int mediePreturiCarti(){
		int sum = 0;
		for (int i = 0; i < nrCarti; i++){
			sum += carti[i].getPret();
		}
		return (sum / nrCarti);
	}
	
	// metoda to string, returneaza toate detaliile cartilor intr-un format ordonat
	public String toString(){
		StringBuffer sb = new StringBuffer("Libraria are urmatoarele carti: \n");
		for (int i = 0; i < nrCarti; i++){
			sb.append(carti[i] + "\n");
		}
		return (sb.toString());
	}
	
}