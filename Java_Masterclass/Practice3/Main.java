package practice3.com.hardik;

// This code is used to demonstrate the HashSet and equals() & hashCode()

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody body = new HeavenlyBody("Mercury" , 30);
        solarSystem.put(body.getName() , body);
        planets.add(body);

        body = new HeavenlyBody("Venus" , 90);
        solarSystem.put(body.getName() , body);
        planets.add(body);

        body = new HeavenlyBody("Earth" , 365);
        solarSystem.put(body.getName() , body);
        planets.add(body);

        HeavenlyBody moon = new HeavenlyBody("Moon" , 26);
        body.addMoon(moon);

        body = new HeavenlyBody("Mars" , 30);
        solarSystem.put(body.getName() , body);
        planets.add(body);

        moon = new HeavenlyBody("Phobos" , 111);
        body.addMoon(moon);

        moon = new HeavenlyBody("Demios" , 99);
        body.addMoon(moon);

        body = new HeavenlyBody("Jupiter" , 899);
        solarSystem.put(body.getName() , body);
        planets.add(body);

        moon = new HeavenlyBody("Europa" , 300);
        body.addMoon(moon);

        moon = new HeavenlyBody("Ganymede" , 191);
        body.addMoon(moon);

        moon = new HeavenlyBody("Lo" , 433);
        body.addMoon(moon);

        moon = new HeavenlyBody("Callisto" , 207);
        body.addMoon(moon);

        planets.add(new HeavenlyBody("Mars",89));


        System.out.println("Solar System :");

        for(HeavenlyBody planet : planets){

            System.out.println("Planet : " + planet.getName() + " || Duration : " + planet.getOrbitalPeriod());

        }

        System.out.println("Moons of Various Planets : ");
        for(String planet : solarSystem.keySet()){

            HeavenlyBody temp = solarSystem.get(planet);

            if(!temp.getSatellites().isEmpty()){
                System.out.println("  " + temp.getName() + " : ");

                for(HeavenlyBody temp2 : temp.getSatellites()){
                    System.out.println("\t" + temp2.getName());
                }

            }

        }

        Set<HeavenlyBody> moons = new HashSet<>();

        for(HeavenlyBody planet : planets){

            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons : ");
        for(HeavenlyBody satellite : moons){

            System.out.println("\t" + satellite.getName());
        }

    }
}
