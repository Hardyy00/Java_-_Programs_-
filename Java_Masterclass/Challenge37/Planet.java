package challenge37.com.hardik;

// Heavenly Body Class with more functionality

public class Planet extends HeavenlyBody{

    public Planet(String name, int orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellites(HeavenlyBody body) {

        if(body.getKey().getBodyType() == BodyTypes.MOON)
            return super.addSatellites(body);

        return false;
    }



}
