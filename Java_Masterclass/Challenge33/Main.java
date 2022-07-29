package Challenge33;

// This code is used to demonstrate the use of Generics in Java

public class Main {

    public static void main(String[] args) {

        League<Team<CricketPlayer>> worldChampionship = new League<>("World Championship");
        Team<CricketPlayer> indianTeam = new Team<>("India");

        indianTeam.addPlayer(new CricketPlayer("M.S Dhoni"));
        indianTeam.addPlayer(new CricketPlayer("Virat Kholi"));
        indianTeam.addPlayer(new CricketPlayer("Rishab Pant"));

        worldChampionship.addTeam(indianTeam);

        Team<CricketPlayer> pakistaniTeam = new Team<>("Pakistan");

        pakistaniTeam.addPlayer(new CricketPlayer("Abdul"));
        pakistaniTeam.addPlayer(new CricketPlayer("Shaikh"));
        pakistaniTeam.addPlayer(new CricketPlayer("Salim"));

        worldChampionship.addTeam(pakistaniTeam);

        Team<CricketPlayer> englandTeam = new Team<>("England");

        englandTeam.addPlayer(new CricketPlayer("Watson"));
        englandTeam.addPlayer(new CricketPlayer("Nick"));
        englandTeam.addPlayer(new CricketPlayer("Shane"));

        worldChampionship.addTeam(englandTeam);


        indianTeam.setMatchResult(pakistaniTeam , 0 , 1);
        indianTeam.setMatchResult(englandTeam , 1 , 1);
        pakistaniTeam.setMatchResult(indianTeam , 1 , 0);
        pakistaniTeam.setMatchResult(englandTeam , 1 , 0);
        pakistaniTeam.setMatchResult(indianTeam , 0 , 1);
        indianTeam.setMatchResult(pakistaniTeam , 1,0);
        indianTeam.setMatchResult(englandTeam , 1 , 0);

        Team<CricketPlayer> australia = new Team<>("Australia");

        australia.addPlayer(new CricketPlayer("Mat"));
        australia.addPlayer(new CricketPlayer("Ryan"));

        australia.setMatchResult(englandTeam,1,0);
        australia.setMatchResult(indianTeam,1,0);
        australia.setMatchResult(pakistaniTeam , 1 , 0);
        australia.setMatchResult(englandTeam , 1 , 0);
        australia.setMatchResult(pakistaniTeam , 1 , 0);
        australia.setMatchResult(pakistaniTeam , 1 , 0);
        australia.setMatchResult(pakistaniTeam , 1 , 0);
        indianTeam.setMatchResult(englandTeam, 1 , 0);



        worldChampionship.addTeam(australia);

        worldChampionship.getTeamsScore();


        System.out.println("\nLeague Rankings : \n");
        worldChampionship.getRanking();





    }
}
