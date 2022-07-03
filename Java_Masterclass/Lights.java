package challenge21;
// part of challenge 21 (Fan, Lights , Room , Wall)
public class Lights {
    private String company;
    private int intensity;
    private String currentState;

    public Lights(String company,int intensity , String currentState){
        this.company = company;
        this.intensity = intensity;
        this.currentState = currentState;
    }

    public void setCurrentState(String currentState){
        this.currentState = currentState;
        System.out.println("Lights have been set to " + currentState);
    }

    public String getCompany(){
        return company;
    }

    public int getIntensity(){
        return intensity;
    }

    public String getCurrentState(){
        return  currentState;
    }
}
