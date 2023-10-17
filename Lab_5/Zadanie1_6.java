//1. Дан массив из целых чисел A(n), где n=1,25. Необ- ходимо поменять местами его максимальный и мини- мальный элемент.
//6. Измените программу 1 так, чтобы она выводила на консоль еще и максимальный элемент (с помощью описания нового метода, например maxX()).
public class Zadanie1_6 {
    public static void main(String[] args) {


        int[] A = new int[25];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100);
            System.out.println(A[i]);
        }//Создание массива
        int min = 100;
        int max = 1;
        int index = 0;
        int minindex = 0;
        int maxindex = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i]>A[index] & A[i]>max){
                max = A[i];
                maxindex = i;
            }
            if (A[i]<A[index] & A[i]<min){
                min=A[i];
                minindex = i;
            }
            if(i > index){
                index = i;
            }
        }// Поиск максимального и минимального
        int a = A[minindex];
        A[minindex] = A[maxindex];
        A[maxindex] = a;//Замена максимального на минимальный и на оборот
        System.out.println("Максимальное: "+ max);
        System.out.println("Минимальное: "+ min);
        for (int num : A) {
            System.out.print(num + ", ");
        }
    }
}