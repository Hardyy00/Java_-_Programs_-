package challenge37.com.hardik;

// Heavenly Body Class with more functionality

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static final Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody body = new Planet("Mercury" , 30);
        solarSystem.put(body.getKey() , body);
        planets.add(body);

        DwarfPlanet dwarfPlanet = new DwarfPlanet("Cisis" , 50);
        solarSystem.put(dwarfPlanet.getKey() , dwarfPlanet);

        body = new Planet("Venus" , 90);
        solarSystem.put(body.getKey() , body);
        planets.add(body);

        body = new Planet("Earth" , 365);
        solarSystem.put(body.getKey() , body);
        planets.add(body);

        HeavenlyBody moon = new Moon("Moon" , 26);
        body.addSatellites(moon);

        body = new Planet("Mars" , 30);
        solarSystem.put(body.getKey() , body);
        planets.add(body);

        moon = new Moon("Phobos" , 111);
        body.addSatellites(moon);

        moon = new Moon("Demios" , 99  );
        body.addSatellites(moon);

        body = new Planet("Jupiter" , 899);
        solarSystem.put(body.getKey() , body);
        planets.add(body);

        moon = new Moon("Europa" , 300 );
        body.addSatellites(moon);

        moon = new Moon("Ganymede" , 191 );
        body.addSatellites(moon);

        moon = new Moon("Lo" , 433 );
        body.addSatellites(moon);

        moon = new Moon("Callisto" , 207 );
        body.addSatellites(moon);

        body = new Moon("Mars",77);
        solarSystem.put(body.getKey() , body);
        body.addSatellites(new Moon("Corsos" , 100000));

        body = new Planet("Newmann" , 10700);
        solarSystem.put(body.getKey() , body);
        planets.add(body);
        body.addSatellites(new Moon("Rockstar" , 12 ));
        body.addSatellites(new Planet("Seses" , 9));


        body = new Moon("Jupiter" , 900);
        planets.add(body);
        solarSystem.put(body.getKey(), body);


        System.out.println("Solar System :");

        for(HeavenlyBody planet : planets){

            System.out.println("Planet : " + planet.getKey().getName() + " || Duration : " + planet.getOrbitalPeriod()
                                + " || Body Type : " + planet.getKey().getBodyType());

        }

        System.out.println("Moons of Various Planets : ");
        for(HeavenlyBody.Key planet : solarSystem.keySet()){

            HeavenlyBody temp = solarSystem.get(planet);

            if(!temp.getSatellites().isEmpty()){
                System.out.println("  " + temp.getKey().getName() + " : " + " || Body Type : " + temp.getKey().getBodyType() + " : ");

                for(HeavenlyBody temp2 : temp.getSatellites()){
                    System.out.println("\t" + temp2.getKey().getName());
                }

            }

        }

        Set<HeavenlyBody> moons = new HashSet<>();

        for(HeavenlyBody planet : planets){

            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons : ");
        for(HeavenlyBody satellite :moons){

            System.out.println("\t" + satellite.getKey().getName());
        }

        System.out.println("Planets : ");
        for(HeavenlyBody planet : planets){

            System.out.println(planet.getKey().getName() + " , Duration : " + planet.getOrbitalPeriod());
        }

        System.out.println("\nSolar System overview : ");
        for(HeavenlyBody things : solarSystem.values()){

            System.out.println(things.getKey().getName() + " && Body Type : " + things.getKey().getBodyType());
        }

    }

}
