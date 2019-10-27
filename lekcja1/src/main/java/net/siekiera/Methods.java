package net.siekiera;

import net.siekiera.tasks.BasicOperations;

/**
 * @see <a href="https://www.tutorialspoint.com/java/java_methods.htm">More about methods</a>
 */
public class Methods {
    public static void main(String[] args) {
        System.out.println(dodajLiczby(1,2));
        System.out.println(dodajLiczby(3.1f, 9));
    }

    public static int dodajLiczby(int liczba1, int liczba2) {
        System.out.println("Inside");
        int suma = liczba1 + liczba2;
        return suma;
    }

    public static float dodajLiczby(float liczba1, int liczba2) {
        System.out.println("Inside");
        float suma = liczba1 + liczba2;
        return suma;
    }
}
