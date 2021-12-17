public class Cutie<T> { //<T,G,W>
    //int continut;
    T continut;
    //static T y;
    
    public Cutie() {}
    public Cutie(T continut) {}
    public T m1() {
        return continut;
    }
    public void m2(T a) {
        
    }
    //public static void m3(T a) {}
    public static <Q> void m3(Q a) {} //Cutie.<Integer>m3(5) - apelul
}