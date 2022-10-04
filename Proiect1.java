import java.util.Scanner;

public class Proiect1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int optiune = -1;
		
		while (optiune != 0){
			System.out.println("0. Iesire");
			System.out.println("1. Afisare librarie");
			System.out.println("2. Adaugare carte");
			System.out.println("3. Medie preturi carti din librarie");
			System.out.println("4. Cea mai scumpa carte");
			System.out.println("5. Cea mai ieftina carte");
			
			optiune = sc.nextInt();
			
			while ((optiune < 0) || (optiune > 5)) {
				System.out.println("Optiune incorecta!");
				optiune = sc.nextInt();
			}
			switch (optiune) {
				case 0:
				break;
				case 1:
				break;
				case 2:
				break;
				case 3:
				break;
				case 4:
				break;
				case 5:
				break;
				default:
				break;
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