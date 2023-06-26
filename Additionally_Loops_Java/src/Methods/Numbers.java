package Methods;
//Напишите метод, который бы проверял, делится ли число на 2 без остатка или нет
public class Numbers {
    static boolean dividesByTwo(int a){
        return (a%2==0);
    }

    public static void main(String[] args){
        System.out.println( dividesByTwo(8) );
    }
}

