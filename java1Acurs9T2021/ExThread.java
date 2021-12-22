public class ExThread{
    public static void main(String [] args){
        OddNumbersThread t = new OddNumbersThread(); //NEW
        t.start();//RUNNABLE ->(JVM) RUNNING
        //t.run();as rula instructiunile pe ac fir cu main
        EvenNumbersThread r = new EvenNumbersThread();//task
        Thread t2 = new Thread(r);//mecanismul de fir de executie
        t2.start();
        System.out.println("The end...");
        
        
    }
}