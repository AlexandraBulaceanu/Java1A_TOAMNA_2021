public class Dreptunghi extends Forma {
    int l = 5;
    int h = 6;
    @Override
    public double getArie() {
        return l*h;//obligata sa suprascriu metoda daca las clasa Dreptunghi concreta
    }
}