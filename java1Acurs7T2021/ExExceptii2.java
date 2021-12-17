public class ExExceptii2 {
    public static void main(String [] args) {
        System.out.println("Vreau sa scot 500 de lei de pe card");
        try {
            extragereNumerar(20);
            System.out.println("operatiunea a fost realizata cu succes");
        } catch(SoldInsuficientException e) {
            System.out.println(e.getMessage());
        } catch(OExceptieChecked e) {
            e.printStackTrace();
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