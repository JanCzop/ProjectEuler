
public class Utils {

    private static boolean prime_test(int number){
        if (number<=0) return false;
        else if (number==2 || number==3) return true;
        else if(number%2==0 || number%3==0) return false;
        for (int i=5; i*i<=number;i+=6){ // we start with 6k-1=5, and we move to another 6k-1 by adding 6 (one k)
            if (number%i==0 || (number+2)%i==0) return false; // we check 6k-1 and 6k-1+2=6k+1
        }
        return true;
    }

}
