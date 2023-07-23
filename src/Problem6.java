public class Problem6 {


    // Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

    // Formulas proofed by Newton's formula
    // 1+2+..+n = n(n+1)/2
    // 1^2+2^2+...+n^2 = n(n+1)(2n+1)/6


    private static final int N = 100;

    private static int calculate_sum_of_squares(){
        return N*(N+1)*(2*N+1)/6;
    }
    private static int calculate_sum(){
        return N*(N+1)/2;
    }
    private static int calculate_square_of_sum(){
        return calculate_sum()*calculate_sum();
    }

    public static int calculate_problem(){
        return calculate_square_of_sum()-calculate_sum_of_squares();
    }
}
