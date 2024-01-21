public class CreditCardValidator {
    /* Return true if the vredit card number is valid */
    public static boolean isValid(long number) {
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    /* Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numString = Long.toString(number);

        for (int i = numString.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numString.charAt(i));
            sum += getDigit(digit * 2);
        }

        return sum;
    }

    /* Return this number if it is a single digit, otherwise, return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    /* Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numString = Long.toString(number);

        for (int i = numString.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numString.charAt(i));
        }

        return sum;
    }

    /* Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /** Return number of digits in d */
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    /* Return the first k number of digits from number. If number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numString = Long.toString(number);
        if (k > numString.length()) {
            return number;
        } else {
            return Long.parseLong(numString.substring(0, k));
        }
    }
}