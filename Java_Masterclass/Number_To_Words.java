import java.util.Scanner;
public class Number_To_Words {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            int count = getDigitCount(number);
            if(count == -1){
                System.out.println("Invalid Value");
            }else{
                int reversedNumber = reverse(number);
                for(int i=0;i<count;i++){
                    switch(reversedNumber % 10){
                        case 0 :
                            System.out.println("Zero");
                            break;
                        case 1 :
                            System.out.println("One");
                            break;
                        case 2 :
                            System.out.println("Two");
                            break;
                        case 3 :
                            System.out.println("Three");
                            break;
                        case 4 :
                            System.out.println("Four");
                            break;
                        case 5 :
                            System.out.println("Five");
                            break;
                        case 6 :
                            System.out.println("Six");
                            break;
                        case 7 :
                            System.out.println("Seven");
                            break;
                        case 8 :
                            System.out.println("Eight");
                            break;
                        case 9 :
                            System.out.println("Nine");
                    }
                    reversedNumber /= 10;
                }
            }
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }

        return (int)(Math.log10(number)) + 1;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        numberToWords(number);
    }
}
