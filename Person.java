public class Person {

	String name;
	int age;

	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}

    public String report() {
        return this.name + " is " + Integer.toString(this.age) + " years old" +  "\n";
    }
}

