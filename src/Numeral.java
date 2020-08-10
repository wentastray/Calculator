public enum Numeral {
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);
    int num;

    Numeral(int num) {
        this.num = num;
    }

    public static String romanToArabicAnswer(int n) {

        if (n <= 0) {
            System.out.print("Когда были изобретены римские цифры, понятия нуля и отрицательных цифр не существовало. :-)");
        }

            StringBuilder buf = new StringBuilder();

            final Numeral[] values = Numeral.values();
            for (int i = values.length - 1; i >= 0; i--) {
                while (n >= values[i].num) {
                    buf.append(values[i]);
                    n -= values[i].num;
                }
            }
            return buf.toString();

    }
}