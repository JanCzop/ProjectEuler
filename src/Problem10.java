public class Problem10 {

    // Find the sum of all the primes below two million.

    // we use fact that prime is only in the form of 6k+1 or 6k-1 where k is a natural number

    private static final int PRIME_MAX = 2_000_000;

    public static long sum_all_primes() {
        long primes_sum = 5L;
        long k = 1L; // We skip numbers 2 and 3
        while ((6L * k - 1L) < PRIME_MAX) {

            if (Utils.prime_test(6L * k - 1L))
                primes_sum += 6L * k - 1L;
            if (Utils.prime_test(6L * k + 1L) && ((6L * k + 1L) < PRIME_MAX))
                primes_sum += 6L * k + 1L;
            k++;
        }
        return primes_sum;
    }

}
