public interface Instrument {
    //int x;
    public static final int x = 10;
    
    //void getModalitateCantare(){} - abstract este implicit
    public void getModalitateCantare();
    
    default void metodaConcreta(){}//J8
    static void metodaStatica(){}//J8
    private void metodaPrivata(){}//J9
}