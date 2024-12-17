import Wilders.Wilders;

public class Classroom {
    public static void main(String[] args) {
        Wilders robin = new Wilders("Robin", true);
        System.out.println(robin.whoIAm());
        Wilders thomas = new Wilders("Thomas", false);
        System.out.println(thomas.whoIAm());
        Wilders marie = new Wilders("Marie", false);
        System.out.println(marie.whoIAm());
        Wilders florence = new Wilders("Florence", true);
        System.out.println(florence.whoIAm());
    }
}