public class Student {
    private String nume;
    private int varsta;
    private boolean integralist;
    
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        if(nume != null) {
            this.nume = nume;
        }
        //nume = this.nume;
    }
    
    public int getVarsta() {
        return this.varsta;
    }
    
    public void setVarsta(int varsta) {
        if(varsta > 18) {
            this.varsta = varsta;
        }
    }
    
    public boolean isIntegralist() {
        return this.integralist;
    }
    public void setIntegralist(boolean integralist) {
        this.integralist = integralist;
    }
    
}