import java.util.Scanner;
public class Playing_Cat {
        public static boolean isCatPlaying(boolean summer,int temperature){
            if(summer && (temperature >= 25 && temperature <=45)){
                return true;
            }else if(!summer && (temperature >= 25 && temperature <= 35)){
                return true;
            }
            return false;
        }

        public static void main(String[] args){
            Scanner cin = new Scanner(System.in);
            System.out.println("Is there a summer ?");
            boolean summer = cin.nextBoolean();
            System.out.println("Enter the temperature : ");
            int temperature = cin.nextInt();

            System.out.println("Is Cat playing ?");
            System.out.println(isCatPlaying(summer,temperature));
        }
}
