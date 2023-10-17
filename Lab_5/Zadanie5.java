import java.util.Random;

// 5. Напишите программу, выводящую на консоль та- блицу 3х5 случайных элементов (a(i,j)< 10).

public class Zadanie5 {
    private int[][] array = new int[3][5];
    
    Zadanie5() {
        generate(array, 3, 5);
        printer("Матрица: ", array);
    }
    
    public static void main(String[] args) {
        new Zadanie5();
    }
    
    private void generate(int[][] array, int N, int M) {
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = random.nextInt(10) - 5;
            }
        }
    }//Генерация двухмерного массива
    
     private void printer(String prefix, int[][] array) {
        String res = prefix + "\n";
        for (int vec[] : array) {
            for (int i : vec) {
                res += i + "\t";
            }
            res += "\n";
        }
        System.out.println(res);
    }//Вывод двухмерного массива
}
