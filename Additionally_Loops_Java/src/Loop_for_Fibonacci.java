/**
 * Display the first 11 terms of the Fibonacci sequence. We remind you that:
 * the first and second members of the sequence are equal to ones
 * and each next one is the sum of the previous two
 */
public class Loop_for_Fibonacci {
    public static void main(String[] args){
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 11; i++){   //And then, using the for loop, we sum the 2 previous numbers of the sequence to get a new number of the sequence. As well as the cycle with the condition i<=11, because according to the condition of the problem, we need to display the first 11 numbers of the Fibonacci sequence.
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}

