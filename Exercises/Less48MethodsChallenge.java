public class Less48MethodsChallenge {
    public static void main(String[] args) {
        
        String plName = "Pippo";
         
        int plScore = 1500;

        int plPos = calculateHighScorePosition(plScore);
        displayHighScorePosition(plName, plPos);

        plScore = 1000;
        plPos = calculateHighScorePosition(plScore);
        displayHighScorePosition(plName, plPos);

        plScore = 500;
        plPos = calculateHighScorePosition(plScore);
        displayHighScorePosition(plName, plPos);

        plScore = 100;
        plPos = calculateHighScorePosition(plScore);
        displayHighScorePosition(plName, plPos);

        plScore = 25;
        plPos = calculateHighScorePosition(plScore);
        displayHighScorePosition(plName, plPos);

        
    }




    public static void displayHighScorePosition(String plName, int plPos) {
        System.out.println(plName + " managed to get into position " + plPos + " on the high score list");

    }

    public static int calculateHighScorePosition(int plScore) {

        int HighScore;

        if (plScore >= 1000) {
             HighScore = 1;
        }
        else if (plScore >= 500 && plScore < 1000) {
             HighScore = 2;
        }
        else if (plScore >= 100 && plScore < 500) {
             HighScore = 3;
        }
        else {
             HighScore = 4;
        }

        return  HighScore;
    }
    
}
