public class ExGenerice {
    public static void main(String [] args) {
        Cutie c1;
        c1 = new Cutie(); //implicit Object
        
        Cutie<?> c2;
        c2 = new Cutie<Integer>();//instanta c2 o sa aiba un atribut continut de tip de data Integer
        c2 = new Cutie<int[]>();
        
        Cutie<Lego> c3;
        c3 = new Cutie<Lego>();
        
        Cutie<Integer> c4;
        c4 = new Cutie<>();//J7  - sintaxa Diamond
        
        Cutie<Number> c5;
        //c5 = new Cutie<Integer>(); - pe constrangere directa nu este luat in calcul nici polimorfismul
        
        Cutie<? extends Number> c6;
        c6 = new Cutie<Integer>();
        
        Cutie<? super Number> c7;
        c7 = new Cutie<Object>();
    }
}