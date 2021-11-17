public class ExPrototipuriAbstracte {
    public static void main(String [] args) {
        //Forma f = new Forma(); -> nu am voie sa instantiez in mod direct
        Forma f1 = new Dreptunghi();
        System.out.println(f1.getArie());
        
        Forma [] forme = new Forma[2];
        forme[0] = new Dreptunghi();
        forme[1] = new Sfera();
        
        Instrument i = new Pian();
        i.getModalitateCantare();
    }
}