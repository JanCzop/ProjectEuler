import java.util.HashMap;

public class Problem12 {

    // What is the value of the first triangular number to have over five hundred divisors?

    // triangular numbers: 1+2+...+n = n-th triangular number

    // We use fact that integer number has number of factors according to prime factorization:
    // T = p1^a1*p2^a2*...*pn^an where T = total number of factors, p = prime factor, a = number of particular prime factor


    private static final int NUMBER_OF_FACTORS = 500;

    private static int count_integral_factors(int number) {
        HashMap<Integer, Integer> primeIntegrals = create_integral_factors_map(number);
        int totalFactors = 1;

        for (int count : primeIntegrals.values()) {
            totalFactors *= (count + 1);
        }

        return totalFactors;
    }

    private static HashMap<Integer, Integer> create_integral_factors_map(int number) {
        HashMap<Integer, Integer> prime_integrals = new HashMap<>();
        int n = number;
        int i = 2;
        while (n > 1) {
            if (n % i == 0 && Utils.prime_test(i)) {
                prime_integrals.put(i, prime_integrals.getOrDefault(i, 0) + 1);
                n /= i;
            } else {
                i++;
            }
        }
        return prime_integrals;
    }

    public static int find_integral_with_given_amount_of_factors(){
        int n_counter = 1;
        int current_triangular = 1;
        int amount_of_factors = 1;
        while(amount_of_factors<=NUMBER_OF_FACTORS){
            n_counter++;
            current_triangular += n_counter;
            amount_of_factors = count_integral_factors(current_triangular);
        }
        return current_triangular;
    }


}

