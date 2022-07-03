package challenge21;
// part of challenge 21 (Fan, Lights , Room , Wall)
public class Fan {
    private String company;
    private int maxRPM;
    private String currentState;

    private int rpm;

    public Fan(String company , int maxRPM , String currentState){
        this.company = company;
        this.maxRPM = maxRPM;
        this.currentState = currentState;
        this.rpm = 0;
    }

    public void setRPM(int rpm){
        this.rpm = rpm;
        if(rpm > maxRPM){
            if(currentState == "off" || currentState == "OFF"){
                setCurrentState("ON");
            }
            System.out.println("Fan's Max RPM is " + maxRPM + " .Setting to highest RPM : " + rpm);
        }else if(rpm > 0){
            if(currentState == "off" || currentState == "OFF"){
                setCurrentState("ON");
            }
            System.out.println("Fan RMP has been set to " + rpm + " rpm....");
        }else if(rpm==0){
            System.out.println("Fan RMP has been set to " + rpm + " rpm....");
        }

    }
    public void setCurrentState(String currentState){
        this.currentState = currentState;

        if(currentState == "off" || currentState == "OFF"){
            rpm = 0;
            setRPM(rpm);
        }
        System.out.println("Fan has been set to " + currentState);
    }

    public String getCompany() {
        return company;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public String getCurrentState() {
        return currentState;
    }
}
