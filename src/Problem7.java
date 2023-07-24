public class Problem7 {

    // What is the 10_001 st prime number?


    // Every integer number can be expressed by 6k+i where i is {-1,0,1,2,3,4}
    // it can be proofed that prime number is expressed by 6k+1 or 6k-1
    // it is helpful to use that to improve complexity to O(sqrt(n))

    private static final int PRIME_TO_FIND = 10_001;

    // TO COPY TO UTILS
    private static boolean prime_test(int number){
        if (number <= 0) return false;
        else if (number == 2 || number == 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }

    public static int find_direct_prime(){
        int number = 2;
        int counter = 0;

        while (counter != PRIME_TO_FIND) {
            if (prime_test(number)) {
                counter++;
            }
            number++;
        }

        return number - 1;
    }
}
