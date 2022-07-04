package Composition;

// Part of the Composition Problem (Bedroom , Bed , Ceiling, Lamp, Wall)
public class Composition_Main_Class {
    public static void main(String[] args){
        String name = "Hardik's Room";
        Bed bed = new Bed("Modern",2,56,1,1);
        Ceiling ceiling = new Ceiling(30,2);
        Lamp lamp = new Lamp("Modern",true,23);
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Bedroom bedroom = new Bedroom(name,wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
