package Arrays;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Itroduceti fraza utilizand doar cite un spatiu intre cuvinte:");
        String input = sc.nextLine();
        //Начальное количество слов равно 0
        int count = 0;

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if(input.length() != 0){
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }

        System.out.println("Ati introdus "+count+" cuvinte");
    }
}

