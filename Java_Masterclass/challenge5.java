public class challenge5{
    public static void main(String[] args){
        int score = 800,levelCompleted = 5;
        int bonus = 100;
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your finanl score was " + finalScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score + (levelCompleted * bonus);
        System.out.println("Your new final score is " + finalScore);

    }
}