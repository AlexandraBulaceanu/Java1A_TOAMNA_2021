public class ExAngajat {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Jon",2500,35);
        Angajat a2 = new Angajat("Mike",4000,26);
        a1.numeCompanie = "Facebook";
        a2.numeCompanie = "Google";
        Angajat.numeCompanie = "Meta";
        
        System.out.println(a1.nume+" "+a1.id+" "+a1.numeCompanie);
        System.out.println(a2.nume+" "+a2.id+" "+a2.numeCompanie);
        System.out.println(Angajat.numeCompanie);
        
        System.out.println(Angajat.nrAngajati);
        
        Angajat.afiseazaAngajati();
        
        //System.out.println("Diferenta de varsta este: "+diferenta);
        int dif = a1.diferentaVarsta(a2);
        System.out.println("Diferenta de varsta este: "+dif);
        System.out.println("Diferenta de varsta este: "+a1.diferentaVarsta(a2));
        
        Angajat a3 = new Angajat();
        System.out.println(a3.nume+" "+a3.id+" "+a3.nivelFunctie+" "+a3.salariu+" "+a3.varsta);
    }
}