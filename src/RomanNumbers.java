public class RomanNumbers {
    public static boolean sortRoman(String a) {
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String s : roman) {
            if (a.contains(s)) {
                return true;
            }
        }
        return false;
    }

    static int romanToArabic(String roman) {

        return switch (roman) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new IllegalStateException();
        };
    }
}