public class Engineer extends Person {

	String companyName;
	
	public Engineer (String name, int age, String companyName) {
		super(name, age);
		this.companyName = companyName;
	}

    public String report() {
        return (super.report() + "Company Name: " + this.companyName + "\n");
    }
}
