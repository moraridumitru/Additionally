package Arrays;
import java.util.Arrays;
/**  1. Создайте массив из 4 случайных целых чисел из отрезка [10;99]
     2. Выведите его на экран в строку.
     3. Далее определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью. */
public class AscendingArray {
        public static void main(String[] args) {
            int [] mas = new int[4];

            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int)(Math.random()*90)+10;
            }
            System.out.println(Arrays.toString(mas));

            boolean flag = true;
            for (int i = 1; i < mas.length; i++) {
                if(mas[i]<=mas[i-1]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Массив является строго возрастающей последовательностью");
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }
        }
    }