import java.util.Scanner;

public class zadanie1 {
    public static void main(String args[]){
        int numberof5000, numberof2000, numberof1000, numberof500, numberof200, numberof100, numberof50;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        
        int amount = scanner.nextInt();
        
        numberof5000 = amount / 5000;
        amount %= 5000;
        System.out.println("Кол-во 5000 купюр: " + numberof5000 + " остаток: " + amount);
        numberof2000 = amount / 2000;
        amount %= 2000;
        System.out.println("Кол-во 2000 купюр: " + numberof2000 + " остаток: " + amount);
        numberof1000 = amount / 1000;
        amount %= 1000;
        System.out.println("Кол-во 1000 купюр: " + numberof1000 + " остаток: " + amount);
        numberof500 = amount / 500;
        amount %= 500;
        System.out.println("Кол-во 500 купюр: " + numberof500 + " остаток: " + amount);
        numberof200 = amount / 200;
        amount %= 200;
        System.out.println("Кол-во 200 купюр: " + numberof200 + " остаток: " + amount);
        numberof100 = amount / 100;
        amount %= 100;
        System.out.println("Кол-во 100 купюр: " + numberof100 + " остаток: " + amount);
        numberof50 = amount / 50;
        amount %= 50;
        System.out.println("Кол-во 50 купюр: " + numberof50 + " остаток: " + amount);
    }
}