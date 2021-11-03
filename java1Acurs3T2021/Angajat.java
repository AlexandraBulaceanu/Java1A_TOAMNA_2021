public class Angajat {
    int id;
    String nume;
    int nivelFunctie;
    double salariu;
    int varsta;
    static String numeCompanie;
    static int nrAngajati;
    
    Angajat(String nume, double salariu, int varsta) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    Angajat(String nume, int nivelFunctie, double salariu, int varsta) {
        this.nume = nume;
        this.nivelFunctie = nivelFunctie;
        this.salariu = salariu;
        this.varsta = varsta;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    Angajat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    Angajat() {
        this("Angajat",1,2000,22);
        
    }
    
    static void afiseazaAngajati() {
        System.out.println(nrAngajati);
        //System.out.println(this.nume);
    }
    
    //calculam diferenta de varsta dintre doi angajati
    int diferentaVarsta(Angajat a){
        //int diferenta = Math.abs(this.varsta - a.varsta);
        //return Math.abs(this.varsta - a.varsta);
        int diferenta;
        if (this.varsta > a.varsta) {
            diferenta = this.varsta - a.varsta;
        } else {
            diferenta = a.varsta - this.varsta;
        }
        return diferenta;
    }
}