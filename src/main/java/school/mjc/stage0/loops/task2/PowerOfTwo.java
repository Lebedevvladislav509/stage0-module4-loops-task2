package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        int two = 2;
        int res = 0;
        while (two <= power) {
            two *= res;
            System.out.println(two);
            res++;
        }
    }
}
