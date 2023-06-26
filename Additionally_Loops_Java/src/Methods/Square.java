package Methods;
//Написать метод возведения числа в квадрат. И далее к результату прибавить число 2
public class Square {
    static int square(int a){
        int result = a*a;
        return result;
    }


    public static void main(String[] args){
        int a1 = square(5);
        System.out.println(a1);
        System.out.println(a1 + 2);

    }
}
