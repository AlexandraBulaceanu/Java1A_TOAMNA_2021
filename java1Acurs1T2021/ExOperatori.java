public class ExOperatori {
    public static void main(String [] args) {
        boolean b5 = true;
        boolean b6 = false;
        int x = 5;
        int y = 3;
        boolean b7 = b6&&((x=y)==x);//&& scurcircuitat => b6 e false deci nu evalueaza expr din dr
        boolean b8 = b6||((x=y)==x);//|| analog => b6 e false, nu isi da seama => este necesar sa evalueze si dr
        boolean b9 = 8>4 && b6;//aici se uita la ambele pt ca prima expresie este true
    }
}