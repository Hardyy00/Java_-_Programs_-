package challenge37.com.hardik;

// Heavenly Body Class with more functionality

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final int orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public enum BodyTypes{
        STAR,
        PLANET,
        MOON,
        COMET,
        ASTEROID,
        DWARF_PLANET
    }

    public HeavenlyBody(String name, int orbitalPeriod, BodyTypes bodyType){

        this.key = new Key(name , bodyType);

        this.orbitalPeriod =  orbitalPeriod;

        satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public int getOrbitalPeriod(){
        return orbitalPeriod;
    }

     public boolean addSatellites(HeavenlyBody body){
        return satellites.add(body);
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(satellites);
    }

    public static class Key{

        private final String name;
        private final BodyTypes bodyType;

        private Key(String name , BodyTypes bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }


        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj){

            if(this == obj)
                return true;

            if(obj instanceof Key anotherKey){
                if(this.name.equals(anotherKey.name)){
                    return this.bodyType == anotherKey.bodyType;
                }
            }

            return false;
        }

        @Override
        public int hashCode(){
            return this.name.hashCode() + this.bodyType.hashCode();
        }
    }

    @Override
    public final boolean equals(Object obj){

        if(this == obj)
            return true;

        if(obj instanceof HeavenlyBody anotherHeavenlyBody){

            return this.key.equals(anotherHeavenlyBody.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

}
