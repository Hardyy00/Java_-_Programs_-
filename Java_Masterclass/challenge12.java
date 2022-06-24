public class challenge12 {
    public static boolean isPrime(int number){
        if(number == 1){
            return false;
        }
        for(int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        int count = 0;

        for(int i=1;i<100;i++){
            if(isPrime(i)){
                System.out.println(i + " is a Prime Number");
                count++;
            }

            if(count==3){
                break;
            }
        }


    }

}
