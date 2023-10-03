package Lab3;

import java.util.Scanner;

//Вычислить выражение 1-1/2+1/3-1/4+...+1/9999-1/10000 используя оператор условия.
public class Zadanie2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10000: ");
        int n = sc.nextInt();
double res = 0;
        for(double i = 1; i<=n; i++){
            double a = 1/i; // деление числа 1 на число i, которое начиная со значения 1 увеличиваться на 1 до вводимого числа n
            if (i % 2 == 0){
                res -= a; // если число i делится без остатка на 2, то использовать знак -, иначе +
            } else {
                res += a;
            }
        }
        System.out.println(res);
    }
}