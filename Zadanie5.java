package Lab2;

import java.util.Scanner;

/*
        Составьте программу для нахождения длины катета прямоугольного треугольника (b), если известны длины гипотенузы (c) и катета (a). Результат вывести на консоль.
*/
public class Zadanie5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите гипотенузу: ");
        double c = scanner.nextDouble();
        System.out.print("Введите катет: ");
        double a = scanner.nextDouble();
        double rez = ((c*c)-(a*a));
        System.out.println("Искомый катет:" + Math.sqrt(rez));
    }
}
