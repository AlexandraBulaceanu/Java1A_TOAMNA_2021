public class Pisica {
    String nume;
    int varsta;
    String culoare;
    double greutate;
    
    Pisica(String nume, int varsta, String culoare, double greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        this.greutate = greutate;
    }
    
    /*Pisica() {
        this.nume = "Lea";
        this.varsta = 2;
    }*/
    
    void spuneMiau() {
        System.out.println("Miau! Ma cheama "+this.nume); //comportament
    }
}