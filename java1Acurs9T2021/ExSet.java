import java.util.*;
public class ExSet{
    public static void main(String [] args){
        
        Comparator<Angajat> c = new Comparator<Angajat>(){
            public int compare(Angajat a1, Angajat a2){
                return a1.nume.compareTo(a2.nume);
            }
        };
        TreeSet<Angajat> set = new TreeSet<>((a1,a2)->a1.nume.compareTo(a2.nume));
        TreeSet<Angajat> set2 = new TreeSet<>(c);
        set.add(new Angajat("Popescu",50));
        set.add(new Angajat("Ionescu",29));
        set.add(new Angajat("Cezar",23));
        set.add(new Angajat("Adita",17));
        set.forEach(System.out::println);
    }
}