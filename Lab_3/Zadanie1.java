package Lab3;

import java.util.Scanner;

//Создайте приложение, которое покажет, что для выражения a^n+b^n=c^n (теорема Ферма) нет натуральных решений от 1 до 100 и n>2. Убедитесь, что есть решения для n=2, и выведите их в консоль.
public class Zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100: ");
        int n = sc.nextInt();

        if(n<0 || n>100){
            System.err.println("Решений нет");
        } // если вводимое число n меньше 0 или больше 100, то выводится ошибка
        for(int i = 1; i<=100; i++){
            for(int j=1; j<=100; j++){
                for (int k = 1; k<=100; k++){
                    double a = Math.pow(i, n); // возведение числа i в степень n
                    double b = Math.pow(j, n);
                    double c = Math.pow(k, n);
                    if (a + b == c){
                        System.out.print(i +" ^ " + n + " + " + j + " ^ " + n + " = " + k + " ^ " + n); // если выражения a + b == c верно, то вывод решения, иначе вывод ошибки
                    } else {
                        System.err.println("Решений нет!");
                        return;
                    }
                }
            }
        }
    }
}