public class TopLevelOuter {
    int x;
    private static int y;
    
   public class InnerNonStatica {
        //clasa TopLevelOuter este clasa outer pentru InnerNonStatica
        //cls outer != cls superioara
        int z;
        int x;
        
        public void m1() {
            this.x = 4;
            TopLevelOuter.this.x = 6;//outer.this.camp
        }
    }
    
    public static class InnerStatica {
        public void m2() {
            //x = 5; -> x este atribut => nu este accesibil
            y = 8;
        }
    }
}