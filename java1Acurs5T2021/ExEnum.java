public class ExEnum {
    public static void main(String [] args) {
        Cafea c1 = Cafea.BIG;
        switch(c1) {
            case SMALL: System.out.println("Poate ai nevoie de mai multa");
                        break;
            case MEDIUM: System.out.println("Este ok");
                         break;
            case BIG:
            case EXTRA_LARGE:  System.out.println("Este cam multa cafea");
        }
        for(Cafea c : Cafea.values()) {
            System.out.println(c+" "+c.ordinal()+" "+c.name());
            c.afiseazaCantitate();
        }
        c1.afiseazaCantitate();
    }
}