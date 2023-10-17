import java.util.Random;

// 4. Дан массив из целых чисел D(n), где n=1,30. Посчи- тайте сумму четных и нечетных элементов массива.

public class Zadanie4 {
    private int[] D = new int[25];
    private static final int nechet = 0;
    private static final int chet = 1;
    
    Zadanie4() {
        generate(D);
        printer("Массив: ", D);
        System.out.println("Сумма чётных элементов: " + getSum(D, chet));
        System.out.println("Сумма нечётных элементов: " + getSum(D, nechet));
    }
    
    public static void main(String[] args) {
        new Zadanie4();
    }
    private int getSum(int[] mas, int type) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0 && type == chet) {
                sum += mas[i];
            } else if (i % 2 != 0 && type == nechet) {
                sum += mas[i];
            }
        }
        return sum;
    }//Нахождение сумм чётных и нечётных элементов
    
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