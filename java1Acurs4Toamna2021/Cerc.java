public class Cerc extends Punct {
    double raza;//adaugare de atribut
    
    public double getArie() {
        return Math.PI*this.raza*this.raza;//adaugare de comportament
    }
}