public enum Cafea {
    SMALL, MEDIUM, BIG(300), EXTRA_LARGE;
    
    private int cantitate;
    Cafea() {}
    Cafea(int cantitate) {
        this.cantitate = cantitate;
    }
    
    public void afiseazaCantitate() {
        System.out.println(cantitate);
    }
}