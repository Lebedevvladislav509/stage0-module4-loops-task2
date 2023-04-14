package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a =0;
        int fuk = 0;
        while(a<=printToInclusive){
            fuk *=fuk;
            System.out.println(fuk);
            a++;
            fuk++;
        }
    }
}
