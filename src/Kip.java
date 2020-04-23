public class Kip extends Dier implements Eten {

	private int eierenGelegdVandaag;
	private Weide weide;

	public Kip(String nm, int lftd, String rijp, int ei){
		super(nm, lftd, rijp);
		eierenGelegdVandaag = ei;
	}

	public void setWeide(Weide w) {
		this.weide = w;
	}

	public Weide getWeide() {
		return weide;
	}


	public void setEierenGelegdVandaag(int ei) {
		this.eierenGelegdVandaag = ei;

	}

	public int getEierenGelegdVandaag() {
		return eierenGelegdVandaag;
	}



	@Override
	public void eet() {
		System.out.println("pik pik pik");
	}

	public String toString() {
		return "De Kip "+getNaam()+" in "+getWeide()+" is "+getLeeftijd()+" jaar oud, is "+getRijpVoorSlacht()+" rijp voor slacht en heeft "+getEierenGelegdVandaag()+" " +
				"eieren gelegd vandaag";
	}


}