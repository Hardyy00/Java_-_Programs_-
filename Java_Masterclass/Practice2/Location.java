package com.hardik;

import java.util.HashMap;
import java.util.Map;

//This code is used to demonstrate th practice of Immutable Class.

public final class Location {

    private final int location;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int location , String description , Map<String,Integer> exits){

        this.location = location;
        this.description = description;

        if(exits == null){
            this.exits = new HashMap<String,Integer>();
        }else{
            this.exits = new HashMap<String,Integer>(exits);
        }

        this.exits.put("q" , 0);
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
