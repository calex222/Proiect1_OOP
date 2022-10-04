public class Proiect1 {
	public static void main(String args[]) {
		Carte c = new Carte("A", "B", 100);
		Librarie l = new Librarie();
		
		l.adaugaCarte(c);
		l.adaugaCarte("M", "N", 200);
	
		
	
		//System.out.println(c);
		System.out.println(l);
	}
}