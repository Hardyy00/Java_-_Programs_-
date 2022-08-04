package practice.com.hardik;

// This code has my own Implementation of Binary Search.

public class Main {

    public static void main(String[] args) {
        Theatre agraTheatre = new Theatre("SARV Cinema" , 8 , 12);

        String seatNumber = "D12";

        if(agraTheatre.reserve(seatNumber)){
            System.out.println("Seat '" + seatNumber +"' has been booked for you");
        }else{
            System.out.println("Cannot book this Seat.'" +seatNumber +"' has been already booked");
        }

        if(agraTheatre.reserve(seatNumber)){
            System.out.println("Seat '" + seatNumber +"' has been booked for you");
        }else{
            System.out.println("Cannot book this Seat.'" +seatNumber +"' has been already booked");
        }

        seatNumber = "Z01";

        if(agraTheatre.reserve(seatNumber)){
            System.out.println("Seat '" + seatNumber +"' has been booked for you");
        }else{
            System.out.println("Cannot book this Seat.'" +seatNumber +"' has been already booked");
        }

        seatNumber = "D01";

        if(agraTheatre.reserve(seatNumber)){
            System.out.println("Seat '" + seatNumber +"' has been booked for you");
        }else{
            System.out.println("Cannot book this Seat.'" +seatNumber +"' has been already booked");
        }
    }
}
