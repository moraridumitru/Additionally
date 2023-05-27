/**The program needs to display the following sequence:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98 105 112**/
public class Loop_while_1 {
    public static void main(String[] args){
        int a = 7;
        while (a <= 112) {
            System.out.print (a+" ");
            a+=7;  /** increment the variable by 7. Note that a+=7; this is the same as a = a+7;
             These are the so-called shorthand arithmetic operations.**/
        }
    }
}
