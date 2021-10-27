public class ExIfElse {
    public static void main(String [] args) {
        if(5>3) {
            System.out.println("caz adevarat");
        } else {
            System.out.println("caz false");
        }
        
        if(false) {
            System.out.println("niciodata");
        }
        
        boolean a;
        if(a=true) { //true
            System.out.println("mereu");
        }
        int x = 5;
        int y = 5;
        /*if(x=y) {
            System.out.println("aici imi dadea un int => eroare de compilare");
        }*/
        if(x==y) {
            System.out.println("valorile sunt egale");
        }
    }
}