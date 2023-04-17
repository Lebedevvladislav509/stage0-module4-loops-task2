package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int a = 1;
        int fac = 1;
        System.out.println("1");
        while (a <= printToInclusive) {
            fac = a * fac;
            System.out.println(fac);
            a++;
        }
    }
}
