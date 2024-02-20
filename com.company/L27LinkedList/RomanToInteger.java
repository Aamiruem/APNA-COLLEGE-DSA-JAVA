// public class RomanToInteger {

//     public String intToRoman(int num) {
//         final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
//         final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L",
//                 "XL", "X", "IX", "V", "IV", "I" };
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < values.length; ++i) {
//             if (num == 0)
//                 break;
//             while (num >= values[i]) {
//                 num -= values[i];
//                 sb.append(symbols[i]);
//             }
//         }

//         return sb.toString();
//     }
// }






public class RomanToInteger {

    public String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Input should be between 1 and 3999");
        }

        final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; ++i) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}
