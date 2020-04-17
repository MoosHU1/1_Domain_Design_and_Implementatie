public class Groente {

	private String oogstbaar;
	private String gezaaid; // Geen set methode nodig, want dit verandert niet
	private String veld;

	public Groente(String oogst, String zaai, String vld){
		oogstbaar = oogst;
		gezaaid = zaai;
		veld = vld;
	}

	public void setOogstbaar(String oogstbaar) {
		this.oogstbaar = oogstbaar;
	}

	public String getOogstbaar() {
		return oogstbaar;
	}

	public String getGezaaid() {
		return gezaaid;
	}

	public String getVeld() {
		return veld;
	}
}