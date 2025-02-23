package chapter05;

public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50; // Number of primes to display.
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line.
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        //  Repeatedly find prime numbers.
        while (count < NUMBER_OF_PRIMES) {
            //  Assume the number if prime.
            boolean isPrime = true;

            //  Test whether number is prime.
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime.
                    isPrime = false;
                    break;
                }
            }

            //  Display the prime number and increase the count.
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //  Display the number and advance to the new line.
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            //  Check if the next number is prime.
            number++;
        }
    }
}
