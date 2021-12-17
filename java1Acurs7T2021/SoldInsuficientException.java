public class SoldInsuficientException extends Exception {
    public SoldInsuficientException() {
        super("Nu ai suficienti bani pe card. Incearca alta suma!");
    }
}