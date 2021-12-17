//implementare lazy de singleton
public class Conexiune {
    String nume;
    
    private Conexiune() {
        
    }
    
    private static Conexiune SINGLETON;
    
    public static Conexiune getInstance() {
        if(SINGLETON == null) {
            SINGLETON = new Conexiune();
        }
        return SINGLETON;
    }
}