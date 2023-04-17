package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            double two = 0;
            int res;
            while (two <= power) {
                res = (int)Math.pow(2, two);
                System.out.println(res);
                two++;
            }
        }
    }
}
