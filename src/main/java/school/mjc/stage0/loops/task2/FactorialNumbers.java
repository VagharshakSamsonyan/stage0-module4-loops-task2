package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            System.out.println(factorial(i));
            i++;
        }
    }

    private int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(5); // Change the argument to whatever you need
    }
}

