/**
  Aceasta clasa reprezinta un exemplu de la capitolul de primitive.
  @author Alexandra
  @version 1.0
*/
public class ExPrimitive {
    public static void main(String [] args) {
        /* Comentariu
           pe mai multe
           linii
        */
        byte b1;//declarare variabila
        b1 = 5;
        byte b2 = 10;//initializare
        short s1, s2, s3;
        int i1 = 20;
        long l1 = 40;
        System.out.println(i1+" "+l1);
        int nrInBaza8 = 06;//baza 8 - octal
        int nrInBaza16 = 0xAF;//baza 16 - hexa
        int nrInBaza2 = 0b10101;//baza 2 - binar
        System.out.println(nrInBaza2);
        long l2 = 1_000_000;
        long l3 = 10000000000L;
        float f1 = 10.5f;
        float f2 = (float)10.5;
        double d1 = 10.5;
        boolean bol1 = true;
        boolean bol2 = false;
        char c1 = '\u00DF';
        char c2 = 'a';
        char c3 = '\n';
        System.out.println(c1);
        
        String sir;//NU E PRIMITIVA
        sir = "mesaj";
        System.out.println(sir);
        
        
    }
}