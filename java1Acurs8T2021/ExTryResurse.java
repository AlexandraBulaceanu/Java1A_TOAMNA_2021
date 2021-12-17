public class ExTryResurse {
    public static void main(String [] args) {

        try(DBConnection db1 = new DBConnection();
            DBConnection db2 = new DBConnection();) {
            
            //folosim resursele
        } catch(Exception e) {
            // e = exceptie principala = prima exceptie care se va arunca
            // restul exceptiilor vor fi ascunse -> scocate intr-un vector suppresed
            Throwable[] suppressed = e.getSuppressed();
            for(Throwable t : suppressed) {
                System.out.println(t);
            }
            //tratez
        } finally {
            System.out.println("finally explicit");
        }
    
    }
}