public class ExPisica {
    public static void main(String [] args) {
        int a;
        a = 10;
        int b = a;
        
        
        Pisica p1;
        p1 = new Pisica("Kitty",2,"gri",4.5);
        Pisica p2 = p1;
        Pisica p3 = new Pisica("Tom",3,"alb",3.6);
        p3.nume = "Lea";
        p3.varsta = 4;
        
        System.out.println(p1.nume + " " + p1.varsta + " " + p1.culoare + " " + p1.greutate);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p2.nume);
        System.out.println(p2.varsta);
        System.out.println(p2.culoare);
        System.out.println(p2.greutate);
        
        System.out.println(p3.nume);
        System.out.println(p3.varsta);
        System.out.println(p3.culoare);
        System.out.println(p3.greutate);
        
        p1.spuneMiau();
        p3.spuneMiau();
    }
}