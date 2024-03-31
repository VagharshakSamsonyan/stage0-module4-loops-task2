package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 0;

        while (num <= printToInclusive) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            num++;
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(20); // Change the argument to print prime numbers up to a different number
    }
}
