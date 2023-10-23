import java.util.Scanner;

public class zadanie2 {
    public static void main(String args[]){
        double M, T, c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму кредита: ");
        
        double A = scanner.nextDouble();
        
        System.out.print("Введите ежемесячную процентную ставку: ");
        double i = scanner.nextDouble();
        
        System.out.print("Введите срок кредита в месяцах: ");
        double n = scanner.nextDouble();
        
        c = (1+i);
        
        M = (A*i)/(1-(1/Math.pow(c, n)));
        System.out.println("Ежемесячный платёж: " + M);
        
        T = M * n;
        System.out.println("Стоимотсь кредита: " + T);
    }
}