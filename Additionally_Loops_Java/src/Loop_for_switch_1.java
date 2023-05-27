/** Să ne imaginăm că avem o ghicitoare: „Felinar cu trei culori
 I-ajută pe trecători.”
 *  Răspuns: semaforul.
 *
 */
import java.util.Scanner; // подключаем сканер
public class Loop_for_switch_1 {
    public static void main (String [] args) {
        String answer;
        boolean exit;
        System.out.println ("Felinar cu trei culori\n" +
                " I-ajută pe trecători. Ce este?");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = inputAnswer.next ();
            switch (answer){
                case ("Semaforul"):
                    System.out.println ("Corect!");
                    exit = true;
                    break;
                case ("Nustiu"):
                    System.out.println ("Răspuns corect: semaforul");
                    exit = true;
                    break;
                default:
                    System.out.println("Mai gindestete");
            }
        }
    }
}