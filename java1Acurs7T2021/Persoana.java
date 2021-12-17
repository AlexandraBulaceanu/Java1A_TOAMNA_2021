public class Persoana {
    String nume;
    int varsta;
    String ocupatie;
    
    Persoana(String nume, int varsta, String ocupatie) {
        this.nume = nume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
    }
    
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(o instanceof Persoana) {
            Persoana p = (Persoana)o;
            return this.varsta == p.varsta;
        }
        return false;
    }
    
    public String toString() {
        return "Nume: "+nume+" Varsta: "+varsta+" Ocupatie: "+ocupatie;
    }
}