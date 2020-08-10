public class Calculator {

    public static int calculate(int num1, int num2, char operation){

        int result = 0;

        if (operation=='+') result = num1+num2;
        else if (operation=='-') result = num1-num2;
        else if (operation=='*') result = num1*num2;
        else if (operation=='/') result = num1/num2;
        else try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.err.println("Неверный знак");
            }
        return result;
    }
}