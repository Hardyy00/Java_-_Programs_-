public class challenge13 {
    public static void main(String[] args){
        int count = 0,sum =0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
                System.out.println(i + " is divisible by 3 & 5.");
                count++;
            }
            if(count==5){
                break;
            }
        }
        System.out.println("\nSum of the above numbers is " + sum);
    }
}
