package Lab2;

import java.util.Scanner;

/*
        Определить время свободного падения материального тела с заданной высоты h. Результат вывести в консоль.
*/
public class Zadanie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        double h = scanner.nextDouble();
        System.out.print("Введите массу: ");
        double m = scanner.nextDouble();
        double rez = h / (m*9.8);
        System.out.println("время в секундах:" + rez);
    }
}
