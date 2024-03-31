package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return; // If the input is 0, do nothing
        }

        int absValue = Math.abs(multiplyByAndToInclusive);
        int i = 0;
        while (i <= absValue) { // Adjusted loop condition
            int result = i * multiplyByAndToInclusive;
            System.out.println(result);
            i++;
        }
    }

}






