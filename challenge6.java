public class challenge6 {
    public static int calculateHighScore(int score){
        if(score >=1000)
            return 1;
        else if(score >=500 && score <1000)
            return 2 ;
        else if(score >=100 && score <500)
            return 3;
        else
            return 4;
    }
    public static void displayHighScore(String name,int highScorePosition){
        System.out.println(name + " managed to get position " +
                            highScorePosition +" on the high score table.");
    }

    public static void main(String[] args){
        int highScorePosition = calculateHighScore(1500);
        displayHighScore("Tim",highScorePosition);

        highScorePosition = calculateHighScore(900);
        displayHighScore("Shane",highScorePosition);

        highScorePosition = calculateHighScore(400);
        displayHighScore("Hardik",highScorePosition);

        highScorePosition = calculateHighScore(50);
        displayHighScore("Sara",highScorePosition);

    }
}
