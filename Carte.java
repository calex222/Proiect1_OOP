public class Carte{
	private String titlu;
	private String autor;
	private int pret;
	
	public Carte(String titlu, String autor, int pret){
		this.titlu = titlu;
		this.autor = autor;
		this.pret = pret;
	}
	
	public String getTitlu(){
		return titlu;
	}
	
	public void setTitlu(String titlu){
		this.titlu = titlu;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public int getPret(){
		return pret;
	}
	
	public void setPret(int pret){
		this.pret = pret;
	}
	
	public String toString(){
		return (titlu + " de: " + autor + "; pret: " + pret);
	}	
}