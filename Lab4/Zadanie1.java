package Lab4;

import java.util.Scanner;

//Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью. Например, для цифры 9 на консоли должна быть напечатана строка «Девять».

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9: ");
        int n = sc.nextInt();
        String[] w = new String[10]; //Создаётся список из 10 элементов
        for (int i=0;i<10;i++)
        {
            w[0]="Ноль";
            w[1]="Один";
            w[2]="Два";
            w[3]="Три";
            w[4]="Четыре";
            w[5]="Пять";
            w[6]="Шесть";
            w[7]="Семь";
            w[8]="Весемь";
            w[9]="Девять";
        }
        if (n<0 || n >9){
            System.err.println("Ошибка.");}
        else {
            System.out.println(w[n]); //Если вводимое число выходит из указаного диапозона, то выводится ошибка, иначе выводится значение выбраного элемента списка
        }
    }
}
