package Arrays;
import java.util.Arrays;
/**  1. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
     2. Выведите массивы на экран в двух отдельных строках
     3. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)*/
public class Average {

        public static void main(String[] args) {
            int [] mas1 = new int[5];
            int [] mas2 = new int[5];

            for (int i = 0; i < 5; i++) {
                mas1[i] = (int)(Math.random()*6);
                mas2[i] = (int)(Math.random()*6);
            }
            System.out.println(Arrays.toString(mas1));
            System.out.println(Arrays.toString(mas2));

            double average1 = 0;
            double average2 = 0;

            for (int i = 0; i < 5; i++) {
                average1 += mas1[i];
                average2 += mas2[i];
            }
            average1/=5;
            average2/=5;

            if(average1 > average1){
                System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                        "второго массива ("+average2+")");
            } else if(average1 < average2){
                System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                        "второго массива ("+average2+")");
            } else {
                System.out.println("Средние арифметические массивов равны ("+average1+")");
            }
        }
    }

