public class Problem4 {


    // Find the largest palindrome made from the product of two 3-digit numbers.

    private static final int MIN_NUMBER = 101;
    private static final int MAX_NUMBER = 999;

    private static boolean is_number_palindrome(int number){
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static int find_largest_palindrome(){
        int largest_palindrome = -1;
        for (int i = MAX_NUMBER; i>=MIN_NUMBER; i--){
            for (int j = MAX_NUMBER; j>=MIN_NUMBER; j--){
                int product = i*j;
                if (product>largest_palindrome){
                    if (is_number_palindrome(product)) largest_palindrome = product;
                }
                else break;
            }
        }
        return largest_palindrome;
    }
}
