public class ExArray {
    public static void main(String [] args) {
        int [] numere = new int[5];
        numere[1] = 40;
        //numere[6] = 100; ArrayIndexOutOfBoundsException
        System.out.println(numere[0]+" "+numere[1]);
        
        //populam cu valori de la 1 la 5 array-ul
        for(int i = 0; i < numere.length; i++) {
            numere[i] = i+1;
        }
        
        for(int element:numere) {
            System.out.println(element);
        }
        
        //list.forEach(consumator); - la colectii
        
        //Sa calculam media varstelor angajatilor
        Angajat [] angajati = new Angajat[3];
        angajati[0] = new Angajat("Jon",2500,35);
        angajati[1] = new Angajat("Mike",4000,26);
        angajati[2] = new Angajat();//a3.varsta = 22(valoare pe care o ia implicit)
        
        //primul pas = calculare a sumei
        double suma = 0;
        for(int i = 0; i < angajati.length; i++) {
            suma += angajati[i].varsta;
        }
        
        //pas 2: fac media
        double media = suma/angajati.length;
        System.out.println(media);
    }
}