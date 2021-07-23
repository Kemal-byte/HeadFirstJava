package HeadFirstJavaProjects.Chapter_5.Mini_DotGame;


import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        Scanner scanner = new Scanner(System.in);

        int numberOfGuesses = 0;
        int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
        int[] cellNumbers = {randomNum, randomNum+1, randomNum+2};
        System.out.println(Arrays.toString(cellNumbers));


        dot.setLocationCells(cellNumbers);


        System.out.println("Cells are between 0 and 6");

        while(dot.isAlive) {
            System.out.println("Guess a cell");
            String guessCell = scanner.nextLine();
            dot.checkYourself(guessCell);
            numberOfGuesses++;
        }
        System.out.println("Number of Guesses: "+numberOfGuesses);
    }
}

