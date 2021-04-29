public class SoftwareEngineer extends Engineer {

	String favoriteLanguage;
	boolean knowsC;

	public SoftwareEngineer(String name, int age, String companyName, 	
                                                    String language, boolean knowsC) {
		super(name, age, companyName);
		this.favoriteLanguage = language;
		this.knowsC = knowsC;
	}

    public String report() {
        return (super.report() + "Favorite Language: " + this.favoriteLanguage + "\n"
        + "Knows C: " + knowsC + "\n");
    }
}

