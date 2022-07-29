package Challenge33;
import java.util.*;

// This code is used to demonstrate the use of Generics in Java

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int win =0;
    private int loses = 0;
    private int tie = 0;
    private ArrayList<T> teamPlayers;

    public Team(String name){
        this.name = name;
        teamPlayers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player){

        if(teamPlayers.contains(player)){
            System.out.println("Player is already in the team ");
        }else{
            teamPlayers.add(player);
        }

    }

    public void setMatchResult(Team<T> opponent , int ourScore , int theirScore){

        if(ourScore == 1){
            win++;
        }else if(ourScore == 0){
            tie++;
        }else if(ourScore == -1){
            loses++;
        }

        if(opponent != null){
            opponent.setMatchResult(null, theirScore , ourScore);
        }
    }

    public int getScore(){

        return 2 * win + tie;
    }

    @Override
    public int compareTo(Team<T> team) {

        int myTeamScore = this.getScore();
        int theirTeamScore = team.getScore();

        return Integer.compare(myTeamScore , theirTeamScore);

    }
    

}
