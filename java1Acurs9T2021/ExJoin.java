public class ExJoin{
    public static void main(String [] args){
        long timpStart = System.currentTimeMillis();
        /*collectDataFromDb1();
        collectDataFromDb2();*/
        Thread x = new Thread(()->collectDataFromDb1());
        Thread y = new Thread(()->collectDataFromDb2());
        x.start();
        y.start();
        try{
            x.join();//main astepta dupa x
            y.join();
            //colectarea se face in paralel pe doua fire(x si y)
            //procesarea datelor optinute se va face pe main, dupa ce au terminat firele x si y
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        long timpFinal = System.currentTimeMillis();
        System.out.println(timpFinal-timpStart);//cat a durat executia celor doua metode
        
        
    }
    public static void collectDataFromDb1(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void collectDataFromDb2(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}