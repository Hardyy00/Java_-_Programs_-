package challenge36.com.hardik;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int location;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int location , String description){

        this.location = location;
        this.description = description;
        exits = new HashMap<String, Integer>();
        exits.put("q" , 0);
    }

    public void addExist(String direction , int location){
        exits.put(direction , location);
    }

    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Map<String , Integer> getExits(){
        return new HashMap<String, Integer>(this.exits);
    }
}
