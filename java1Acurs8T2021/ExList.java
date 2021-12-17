import java.util.*;
public class ExList {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);//0
        list.add(20);//1
        list.add(7);//2
        list.add(20);//3
        list.add(9);//4
        list.add(2);//5
        System.out.println(list.size());//dim lista
        System.out.println(list.isEmpty());//lista goala sau nu
        System.out.println(list.get(2));//elem de la pozitia 2 = 7
        
        System.out.println("======================");
        
        //for clasic
        for(int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("======================");
        for(Integer x : list) {
            System.out.println(x);
        }
        System.out.println("======================");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================");
        list.forEach(e -> System.out.println(e));
        System.out.println("======================");
        list.remove(2);//am dat index ->  sterge valoarea de la indexul 2
        list.remove(new Integer(2));//am dat valoare -> sterge valoarea din lista
        list.forEach(System.out::println);//referinta la metoda
        //:: = operator de referinta la metoda
    }
}
