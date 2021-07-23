package HeadFirstJavaProjects.Chapter_5.Mini_DotGame;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotCom extends SimpleDotComTestDrive {
    int[] locationCells;
    int numOfHits = 0;
    boolean isAlive = true;
    List<Integer> arrli;
    List<Integer> guessedValidCells = new ArrayList<>();
    String result = "miss";


    public void setLocationCells(int[] locs) {
        arrli = new ArrayList<>(3);
        for (int array : locs) {
            arrli.add(array);
        }
    }
    public void eraseLocationCells(int index) {
        if(arrli.contains(index)){
            guessedValidCells.add(index);
            arrli.remove((Integer) index);
            result = "Hit";
        } else if (guessedValidCells.contains(index)) {
            result = "Miss";
            System.out.println("You have already hit this cell.");
        }
    }
    public void isFinished() {
        if(arrli.isEmpty()) {
            result = "The ship is sunk";
            isAlive = false;

        }
    }
    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);
        eraseLocationCells(guess);
        isFinished();
        numOfHits++;
        System.out.println(result);
        return result;
    }
}
