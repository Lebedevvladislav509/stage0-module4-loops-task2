package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        out:
        for (int i = 2; i <= printToInclusive; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue out;

                }
                //System.out.println(i);
            }
            System.out.println(i);
        }
    }
}

