package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**   1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
          Введенное пользователем число сохраняется в переменную n.
      2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
      3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
      4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран. */
public class EvenElements {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите размер массива:");

            int n = 0;

            while (n <= 3) {
                if(sc.hasNextInt()){
                    n = sc.nextInt();
                    if(n <= 3){
                        System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                    }
                } else {
                    System.out.println("Вы ввели не число. Повторите ввод:");
                    sc.next();
                }
            }
            int [] mas1 = new int[n];
            int evenNums = 0;

            for (int i = 0; i < n; i++) {
                mas1[i] = (int)(Math.random()*(n+1));
                if(mas1[i]%2 == 0){
                    evenNums++;
                }
            }

            System.out.println(Arrays.toString(mas1));
            int [] mas2 = new int[evenNums];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(mas1[i]%2 == 0){
                    mas2[index] = mas1[i];
                    index++;
                }
            }
            System.out.println(Arrays.toString(mas2));
        }
    }

