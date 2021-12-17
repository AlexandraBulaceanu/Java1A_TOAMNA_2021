public class ExString {
    public static void main(String [] args) {
        String s = "programare";
                 // 0123456789  
        System.out.println(s.charAt(2)); //o
        System.out.println(s.indexOf('m')); //6
        System.out.println(s.contains("gra")); //true
        System.out.println("bana".compareTo("bcu"));
        System.out.println("buna".compareToIgnoreCase("Bau"));
        System.out.println("buna".equals("buna"));
        System.out.println(s.startsWith("pro")); //true
        System.out.println(s.endsWith("nare")); //flase
        System.out.println(s.length()); //10
        System.out.println("AbC".toLowerCase()); //abc
        System.out.println("AbC".toUpperCase()); //ABC
        System.out.println(s.substring(2,6)); //=>[2,6) -> ogra
        System.out.println(s.substring(5)); // amare
        //System.out.println(s.substring(6,2)); //exceptie cand start > end
        System.out.println(s.substring(2,10)); //ogramare
        //System.out.println(s.substring(2,11)); //exceptie StringIndexOutOfBoundException
        System.out.println(" buna hei ".trim()); //"buna hei"
        System.out.println("buna".concat("Andrei"));//bunaAndrei
        System.out.println(s.replace("ro","jk")); //pjkgramare
        System.out.println(String.valueOf(5)); //"5"
        
        String sir = "buna"; //  "buna"
        sir+=" Alexandra"; //=> sir -> "buna Alexandra"
    }
}