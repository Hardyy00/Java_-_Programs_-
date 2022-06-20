public class challenge3 {
    public static void main(String[] args) {
        double a = 20.00, b = 80.00;

        double c = (a + b) * 100.00;
        double answer = c % 40.00;
        boolean isresult = (answer == 0) ? true : false;

        System.out.println("Result is " + isresult);

        if (!isresult) {
            System.out.println("Got some remainder");

        }

    }
}
