package net.jaron.codewars;

class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
       int howManyYears = 0;
       while (p0 < p) {
           p0 += p0 * percent / 100 + aug;
           howManyYears++;
       }
       return howManyYears;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1000,2,50,1200));
    }
}
