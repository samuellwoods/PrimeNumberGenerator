import java.util.Scanner;

public class PrimeGen {
    public static void main(String[] args) {
        long start = System.nanoTime();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primes between 0 and: ");
        int upper = Integer.parseInt(scanner.nextLine());
        scanner.close();

        int primes = 0;
        int num;
        for (int i = 2; i < upper; i++) {
            num = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    num++;
                }
                
            }
            if(num == 0){
                System.out.println(i);
                primes++;
            }
        }
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println();
        System.out.println("Number of primes between 0 and " + upper + ": " + primes);
        System.out.println("Computation took: " + (((double)difference)/1000000000) + " seconds" );
    }
}