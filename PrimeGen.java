import java.util.Scanner;

public class PrimeGen {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primes between 0 and: ");
        int upper = Integer.parseInt(scanner.nextLine());
        scanner.close();

        long start = System.nanoTime();
        System.out.println("Computing...");
        System.out.println("2");

        int primes = 1;
        int num;
        for (int i = 3; i < upper; i+=2) {
            num = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    num++;
                    break;
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