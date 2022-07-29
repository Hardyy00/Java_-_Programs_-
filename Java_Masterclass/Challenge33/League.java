package Challenge33;
import java.util.*;

// This code is used to demonstrate the use of Generics in Java

public class League<T extends Team> {

    private String name;

    private ArrayList<T> leagueTeams;

    public League(String name){
        this.name= name ;
        leagueTeams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTeam(T team){
        if(leagueTeams.contains(team)){
            System.out.println(team.getName() + " is already present in league '" + this.name +"'");
        }else{
            leagueTeams.add(team);
        }
    }

    public void getRanking(){

        Collections.sort(leagueTeams , Collections.reverseOrder());

        for(int i=0;i<leagueTeams.size();i++){
            System.out.println((i+1) + ". " + leagueTeams.get(i).getName());
        }

    }

    public void getTeamsScore(){

        System.out.println("\nScores : \n");

        for(int i=0 ; i<leagueTeams.size();i++){

            Team team = leagueTeams.get(i);

            String teamName = team.getName();
            int teamScore = team.getScore();

            System.out.println((i+1) + ". " + teamName + " : " + teamScore);
        }
    }
}
