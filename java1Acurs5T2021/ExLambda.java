public class ExLambda {
    public static void main(String [] args) {
        Predicat p1 = (x) -> x > 20;
        Predicat p2 = x -> x%2==0; // pot sa lipseasca parantezele pt un sg param fara tip
        Predicat p3 = (int x) -> x < 5;
        Predicat p4 = x -> {return x>6;};
        Predicat p5 = x -> false;
        
        Functie f1 = (x,y) -> 20;
        Functie f2 = (int x,int y) -> x + y;
        Functie f3 = (int x,int y) -> {return x + y;};
        
        calculeaza((x,y)->x+y,10,20);
                 //(10,20) -> 10 + 20 => 30
        calculeaza((x,y)->x*y,10,20);
                 //(10,20) -> 10 * 20 => 200
        calculeaza(f1,10,20);
                //(10,20) -> 20 => 20
    }
    
    public static void calculeaza(Functie f, int a, int b) {
        System.out.println(f.operatie(a,b));
    }
}