/**
     In functie de numele continut in variabila de test, vom afisa in consola sistemului ocupatia
     persoanei respective.
     
 */
public class ExSwitch {
    public static void main(String [] args) {
        String personalitate = "Naum";
        
        switch(personalitate) {
            case "Picasso": System.out.println("era pictor");
                            break;
            case "Mozart": System.out.println("era compozitor");
                            break;
            case "Tolstoi": 
            case "Dostoievski": System.out.println("era scriitor");
                                break;
            default: System.out.println("nu se cunoaste ocupatia");
        }
    }
}