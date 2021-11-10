public class ExMatrice {
    public static void main(String [] args) {
        int [][] ma = new int[3][];
        ma[0] = new int[4];
        ma[1] = new int[2];
        ma[2] = new int[3];
        
        //generam valorile - populam matricea cu elemente egale cu suma indecsilor
        for(int i = 0;i < ma.length; i++) {
            for(int j = 0;j < ma[i].length; j++) {
                ma[i][j] = i + j;
            }
        }
        
        //parcurgerea elementelor din matrice si afisarea acestora in consola
        for(int[] vec:ma) {
            for(int elem:vec) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
        
        int [] arr = {10,20,30,40};
        int [] arr1 = new int[]{10,20,30,40};
        //int [] arr2 = new int[4]{10,20,30,40};
        int [][] arrbi = {{50,60,70},{12,16},{23}};
        System.out.println(arrbi);
        
        for(int i = 0;i < arrbi.length; i++) {
            for(int j = 0;j < arrbi[i].length; j++) {
                System.out.print(arrbi[i][j]+" ");
            }
            System.out.println();
        }
    }
}