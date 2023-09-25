package Lab2;

import java.util.Scanner;

/*
        С помощью цикла вычислите значение выражения 2^n.
*/
public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        double n = scanner.nextDouble();
        int i = 0;
        double rez = 2;
        if( n < 0 ) {
            for (i = -1; i > n; i--){

                rez *= 2;
                System.out.println("2 ^ " + (i+1) + " = " + 1/rez);
            }
        } else {
            for (i =0; i < n; i++){

                rez = rez * 2;
                System.out.println("2 ^ " + (i+1) + " = " + rez);
            }
        }

    }
}
