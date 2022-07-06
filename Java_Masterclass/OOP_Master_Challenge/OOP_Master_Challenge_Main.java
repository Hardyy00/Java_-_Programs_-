package OOP_Master_Challenge;

import  java.util.Scanner;

public class OOP_Master_Challenge_Main {
    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        System.out.println("\nMenu : ");
        System.out.println("\n1. Hamburger");
        System.out.println("2. Healthy Burger");
        System.out.println("3. Deluxe Hamburger\n");

        System.out.print("Enter the burger you want to purchase : ");
        String burger = cin.nextLine();


        System.out.println();

        if(burger.strip().toLowerCase().equals("hamburger")){

            System.out.print("Enter the type of the bread : ");
            String breadRoll = cin.nextLine();

            System.out.print("\nEnter the type of meat : ");
            String meat = cin.nextLine();

            System.out.print("\nEnter the Base Price of the burger : ");
            double basePrice = cin.nextDouble();

            Hamburger hamburger = new Hamburger(breadRoll,meat,basePrice);
            cin.nextLine();
            System.out.println("\n\nDo want additions in the burger [yes/no] : ");
            String answer = cin.nextLine();

            if(answer.toLowerCase().equals("yes")){

                System.out.println("\nAdditional :");
                System.out.println("\n1. Lettuce");
                System.out.println("2.  Tomato");
                System.out.println("3. Pickle");
                System.out.println("4. Carrot");

                System.out.println("\nPick Additional out of them.");
                for(int i=0;i<4;i++){

                    System.out.print("\nAdd an item : ");
                    String additional = cin.nextLine();

                    if(additional.strip().toLowerCase().equals("lettuce")){
                        hamburger.setLettuce();
                    }else if(additional.strip().toLowerCase().equals("tomato")){
                        hamburger.setTomato();
                    }else if(additional.strip().toLowerCase().equals("pickle")){
                        hamburger.setPickle();
                    } else if (additional.strip().toLowerCase().equals("carrot")) {
                        hamburger.setCarrot();
                    }

                    System.out.print("\nDo you want to add another item ?[yes/no] : ");

                    String ans = cin.nextLine();

                    if(ans.strip().toLowerCase().equals("yes")){
                        continue;
                    }else{
                        break;
                    }
                }

            }
            hamburger.getPrice();
        }else if(burger.strip().toLowerCase().equals("healthy burger")){

            System.out.print("\nEnter the meat you want to added : ");
            String meat = cin.nextLine();

            HealthyBurger healthyBurger = new HealthyBurger(meat);

            System.out.println("Do you want some additions ?[yes/no]");
            String answer = cin.nextLine();

            if(answer.strip().toLowerCase().equals("yes")){
                System.out.println("\nAdditional :");
                System.out.println("\n1. Lettuce");
                System.out.println("2.  Tomato");
                System.out.println("3. Pickle");
                System.out.println("4. Carrot");
                System.out.println("5. Peas");
                System.out.println("6. Cabbage");

                System.out.println("\nPick an additional out of them.");

                for(int i=0;i<6;i++){

                    System.out.print("\nAdd an item : ");
                    String additional = cin.nextLine();

                    if(additional.strip().toLowerCase().equals("lettuce")){
                        healthyBurger.setLettuce();
                    }else if(additional.strip().toLowerCase().equals("tomato")){
                        healthyBurger.setTomato();
                    }else if(additional.strip().toLowerCase().equals("pickle")){
                        healthyBurger.setPickle();
                    } else if (additional.strip().toLowerCase().equals("carrot")) {
                        healthyBurger.setCarrot();
                    }else if(additional.strip().toLowerCase().equals("peas")){
                        healthyBurger.setPeas();
                    }else if(additional.strip().toLowerCase().equals("cabbage")){
                        healthyBurger.setCabbage();
                    }

                    System.out.print("\nDo you want to add another item ?[yes/no] : ");

                    String ans = cin.nextLine();

                    if(ans.strip().toLowerCase().equals("yes")){
                        continue;
                    }else{
                        break;
                    }
                }

            }
            healthyBurger.getPrice();

        }else if(burger.strip().toLowerCase().equals("deluxe hamburger")){

            DeluxeHamburger deluxeHamburger = new DeluxeHamburger();

            deluxeHamburger.getPrice();
        }

        cin.close();

    }

}
