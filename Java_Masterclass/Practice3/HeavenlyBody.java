package practice3.com.hardik;

// This code is used to demonstrate the HashSet and equals() & hashCode()

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final int orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, int orbitalPeriod){
        this.name = name;
        this.orbitalPeriod =  orbitalPeriod;
        satellites = new HashSet<>();
    }

    public String getName(){
        return name;
    }

    public int getOrbitalPeriod(){
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody body){
        return satellites.add(body);
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj)
            return true;

        if(!(obj instanceof HeavenlyBody))
            return false;

        String anotherName = ((HeavenlyBody) obj).getName();

        return this.name.equals(anotherName);
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

}
