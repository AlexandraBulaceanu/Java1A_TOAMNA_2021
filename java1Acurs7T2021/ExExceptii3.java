public class ExExceptii3 {
    public static void main(String [] args) {
        System.out.println("Vreau sa scot 500 de lei de pe card");
        try {
            extragereNumerar(800);
            System.out.println("operatiunea a fost realizata cu succes");
        } catch(SoldInsuficientException|OExceptieChecked e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se executa intotdeauna, indiferent de aruncare exceptie");
        }
    }
    
    public static void extragereNumerar(double suma) throws SoldInsuficientException, OExceptieChecked{
        if(suma > 300) {
            SoldInsuficientException e = new SoldInsuficientException();
            throw e;//arunc instanta de exceptie e / semnalez aparitia situatiei de exceptie
        }
        if(suma < 50) {
            throw new OExceptieChecked();
        }
    }
}