package question3.com.hardik;

import javax.crypto.spec.DESedeKeySpec;

public class Main {

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.chooseComputer();
        desktop.displayMyComputerPrice();
    }
}
