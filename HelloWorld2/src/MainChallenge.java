public class MainChallenge { 
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int higScore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("The highScore value is " + higScore);


        calculateScore( true, 10000, 8, 200);

}
public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;

    if (gameOver) {
        finalScore+= (levelCompleted * bonus);
        finalScore+= 1000;
        //System.err.println("Your final score was " +finalScore);
        
}
    return finalScore;
}

}