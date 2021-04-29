public class Doctor extends Person {

	String universityAttended;

	public Doctor (String name, int age, String universityAttended){
		super(name, age);
		this.universityAttended = universityAttended;
	}

	public String report() {
		return (super.report() + "University Attended: " + this.universityAttended + "\n");
	}
}
