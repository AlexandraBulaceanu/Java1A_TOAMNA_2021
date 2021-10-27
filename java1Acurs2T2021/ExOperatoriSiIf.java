/**
 Avem doua serii de valori. Prima reprezinta cand ajungem la o coada, 
 iar a doua cat asteptam la coada respectiva. Se vrea ora la care am parasit coada.
 h1 = 5, m1 = 30, s1 = 20 -> cand ajung
 h2 = 6, m2 = 40, s2 = 40 -> cat astept
 h1 + h2 m1 + m2  s1 + s2
    h1      m1       s1
 */
public class ExOperatoriSiIf {
    public static void main() {
       int h1 = 5, m1 = 30, s1 = 20;
       int h2 = 6, m2 = 40, s2 = 40;
       
       if(s1 + s2 >= 60) {
          m1 = m1 + 1;
          s1 = s1 + s2 - 60;
       } else {
          s1 = s1 + s2;
       }
       
       if(m1 + m2 >= 60) {
          h1 = h1 + 1;
          m1 = m1 + m2 - 60;
       } else {
          m1 = m1 + m2;
       }
       
       h1 = h1 + h2;
       
       System.out.println(h1+" "+m1+" "+s1);
       
       //Ex operator ternar = Elvis ; ?:
       int a = 6, b = 11;
       int c = a > b ? 10 : 20;
       //a > b ?  c<=d && d > 10 ? 10 : 30 : 100;
//               cond2       true2  false2
//      c1            true1                 false1
       /**
        int c;
        if(a > b) {
            c = 10;
        } else {
            c = 20;
        }*/
       System.out.println(c);
    }
}
