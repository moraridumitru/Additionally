
/**Write a program where the user enters any positive integer. And the program sums up all numbers from 1
 * to the number entered by the user. For example:
 * if the user enters the number 3. The program should calculate the sum of the numbers from 1 to 3, that is, 1+2+3,
 * and give the answer 6.
 * if the user enters the number 5. The program should calculate the sum of the numbers from 1 to 5, that is, 1+2+3+4+5,
 * and give the answer 15.
 **/
import java.util.Scanner; //connect the scanner from the java.util library using this line
public class Looop_for_4 {
    public static void main(String[] args) {
        System.out.print("Enter any positive integer number: ");
        Scanner sc = new Scanner(System.in); //declare scanner
        int n = sc.nextInt(); //read the entered integer from the console. To do this, use the nextInt () method100
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}