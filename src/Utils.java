import java.util.function.Supplier;

public class Utils {

    public static long calculate_execution_time(Supplier<Integer> methodToExecute) {
        long startTime = System.currentTimeMillis();
        methodToExecute.get();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
