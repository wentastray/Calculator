public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два арабских или два римских числа от 1 до 10 и знак операции между ними через пробел (пример:2 + 2 или II / II)");

        Parser reader = new Parser();

        while (true) {
            try {
                reader.pars();
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                System.exit(1);
            }

            int result = Calculator.calculate(reader.getNum1(), reader.getNum2(), reader.getOperation());
            System.out.println(result);
        }
    }
}
