public class ExAnonime {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Ionescu",7,3000);
        Angajat a2 = new Angajat("Popescu",2,1000);
        Angajat a3 = new Angajat("Georgescu",1,800){
            @Override
            public double calculeazaSalariu() {
                this.salariu = 4000;
                return this.salariu;
            }
        };
        
        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(a3.calculeazaSalariu());
        
        Calculator c = new Calculator(){
            @Override
            public void proceseaza() {
            }
        };
        Calculator cl = () -> {};
    }
}