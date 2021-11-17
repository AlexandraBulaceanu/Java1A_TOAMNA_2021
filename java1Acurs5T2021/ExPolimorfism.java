public class ExPolimorfism {
    public static void main(String [] args) {
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        Reptila a = new Crocodil(); //polimorfismului
        //Reptila = forma
        //a = referinta care are ca si tip de data cls superioara si arata catre o instanta de Crocodil
        //Crocodil = instanta efectiva care se creeaza in memorie, dar ia forma de Reptila
        
        a.greutate = 40;
        //a.lungimeCoada = 5; -> e o caracteristica ce nu apartine formei
        //caracteristica = atribut/comportament
        System.out.println(a.temperaturaCorp);//pt atribute -> pastreaza valoarea din forma -> Reptila
        a.afisareDenumire();//pt comportamente -> se apeleaza suprascrierea -> instanta din memorie -> Crocodilul
        
        Crocodil c2 = (Crocodil)a;
        c2.lungimeCoada = 6;
        //Crocodil c3 = (Crocodil)r1; -> la rulare -> ClassCastException
        //Crocodil c4 = new Reptila();
        
        Reptila s = new Sarpe();
        Reptila v = new SarpeVeninos();
        //SarpeVeninos v1 = (SarpeVeninos)s; -> ClassCastException
        SarpeVeninos v2 = (SarpeVeninos)v;
        
        String mesaj = "sir";
        //Sarpe s1 = (Sarpe)mesaj; -> eroare de compilare
        
        //instanceof
        if(c1 instanceof Crocodil) {
            System.out.println("c1 este un crocodil");//true
        }
        if(s instanceof SarpeVeninos) {
            System.out.println("s este sarpe veninos");//false
        }
        if(null instanceof Reptila) {
            System.out.println("mereu da false");//false
        }
    }
}