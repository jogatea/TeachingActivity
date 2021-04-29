public class CivilEngineer extends Engineer {

	boolean knowsAutocad;
	int salary;
	
	public CivilEngineer(String name, int age, String companyName, 
			         boolean knowsAutocad){
		super(name, age, companyName);
		this.knowsAutocad = knowsAutocad;
		if (knowsAutocad) {
			this.salary = 100000;
		} else {
			this.salary = 50000;
		}
	}

    public int getSalary(){
		return this.salary;
	}

	public String report() {
		return (super.report() + "Knows Autocad: " + this.knowsAutocad + "\n"
			+ "Salary: " + Integer.toString(this.getSalary()) + "\n");
	}
}
