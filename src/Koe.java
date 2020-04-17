public class Koe extends Dier implements Eten {

	private String geeftMelk;

	public Koe(String nm, int lftd, String rijp, String melk){
		super(nm, lftd, rijp);
		geeftMelk = melk;

	}

	public void setGeeftMelk(String geeftMelk) {
		this.geeftMelk = geeftMelk;
	}

	public String getGeeftMelk() {
		return geeftMelk;
	}

	public void eet() {

	}

	@Override
	public String toString() {
		return "De Koe "+getNaam()+" is "+getLeeftijd()+" jaar oud, is "+getRijpVoorSlacht()+" rijp voor slacht en geeft "+getGeeftMelk()+" melk";
	}

}