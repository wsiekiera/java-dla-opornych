package net.siekiera;

/**
 * @see <a href="https://www.tutorialspoint.com/java/java_loop_control.htm">More about loop control</a>
 */
public class Loops {
    public static void main(String[] args) {
        //for (warunek poczatkowy; warunek zakonczenia; inkrementacja) {
        //    }
        for (int i=0; i<10; i++) {
            System.out.println("wartosc i wynosi " + i);
        }
        int j = 0;
        // while (warunek) {
        // instrukcje;
        // }
        while (j<10) {
            System.out.println("Wartosc j =" + j);
            j++;
        }
        int k = 100;

        // do {
        // instrukcje;
        // } while (warunek);
        do {
            System.out.println("Wartoc k =" + k);
        } while (k<100);
    }
}
