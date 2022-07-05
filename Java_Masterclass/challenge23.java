

class Cars {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Cars(String name, int cylinders){
        this.name=  name;
        this.cylinders = cylinders;

        engine = true;
        wheels = 4;
    }

    public void startEngine(){
        System.out.println("Starting the engine.....");
    }

    public void accelerate(){
        System.out.println("Accelerating the vehicle......");
    }

    public void brake(){
        System.out.println("Applying brakes.......");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Audi extends Cars {
    public Audi(String name, int cylinders){
        super(name,cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Welcome to " + getClass().getSimpleName() + " " + getName());
        super.startEngine();
    }
}

class Mercedes extends Cars {
    public Mercedes(String name, int cylinders){
        super(name,cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Welcome to " + getClass().getSimpleName()+ " " + getName());
        super.startEngine();
    }
}

class Honda extends Cars {
    public Honda(String name, int cylinders){
        super(name,cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Welcome to " + getClass().getSimpleName() + " " +getName());
        super.startEngine();
    }
}


public class challenge23 {
    public static void main(String[] args){
        Audi r8 = new Audi("r8" , 8);
        Mercedes benz = new Mercedes("Benz" , 6);
        Honda city = new Honda("City",5);

        r8.startEngine();
        r8.accelerate();
        r8.brake();

        System.out.println();

        benz.startEngine();
        benz.accelerate();
        benz.brake();

        System.out.println();

        city.startEngine();
        city.accelerate();
        city.brake();
    }

}
