package Loops_In_Java;

public class DisplayNumbers {
    public static void main(String[] args) {
        for (int i=1; i <= 5; i++) {    // вывести на экран числа от 1 до 5
            System.out.print (i + " ");
        }
        System.out.println ("  ");     // вывести на экран числа от 5 до 1
        for (int i=5; i>=1; i--) {
            System.out.print (i + " ");
        }
    }
}

