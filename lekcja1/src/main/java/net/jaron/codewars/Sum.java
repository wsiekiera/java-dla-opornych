package net.jaron.codewars;

public class Sum
{
    public int GetSum(int a, int b)
    {
        if (a == b) return a;
        else return Sum(Math.min(a, b), Math.max(a, b));
    }

    private int Sum(int a, int b) {
        if (a <= b) return a + Sum(++a, b);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Sum().GetSum(2, -3));
    }
}