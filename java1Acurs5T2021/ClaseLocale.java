public class ClaseLocale {
    int x;
    static int y;
    
    public void metoda1() {
        int z = 10;
        class LocalaInContextNonStatic {
            public void m() {
                //z = 5;
                System.out.println(x);
                System.out.println(z);
            }
        }
    }
    public static void metoda2() {
        int z = 10;
        class LocalaInContextStatic {
            public void m() {
                //z = 5;
                //System.out.println(x);
                System.out.println(z);
                System.out.println(y);
            }
        }
    }
}