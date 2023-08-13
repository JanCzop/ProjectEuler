import java.math.BigInteger;

public class Problem16 {

    // What is the sum of the digits of the number 2^1000

    private static final int BASE = 2;
    private static final int EXPONENT = 1_000;


    public static int calculate_exponentiation(){
        BigInteger big_number = BigInteger.valueOf(BASE).pow(EXPONENT);
        String str_number = big_number.toString();
        int sum = 0;
        for (char digit : str_number.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }

}
