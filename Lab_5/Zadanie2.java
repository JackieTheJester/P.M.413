import java.util.Random;

// 2. Дан массив из целых чисел B(n), где n=1,25. Необ- ходимо упорядочить массив по возрастанию.

public class Zadanie2 {
    private int[] B = new int[25];
    
    Zadanie2() {
        generate(B);
        printer("Массив: ", B);
        sort(B);
        printer("Массив после сортировки: ", B);
    }
    
    public static void main(String[] args) {
        new Zadanie2();
    }
    
    private void sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] < mas[j]) {
                    int tmp = mas[j];
                    mas[j] = mas[i];
                    mas[i] = tmp;
                }
            }
        }
    } // Сортировка по возрастанию
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