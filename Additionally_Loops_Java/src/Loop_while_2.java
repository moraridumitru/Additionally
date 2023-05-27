/** You need to output the following sequence of numbers to the console:
 1 2 4 8 16 32 64 128 256 512
 */
public class Loop_while_2 {
    public static void main(String[] args){
        int n = 1;
        while (n <= 512) {
            System.out.print (n + " ");
            n*=2;  // each time the number is multiplied by 2, we write in the code
        }
    }
}
