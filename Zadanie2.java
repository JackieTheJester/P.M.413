package Lab2;

import java.util.Scanner;

// Составьте программу расчета факториала для произвольного числа n<10.
public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 10: ");

        int f = scanner.nextInt();
        int rez = 1;

        for (int i=1; i<=f; i++) {
            rez *= i;

            System.out.println("Факториал" + i + " = " + rez);
        }
    }
}
