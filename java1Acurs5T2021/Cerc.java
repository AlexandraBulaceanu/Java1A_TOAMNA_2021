public class Cerc extends Punct {
    double raza;//adaugare de atribut
    String x;//modificare atribut = ascunderea campurilor = hiding fields
    
    //final class = clasa nu mai poate sa fie mostenita
    
    public Cerc() {
        this(1);
    }
    
    public Cerc(double raza) {
        super(0,1);
        this.raza = raza;
        //this.x = 10;
        this.x = "buna";
        super.x = 10; // super = instanta clasei superioara
        this. y = 2;
        super.y = 3;
        //super.raza = 5;
    }
    
    public double getLungime() {
        return 2*Math.PI*this.raza;
    }
    
    public double getArie() {
        return Math.PI*this.raza*this.raza;//adaugare de comportament
    }
    
    //final pus la metoda = metoda nu mai poate fi suprascrisa
}