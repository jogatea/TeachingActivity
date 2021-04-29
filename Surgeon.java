public class Surgeon extends Doctor {

	boolean hasScalpel;

	public Surgeon(String name, int age, String universityAttended, boolean hasScalpel) {
		super (name, age, universityAttended);
		this.hasScalpel = hasScalpel;
	}

	public String report() {
		if (this.hasScalpel) {
			return (super.report() + "Making incision" + "\n");
		} else {
			return (super.report() + "Scalpel, please" + "\n");
		}
	}
}
