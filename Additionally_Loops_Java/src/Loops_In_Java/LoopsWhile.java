package Loops_In_Java;
/**Необходимо, чтоб программа выводила на экран вот такую последовательность:

 7 14 21 28 35 42 49 56 63 70 77 84 91 98 */
public class LoopsWhile {

    public static void main(String[] args){
        int a = 7;
        while (a <= 98) {
            System.out.print (a+" ");
            a+=7;
        }
        /**Необходимо вывести на консоль такую последовательность чисел:

         1 2 4 8 16 32 64 128 256 512*/
        System.out.println(" ");
        int n = 1;
        while (n < 1024) {
            System.out.print (n + " ");
            n*=2;
        }
    }
}
