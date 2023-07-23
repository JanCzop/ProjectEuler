
public class Problem1 {

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

    private static final int DIVISOR_3 = 3;
    private static final int DIVISOR_5 = 5;
    private static final int MAX_RANGE = 999;

    private static boolean ALTERNATIVE_METHOD;



    // O(n)
    public static int find_multiples_naive() {
        int sum = 0;
        for (int i = 3; i <= MAX_RANGE; i++) {
            if (i % DIVISOR_3 == 0 || i % DIVISOR_5 == 0) sum += i;
        }
        return sum;
    }

    // O(1)

    // sum of sequence is n*(2a1+(n-1)*d)/2 where n is total length of sequence, a1 is the first term and d is the terms difference between them
    //  or n*(a1+an)/2 where n is total length of sequence, a1 is first term and an is the last.
    public static int find_multiples_optimal(){
        return    calculate_sum_of_sequence(MAX_RANGE/DIVISOR_3,DIVISOR_3,DIVISOR_3) // 3
                + calculate_sum_of_sequence(MAX_RANGE/DIVISOR_5,DIVISOR_5,DIVISOR_5) // 5
                - calculate_sum_of_sequence(MAX_RANGE/(DIVISOR_3*DIVISOR_5),DIVISOR_3*DIVISOR_5,DIVISOR_3*DIVISOR_5); // 3 and 5 at the same time
    }
    private static int calculate_sum_of_sequence(int n, int a1, int d){
        return n*(2*a1+(n-1)*d)/2;
    }
    private static int calculate_sum_of_sequence_gauss(int n, int a1, int an){
        return n*(a1+an)/2;
    }


}