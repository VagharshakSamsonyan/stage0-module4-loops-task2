package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        int exponent = 0;
        int result = 1;

        while (exponent <= power) {
            System.out.println(result);
            result *= 2;
            exponent++;
        }
    }

    public static void main(String[] args) {
        PowerOfTwo calculator = new PowerOfTwo();
        calculator.printPower(5); // Example: Calculate powers up to 2^5
    }
}
