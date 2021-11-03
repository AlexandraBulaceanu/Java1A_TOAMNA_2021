public class ExTransferValoareVsReferinta {
    public static void main(String [] args) {
        TransferValoareVsReferinta t = new TransferValoareVsReferinta();
        Angajat a = new Angajat("Ionel",2500,40);
        
        int x = 10;
        
        System.out.println("x inainte de apel: "+x);
        t.transferPrinValoare(x);
        System.out.println("x dupa apel: "+x);
        
        System.out.println("a.varsta inainte de apel: "+a.varsta);
        t.transferPrinReferinta(a);
        System.out.println("a.varsta dupa apel: "+a.varsta);
        
        //J10
        //var
        int z;
        z = 20;
        var mesaj = "Buna seara";
        //var h;
        //var k = null;
        var a2 = new Angajat("Gigel",1000,45);
    }
}