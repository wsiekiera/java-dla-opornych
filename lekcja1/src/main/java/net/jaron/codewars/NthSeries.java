package net.jaron.codewars;

public class NthSeries {

    public static String seriesSum(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1 / (3 * ((double)i - 1) + 1);
        }
        return String.format("%.2f", sum).replace(",",".");
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(2));
    }
}