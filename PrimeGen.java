import java.util.Scanner;

/**
 * NAME: SAMUEL WOODS
 * DATE: 10/31/2020
 * 
 * This program calculates and prints to terminal 
 * the number of prime numbers between 0 and n 
 * where n is specified by the user
 */

 /**
  * This classes' purpose is to contain the main method
  */
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
        
        int num; //counts the number of elements that divide i//
        for (int i = 3; i < upper; i+=2) {//only tries odds//
            num = 0;
            for (int j = 2; j <= i/2; j++) {//n can only be divided by numbers half of it//
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