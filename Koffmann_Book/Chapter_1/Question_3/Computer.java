package question3.com.hardik;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class Computer {

    private static Scanner cin = new Scanner(System.in);

    static double PROCESSOR_2GHZ = 56.21;
    static double PROCESSOR_5GHZ = 101.11;
    static double DISK_SPACE_256SSD = 150.34;
    static double DISK_SPACE_512SSD = 189.89;
    static double RAM_8GB = 77.23;
    static double RAM_16GB = 89.45;
    static double EXTERNAL_MEMORY_CD = 20.11;
    static double EXTERNAL_MEMORY_DVD = 31.14;
    static double EXTERNAL_MEMORY_DVD_AND_CD = EXTERNAL_MEMORY_CD+ EXTERNAL_MEMORY_DVD;
//    static double SCREENSIZE_8INCH = 109.00;
//    static double SCREENSIZE_9INCH = 120.00;
    static double ADDITIONAL_MODEM = 12.12;
    static double ADDITIONAL_NETWORK_CARD = 9.76;
    static double ADDITIONAL_WIRELESS_NETWORK = 15.67;


    private double computerBasePrice;
    private double computerNetPrice = 0.0d;
    private double computerProcessorPrice = 0.0d;
    private double computerDiskSpacePrice = 0.0d;
    private double computerRAMPrice = 0.0d;
    private double computerExternalMemoryPrice = 0.0d;
    private double additionalThingsPrice = 0.0d;

    public abstract double shippingCost();

    public Computer(double computerBasePrice){
        this.computerBasePrice = computerBasePrice;
        this.computerNetPrice = computerBasePrice;
    }

    public void incrementComputerPrice(double staticVariable){
        this.computerNetPrice += staticVariable;
    }

    public void incrementComputerProcessorPrice(double computerProcessorPrice){
        this.computerProcessorPrice += computerProcessorPrice;
        incrementComputerPrice(computerProcessorPrice);
    }

    public void incrementComputerDiskSpacePrice(double computerDiskSpacePrice){
        this.computerDiskSpacePrice += computerDiskSpacePrice;
        incrementComputerPrice(computerDiskSpacePrice);
    }

    public void incrementComputerRAMPrice(double computerRAMPrice){
        this.computerRAMPrice += computerRAMPrice;
        incrementComputerPrice(computerRAMPrice);
    }

    public void incrementComputerExternalMemoryPrice(double computerExternalMemoryPrice){
        this.computerExternalMemoryPrice += computerExternalMemoryPrice;
        incrementComputerPrice(computerExternalMemoryPrice);
    }

    public void incrementAdditionalThingsPrice(double additionalThingsPrice){
        this.additionalThingsPrice += additionalThingsPrice;
        incrementComputerPrice(additionalThingsPrice);
    }


    public double getComputerNetPrice() {
        return computerNetPrice;
    }

    public void chooseComputer(){

        System.out.println("\n------------Please Choose Accordingly------------\n");
        chooseProcessor();

        chooseDiskSpace();

        chooseRAMType();

        chooseExternalMemory();

        System.out.println("\nAvailable Course of action..");
        System.out.println("1. Finish the Process");
        System.out.println("2. Show Additional Things");
        System.out.println("\nChoose action : ");
        int choice = cin.nextInt();

        switch(choice){
            case 1 :
                break;
            case 2 :
                System.out.println("\nAdditional Things : ");
                System.out.println("1. Modem");
                System.out.println("2. Network Card");
                System.out.println("3. Wireless Network");
                System.out.println("Do you want to  choose Something?[y/n]");

                char option = cin.next().charAt(0);

                if(option == 'y' || option == 'Y'){
                    System.out.println("Choose Something : ");
                    int choose = cin.nextInt();
                    switch(choose){
                        case 1-> System.out.println("$." + ADDITIONAL_MODEM + " added for the Modem.");
                        case 2-> System.out.println("$." + ADDITIONAL_NETWORK_CARD + " added for the Network Card.");
                        case 3-> System.out.println("$." + ADDITIONAL_WIRELESS_NETWORK +
                                " added for the Wireless Network.");
                    }
                }
        }


    }

    public void chooseProcessor(){

        System.out.println("\nAvailable Processors : ");
        System.out.println("1. 2.4 GHZ");
        System.out.println("2. 5 GHZ");
        System.out.println("\nChoose a Processor : ");
        int option = cin.nextInt();

        switch(option){
            case 1 :
                System.out.println("$."+PROCESSOR_2GHZ + " added for 2 GHZ Processor.");
                incrementComputerProcessorPrice(PROCESSOR_2GHZ);
                break;
            case 2 :
                System.out.println("$."+PROCESSOR_5GHZ + " added for 5 GHZ Processor.");
                incrementComputerProcessorPrice(PROCESSOR_5GHZ);
                break;
            default:
                System.out.println("Wrong Input. Please Try Again.");
                chooseProcessor();
        }
    }

    public void chooseDiskSpace(){
        System.out.println("\nAvailable Disk Storages : ");
        System.out.println("1. 256 SSD");
        System.out.println("2. 512 SSD");
        System.out.println("Choose a disk storage : ");
        int option = cin.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("$." + DISK_SPACE_256SSD + " added for 256 SSD Storage.");
                incrementComputerDiskSpacePrice(DISK_SPACE_256SSD);
            }
            case 2 -> {
                System.out.println("$." + DISK_SPACE_512SSD + " added for 512 SSD Storage.");
                incrementComputerDiskSpacePrice(DISK_SPACE_512SSD);
            }
            default -> {
                System.out.println("Wrong input please try again.");
                chooseDiskSpace();
            }
        }

    }

    public void chooseRAMType(){

        System.out.println("\nAvailable RAM Type : ");
        System.out.println("1. 8 GB");
        System.out.println("2. 16 GB");
        System.out.println("Choose a RAM Type : ");
        int option = cin.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("$." + RAM_8GB + " added for 8 GB RAM.");
                incrementComputerRAMPrice(RAM_8GB);
            }
            case 2 -> {
                System.out.println("$." + RAM_16GB + " added for 16 GB RAM.");
                incrementComputerRAMPrice(RAM_16GB);
            }
            default -> {
                System.out.println("Wrong input please try again.");
                chooseRAMType();
            }
        }

    }

    public void chooseExternalMemory(){

        System.out.println("\nAvailable External Storage : ");
        System.out.println("1. CD");
        System.out.println("2. DVD");
        System.out.println("3. Both");
        System.out.println("Choose an External Storage : ");
        int option = cin.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("$." + EXTERNAL_MEMORY_CD + " added for CD.");
                incrementComputerExternalMemoryPrice(EXTERNAL_MEMORY_CD);
            }
            case 2 -> {
                System.out.println("$." + EXTERNAL_MEMORY_DVD + " added for DVD.");
                incrementComputerExternalMemoryPrice(EXTERNAL_MEMORY_DVD);
            }
            case 3->{
                System.out.println("$." + EXTERNAL_MEMORY_DVD_AND_CD + " added for both CD and DVD.");
                incrementComputerExternalMemoryPrice(EXTERNAL_MEMORY_DVD_AND_CD);
            }
            default -> {
                System.out.println("Wrong input please try again.");
                chooseRAMType();
            }
        }
    }

    public void displayMyComputerPrice(){

        System.out.println("Processor Price : $." + computerProcessorPrice);
        System.out.println("Disk Space Price : $." + computerDiskSpacePrice);
        System.out.println("RAM Price : $." + computerRAMPrice);
        System.out.println("External Memory Price : $." + computerExternalMemoryPrice);
        System.out.println("Additional Things Price : $." + additionalThingsPrice);
    }




}
