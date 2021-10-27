// Lab11av80.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11av80
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX + 1];   // creates array
       
                
        computePrimes(primes);
        displayPrimes(primes);
        
    }
 
    public static void computePrimes(boolean primes[])
    {
        System.out.println("COMPUTING PRIME NUMBERS");
      for (int x = 0; x < primes.length; x++) {  //This loop sets the array
            primes[x] = true;
       }                     
        for (int i = 2; i < primes.length; i++)  //it starts at one, because that's 2 in index
        {
             if (primes[i] ) {
             for (int j = i*2; j < primes.length; j += i) {  
                 //System.out.println("fejivud");
                 primes[j] = false;   //sets multiples of primes to not prime
                                                   
                                 }
        }
      }
    }
    public static void displayPrimes(boolean primes[])
    {
        String primeNumbers = "";
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        for(int y = 2; y < primes.length; y++) {  //this generates the string based off all primes
            if (primes[y]) {
           primeNumbers = primeNumbers + y + ",";
            
        }
        }
        System.out.println(primeNumbers);
         System.out.println();
         System.out.println("Press any key to continue...");
   }
}



