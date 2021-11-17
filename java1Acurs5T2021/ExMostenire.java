public class ExMostenire {
    public static void main(String [] args) {
        C instantaC = new C();
        
        Cerc cerc = new Cerc();
        cerc.x = "bla";
        cerc.y = 2;
        cerc.raza = 10;
        System.out.println(cerc.getArie());
        
        Cilindru cil = new Cilindru();
        System.out.println(cil.getArie());
        
    }
}