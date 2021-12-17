public class ExObject {
    public static void main() {
        Persoana p1 = new Persoana("Sorin",24,"Programator");
        Persoana p2 = new Persoana("Marcel",24,"Artist");
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}