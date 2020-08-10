import java.util.Scanner;

public class Parser {

    private int num1;
    private int num2;
    private char operation;

    Scanner scanner = new Scanner(System.in);

    public void pars() {

        try {
            String text = scanner.nextLine();
            String[] blocks = text.split(" ");
            operation = blocks[1].charAt(0);
            if (RomanNumbers.sortRoman(text)) {
                num1 = RomanNumbers.romanToArabic(blocks[0]);
                num2 = RomanNumbers.romanToArabic(blocks[2]);
            } else {
                num1 = Integer.parseInt(blocks[0]);
                num2 = Integer.parseInt(blocks[2]);
            }
        } catch(RuntimeException e) {
            throw new IllegalArgumentException("Неверный формат");
        }

        if ((num1 > 10 || num1 < 1) || (num2 > 10 || num2 < 1))
            throw new IllegalArgumentException("Введено число больше или меньше необходимого");
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperation() {
        return operation;
    }
}