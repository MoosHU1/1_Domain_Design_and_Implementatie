public class Kip extends Dier implements Eten {

	private int eierenGelegdVandaag;

	public Kip(String nm, int lftd, String rijp, int ei){
		super(nm, lftd, rijp);
		eierenGelegdVandaag = ei;
	}


	public void setEierenGelegdVandaag(int ei) {
		this.eierenGelegdVandaag = ei;

	}

	public int getEierenGelegdVandaag() {
		return eierenGelegdVandaag;
	}



	@Override
	public void eet() {

	}

	public String toString() {
		return "De Kip "+getNaam()+" is "+getLeeftijd()+" jaar oud, is "+getRijpVoorSlacht()+" rijp voor slacht en heeft "+getEierenGelegdVandaag()+" " +
				"eieren gelegd vandaag";
	}


}