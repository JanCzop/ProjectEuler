import java.util.ArrayList;

public class Problem14 {


    // Longest Collatz sequence

    // n->n/2 (even n)
    // n->3n+1 (odd n)


    // Which starting number, under one million, produces the longest chain?

    private static final int HIGHEST_STARTING_NUMBER = 1_000_000;

    public static int solve_problem_naive_method(){ // REALLY BAD O(n^3)
        int longest_chain = 0;
        for (int i = 2; i <= HIGHEST_STARTING_NUMBER; i++) {
            int n = i;
            int current_chain = 1;
            while(n!=1){
                if (n%2==0) n/=2;
                else n = 3*n+1;
                current_chain++;
            }
            current_chain++;
            if(current_chain>longest_chain) longest_chain = current_chain;
            System.out.println();
        }
        return 0;
    }

    public static int solve_problem_eliminate_method(){ // OPTIMAL O(n_log_n)
        int[] res_array = new int[HIGHEST_STARTING_NUMBER];
        res_array[0] = 1;
        int longest_chain = 0;
        int longest_chain_index = 0;
        for (int i = 2; i <= HIGHEST_STARTING_NUMBER; i++) {
            long n = i;
            int current_chain = 1;
            //System.out.print("Starting "+n +" ; ");
            while(n!=1){
                if(n<i){
                    current_chain += res_array[(int)(n)-1]-1;
                    n = 1;
                }
                else {
                if (n%2==0) n/=2;
                else n = 3*n+1;
                current_chain++;
                }
            }
            res_array[i-1] = current_chain;
            if (current_chain>longest_chain) {
                longest_chain = current_chain;
                longest_chain_index = i;
            }
            //System.out.println("size="+current_chain);

        }
        return longest_chain_index;
    }
}
