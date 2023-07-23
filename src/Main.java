public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //
        String s = "Wynik: ";
        System.out.println(s+Problem6.calculate_problem());
        ///
        long endTime = System.currentTimeMillis();
        System.out.println("Czas oczekiwania:"+(endTime - startTime));
    }
}

