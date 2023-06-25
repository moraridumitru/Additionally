package Loops_In_Java;
/**Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как ниже.
 * * * * *
 * * * * *
 * * * * *
                                  */
public class FigureStars {
    public static void main(String[] args){

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
