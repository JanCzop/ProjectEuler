public class Problem3 {


    // What is the largest prime factor of the number n


    private static final long NUMBER = 600851475143L;

    public static long find_highest_prime_factor(){
        long n = NUMBER;
        long prime = -1;
        while(n%2==0) {                 // we are getting rid of even factors
            n/=2; // change to n>>=1;
            prime = 2;
        }
        while(n%3==0) {                 // we are getting rid of factor 3
            n/=3; // change to n>>=1;
            prime = 3;
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                prime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                prime = i + 2;
                n = n / (i + 2);
            }
        }
        if (n > 4)
            prime = n;

        return prime;
    }


}
