
public class Utils {


    public static boolean prime_test(int number){
        if (number <= 0) return false;
        else if (number == 2 || number == 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }
    public static boolean prime_test(long number){
        if (number <= 0) return false;
        else if (number == 2 || number == 3) return true;
        else if (number % 2 == 0 || number % 3 == 0) return false;
        for (long i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }



}
