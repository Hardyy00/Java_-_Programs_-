package com.hardik;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//This code is used to demonstrate th practice of Immutable Class.

public class Main {

    public static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        locations.put(0 , new com.hardik.Location(0 , "You are at the front of the exit." , null));

        Map<String,Integer> exits = new HashMap<String,Integer>();
        exits.put("e" , 3);
        exits.put("w" , 2);
        exits.put("n" , 5);
        exits.put("s" , 4);
        locations.put(1, new Location(1 , "You are walking on the road." , exits));

        exits = new HashMap<String,Integer>();
        exits.put("n" , 5);
        locations.put(2, new Location(2 , "You on the top of the Hill." , exits));

        exits = new HashMap<String,Integer>();
        exits.put("w" , 1);
        locations.put(3 , new Location(3 , "You are in an abandoned Building" , exits));

        exits = new HashMap<String,Integer>();
        exits.put("n" , 1);
        exits.put("w" , 2);
        locations.put(4, new Location(4 , "Now roaming around a Valley" , exits));

        exits = new HashMap<String,Integer>();
        exits.put("w" , 2);
        exits.put("s" , 1);
        locations.put(5 , new Location(5 , "Abandoned in a Dark forest" , exits));

        int loc = 1;

        while(true){

            System.out.println(locations.get(loc).getDescription());
            if(loc == 0)
                break;

            System.out.print("Available exits : ");
            for(String s : locations.get(loc).getExits().keySet()){
                System.out.print(s.toUpperCase() + ", ");
            }

            System.out.println();

            String[] choice = cin.nextLine().split(" ");

            int arrayLength = choice.length;
            int foundLocation = 0;

            if(arrayLength == 1){
                foundLocation = getKey(choice[0] , loc);
            }else if(arrayLength > 1 ){
                foundLocation = getKey(choice[arrayLength -1] , loc);
            }

            if(locations.containsKey(foundLocation)){
                loc = foundLocation;
            }else{
                System.out.println("Wrong Input. You cannot move in that direction.");
            }

        }
        cin.close();
    }

    private static int getKey(String key, int currentLoc){

        return switch (key.toLowerCase()) {

            case "north", "n" -> locations.get(currentLoc).getExits().get("n");
            case "south", "s" -> locations.get(currentLoc).getExits().get("s");
            case "west", "w" -> locations.get(currentLoc).getExits().get("w");
            case "east", "e" -> locations.get(currentLoc).getExits().get("e");
            case "exit" , "quit" , "q" -> locations.get(currentLoc).getExits().get("q");
            default -> -1;
        };

    }
}
