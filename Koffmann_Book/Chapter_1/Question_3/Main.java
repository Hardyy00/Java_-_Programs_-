package question3.com.hardik;

public class Main {

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.chooseComputer();
        desktop.displayMyComputerPrice();

        Notebook notebook = new Notebook();
        notebook.chooseComputer();
        notebook.displayMyComputerPrice();
    }
}
