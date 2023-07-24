public class Problem9 {


    // A Pythagorean triplet is a set of three natural numbers a<b<c for which, a^2+b^2=c^2
    //There exists exactly one Pythagorean triplet for which a+b+c=1000.
    //Find the product a*b*c.

    private static final int SUM = 1000;


    public static int solve_problem(){
        for (int a=0; a<SUM/3; a++){
            for (int b=0; b<(SUM-a)/2; b++){
                int c = SUM-a-b;
                if((a+b+c==SUM) && (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))) return a*b*c;
            }
        }
        return -1;
    }

}
