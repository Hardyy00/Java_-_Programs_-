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
        displayHighScore("Tim",calculateHighScore(1500));

        displayHighScore("Shane",calculateHighScore(900));

        displayHighScore("Hardik",calculateHighScore(400));

        displayHighScore("Sara",calculateHighScore(50));

    }
}
