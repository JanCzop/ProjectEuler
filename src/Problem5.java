public class Problem5 {

    // What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20 ?

    private static final int MIN_NUMBER = 11; // if it is divisible by all numbers from 11 to 20 it is also from 1 to 10!!
    private static final int MAX_NUMBER = 20;

    private static boolean is_evenly_divisible(int number){
        for (int i = MIN_NUMBER; i<=MAX_NUMBER; i++){
            if (number%i!=0) return false;
        }
        return true;
    }

    public static int find_smallest_number(){
        int number = MAX_NUMBER;
        while (!is_evenly_divisible(number)){
            number += MAX_NUMBER;          // we do not have to search numbers between these divided by 20 which is the highest
        }
        return number;
    }
}
