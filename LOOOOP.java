import java.util.Scanner;
import java.util.Random;

public class LOOOOP{
public static void main (String[]args){

Random randomNumber= new Random();
Scanner sc = new Scanner (System.in);
int numberGuess = randomNumber.nextInt(100);
int Tries = 0;

int guess;
boolean win = false;
while(win == false) {
System.out.println("Guess a number (1-100): ");
guess = sc.nextInt();
Tries++;

if (guess == numberGuess){
System.out.println("You Win");
System.out.println("The Number was " + numberGuess);
System.out.println("Tries " + Tries +" before you guess the number");

win=true;
} else if (guess < numberGuess) {
System.out.println("Tries ;" + Tries);
System.out.println("Higher");
}else if (guess > numberGuess) {
    System.out.println("Tries ;" + Tries);
    System.out.println("Lower");
}
if (guess != numberGuess && guess == 5){
   System.out.println("No more tries left");
   System.out.println("YOU LOSE");
    break;

}
}
}
}