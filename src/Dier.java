public class Dier {

	private String naam; // Geen set methode nodig, want dit verandert niet
	private int leeftijd;
	private String rijpVoorSlacht;

	public Dier(String nm, int lftd, String rijp){
		naam = nm;
		leeftijd = lftd;
		rijpVoorSlacht = rijp;

	}

	public void setRijpVoorSlacht(String rijpVoorSlacht) {
		this.rijpVoorSlacht = rijpVoorSlacht;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

	public String getNaam() {
		return naam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public String getRijpVoorSlacht() {
		return rijpVoorSlacht;

	}
}