public class Koe extends Dier implements Eten {

	private String geeftMelk;
	private Weide weide;


	public Koe(String nm, int lftd, String rijp, String melk){
		super(nm, lftd, rijp);
		geeftMelk = melk;

	}

	public void setWeide(Weide w) {
		this.weide = w;
	}

	public Weide getWeide() {
		return weide;
	}

	public void setGeeftMelk(String geeftMelk) {
		this.geeftMelk = geeftMelk;
	}

	public String getGeeftMelk() {
		return geeftMelk;
	}

	public void eet() {
		System.out.println("Smak smak smak");

	}

	@Override
	public String toString() {
		return "De Koe "+getNaam()+" in "+getWeide()+" is "+getLeeftijd()+" jaar oud, is "+getRijpVoorSlacht()+" rijp voor slacht en geeft "+getGeeftMelk()+" melk";
	}

}