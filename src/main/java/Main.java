public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация
        System.out.println("Результат возведения в степень: " + calc.pow(2, 5));
        System.out.println("Результат произведения: " + calc.mult(11, 11));
        System.out.println("Результат суммирования: " + calc.sum(100, 5));
    }
}
