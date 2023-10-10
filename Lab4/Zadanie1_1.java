package Lab4;

import java.util.Scanner;

//Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью. Например, для цифры 9 на консоли должна быть напечатана строка «Девять».

public class Zadanie1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9: ");
        int n = (int) (Math.random()*9); // Выберается случайное число в диапозоне от 0 до 9

        switch (n) {
            case 0 -> System.out.println(n +" Ноль");
            case 1 -> System.out.println(n +" Один");
            case 2 -> System.out.println(n +" Два");
            case 3 -> System.out.println(n +" Три");
            case 4 -> System.out.println(n +" Четыре");
            case 5 -> System.out.println(n +" Пять");
            case 6 -> System.out.println(n +" Шесть");
            case 7 -> System.out.println(n +" Семь");
            case 8 -> System.out.println(n +" Восемь");
            case 9 -> System.out.println(n +" Девять");
            default -> System.out.println("Ошибка. Введите число от 0 до 9"); //Выводится то значение которое соответсвует выбраному числу, если такого числа нет, то выводится ошибка
        }
    }
}
