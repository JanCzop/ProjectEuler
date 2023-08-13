public class Main {
    public static void main(String[] args) {
        String wynik = "Wynik:";
        String czas = "Czas:";
        long start_time = System.currentTimeMillis();
        int result = Problem16.calculate_exponentiation();
        long end_time = System.currentTimeMillis() - start_time;

        int ADJUSTING = 7;
        System.out.printf("%-"+ADJUSTING+"s %s%n", wynik, result);
        System.out.printf("%-"+ADJUSTING+"s %d ms%n", czas, end_time);
    }





}

