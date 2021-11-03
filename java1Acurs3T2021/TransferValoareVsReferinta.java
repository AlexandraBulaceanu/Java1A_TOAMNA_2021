public class TransferValoareVsReferinta {
    void transferPrinValoare(int x) {
        x = x * 2;
        System.out.println("x in metoda "+x);
    }
    /*void transferPrinValoare(Integer x) {
        x = x * 2;
        System.out.println("x in metoda "+x);
    }*/
    
    void transferPrinReferinta(Angajat a1) {
        a1.varsta = 34;
        System.out.println("a1.vasrta in metoda "+a1.varsta);
    }
}