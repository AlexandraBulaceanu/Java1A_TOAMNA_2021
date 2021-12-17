public class ExExceptii4 {
    public static void main(String [] args) {
        System.out.println("Vreau sa scot 500 de lei de pe card");
        try {
            extragereNumerar(800);
            System.out.println("operatiunea a fost realizata cu succes");
        } catch(ExceptieCopil e) {
            System.out.println(e.getMessage());
        } catch(ExceptieSuper e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se executa intotdeauna, indiferent de aruncare exceptie");
        }
    }
    
    public static void extragereNumerar(double suma) throws ExceptieSuper{
        if(suma > 300) {
            ExceptieSuper e = new ExceptieSuper();
            throw e;//arunc instanta de exceptie e / semnalez aparitia situatiei de exceptie
        }
        if(suma < 50) {
            throw new ExceptieCopil();
        }
    }
}