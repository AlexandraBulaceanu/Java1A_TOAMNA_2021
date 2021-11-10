public class B extends A{
    public B() {
        System.out.println("constructor clasa B");
    }
    public B(String mesaj) {
        //super(); - exista adaugat in mod default de catre compilator
        System.out.println(mesaj);
    }
}