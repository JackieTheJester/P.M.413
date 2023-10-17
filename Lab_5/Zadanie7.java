//7. Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: если строка s4 равна строке s5, нужно сложить строки s1 и s2, иначе нужно сложить строки s1 и s3.

public class Zadanie7 {
    Zadanie7() {
        String s1 = "Привет";
        String s2 = "Пока";
        String s3 = "Мир";
        String s4 = "Здравствуй";
        String s5 = "До свидания";
        taskSix(s1, s2, s3, s4, s5);
    }
    
    public static void main(String[] args) {
        new Zadanie7();
    }
    
    private void taskSix(String s1, String s2, String s3, String s4, String s5) {
        if (s4.equals(s5)) {
            System.out.println(s1 + s2);
        } else {
            System.out.println(s1 + s3);
        }//Сравнение S4 и S5, от сюда либо S1 + S2, либо S1 + S3
    }
}