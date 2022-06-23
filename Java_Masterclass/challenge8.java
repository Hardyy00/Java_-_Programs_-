import java.util.Scanner;
public class challenge8 {
    
    private static final String MESSAGE = "Invalid Value";
    
    public static String getDurationString(int minutes , int seconds){
        if(minutes >= 0 && (seconds >=0 && seconds <=59)){
            int hrs = minutes/60;
            int convertedMinutes = minutes%60;

            String hours = hrs + "h";
            String minutesString = convertedMinutes + "m";
            String secondsString = seconds + "s";
            if(hrs<10){
                hours = "0" + hours;
            }
            if(convertedMinutes<10){
                minutesString = "0" + minutesString;
            }
            if(seconds<10){
                secondsString = "0" + secondsString;
            }

            return hours + " " + minutesString + " " + secondsString;
        }


        return MESSAGE;
    }

    public static String getDurationString(int seconds){
        if(seconds >=0){
            int minutes = seconds/60;
            int convertedSeconds = seconds % 60;
            return getDurationString(minutes,convertedSeconds);
        }
        return MESSAGE;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Minutes : ");
        int minutes = cin.nextInt();
        System.out.println("Enter the Seconds : ");
        int seconds = cin.nextInt();

        String s = getDurationString(minutes,seconds);
        System.out.println("Converted String : " + s);

    }
}
