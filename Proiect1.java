import java.util.Scanner;

public class Proiect1 {
	
	public static void clearConsole(){
		for (int i = 0; i < 100; i++)
			System.out.println("\n");
	}
	
	public static void main(String args[]) {
		String wait;
		String titluCarte, autorCarte;
		int pretCarte;
		Librarie l = new Librarie();
		
		Scanner sc = new Scanner(System.in);
		
		int optiune = -1;
		
		while (optiune != 0){
			clearConsole();
			System.out.println("0. Iesire");
			System.out.println("1. Afisare librarie");
			System.out.println("2. Adaugare carte");
			System.out.println("3. Medie preturi carti din librarie");
			System.out.println("4. Cea mai scumpa carte");
			System.out.println("5. Cea mai ieftina carte");
			
			optiune = sc.nextInt();
			
			while ((optiune < 0) || (optiune > 5)) {
				clearConsole();
				System.out.println("Optiune incorecta!");
				optiune = sc.nextInt();
			}
			clearConsole();
			switch (optiune) {
				case 0:
				break;
				
				case 1:
				System.out.println(l);
				break;
				
				case 2:
				System.out.println("Dati titlul cartii: ");
				titluCarte = sc.next();
				System.out.println("Dati autorul cartii: ");
				autorCarte = sc.next();
				System.out.println("Dati pretul cartii: ");
				pretCarte = sc.nextInt();
				
				Carte c = new Carte(titluCarte, autorCarte, pretCarte);
				l.adaugaCarte(c);
				
				//l.adaugaCarte(titluCarte, autorCarte, pretCarte);				
				break;
				
				case 3:
				if (l.getNrCarti() > 0)
					System.out.println("Medie preturi librarie: " + l.mediePreturiCarti());
				else
					System.out.println("Libraria nu are carti");
				break;
				
				case 4:
				if (l.getNrCarti() > 0)
				System.out.println("Cea mai scumpa carte este: " + l.getCartePretMaxim());
				else
					System.out.println("Libraria nu are carti");
				break;
				
				case 5:
				if (l.getNrCarti() > 0)
				System.out.println("Cea mai ieftina carte este: " + l.getCartePretMinim());
				else
					System.out.println("Libraria nu are carti");
				break;
				
				default:
				break;
			}
			if (optiune != 0){
				System.out.println("Apasati o tasta si enter pentru a continua...");
				wait = sc.next();
			}
		}
		
		
		
		/*
		Carte c = new Carte("A", "B", 100);
		Librarie l = new Librarie();
		
		l.adaugaCarte(c);
		l.adaugaCarte("M", "N", 200);
	
		
	
		//System.out.println(c);
		System.out.println(l);
		*/
	}
}