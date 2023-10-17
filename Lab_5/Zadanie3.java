import java.util.Random;

// 3. Дан массив из целых чисел С(n), где n=1,20. Необ- ходимо найти среднее значение и вывести его на кон- соль.

public class Zadanie3 {
    private int[] C = new int[25];
    
    Zadanie3() {
        generate(C);
        printer("Массив: ", C);
        System.out.println("Среднее значение: " + findsred(C));
    }
    
    public static void main(String[] args) {
        new Zadanie3();
    }
    
    private double findsred(int[] mas) {
        double sum = 0;
        for (int i : mas) {
            sum += i;
        }
        return sum / mas.length;
    } //Нахождение среднего
    private void generate(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }
    } //Генерация массива
     private void printer(String index, int[] mas) {
        String res = index;
        for (int i : mas) {
            res += i + " ";
        }
        System.out.println(res);
    } //Вывод массива
}