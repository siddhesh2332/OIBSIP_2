import java.util.Random;
import java.util.Scanner;
class Game
{
    int hidden;
    public Game()
    {
        Random rand = new Random();
        hidden = rand.nextInt(100);
        System.out.println("Choose the number between 1 to 100");
    }
    public int cno()
    {
        return hidden;
    }
}
class NumguessGame{
    static int takeUserInput() {
        int user;
        System.out.println("Enter the number you are Guessing:- ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }
    static void isCorrectNumber(int i, int j) {
        if (i == j) {
            System.out.println("Woahhhh....You got the Correct number.");
        } else if (i > j) {
            System.out.println("Sorry the choosen number is Bigger than the Hidden Number!");
        } else {
            System.out.println("Sorry the choosen number is Smaller than the Hidden Number!");
        }
    }
    public static void main(String[] args){
        int user = 0, hidden = 0, i = 0;
        Game g = new Game();
        do {
            user = takeUserInput();
            hidden = g.cno();
            isCorrectNumber(user, hidden);
            i++;
        }
        while (user != hidden);
        System.out.println("You guessed the number in " + i + " Attempts....");
        System.out.println("The Number is " + hidden);
    }
}