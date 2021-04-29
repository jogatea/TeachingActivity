public class Main {
    public static void main(String[] args) {
        
        SoftwareEngineer sEngineer = new SoftwareEngineer("David", 27, "Google", "Python", true);
        Engineer eng1 = sEngineer;
        //Surgeon surgeon = new Surgeon("Jim", 30, "Brown", true);
        System.out.println(eng1.report());
    }
}