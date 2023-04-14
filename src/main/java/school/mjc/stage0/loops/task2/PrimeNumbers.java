package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int a = 0;
        while (a < 2) {
            a++;
        }
        int b = 2;
        while (a < printToInclusive) {
            while (b % a == 0 && a <= b) {
                System.out.println(a);
                b++;
            }
            a++;
        }
    }
}
