package Lab2;

import java.util.Scanner;

/*
        Даны два действительных числа. Необходимо получить их сумму, разность и произведение. Результат вывести на консоль.
*/
public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double rez1 = a + b;
        double rez2 = a - b;
        double rez3 = a * b;
                System.out.println(rez1);
                System.out.println(rez2);
                System.out.println(rez3);
    }
}