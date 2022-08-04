package practice.com.hardik;

// This code has my own Implementation of Binary Search.
import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> theatreSeats;

    public Theatre(String theatreName, int totalRows , int seatPerRows){
        this.theatreName = theatreName;

        theatreSeats = new LinkedList<>();

        int lastRow = 'A' + (totalRows - 1);

        for(char row='A' ; row<=lastRow; row++){
            for(int seatNum = 1; seatNum<=seatPerRows; seatNum++){
                theatreSeats.add(new Seat(row + String.format("%02d", seatNum )));
            }
        }

    }

    public String getTheatreName(){
        return  theatreName;
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean isBooked = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber(){
            return seatNumber;
        }

        public boolean reserve(){

            if(!isBooked){
                isBooked = true;
                return true;
            }

            return false;

        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }
    }

    public boolean reserve(String seatNumber){

        Seat reservingSeat = new Seat(seatNumber);

        int lower = 0;
        int higher = theatreSeats.size() - 1;

        while(lower<=higher){

            int middleIndex = (lower + higher)/2;

            int cmp = reservingSeat.compareTo(theatreSeats.get(middleIndex));

            if(cmp < 0){
                higher = middleIndex - 1;
            }else if(cmp > 0){
                lower = middleIndex + 1;
            }else{
                return theatreSeats.get(middleIndex).reserve();
            }
        }

        System.out.println(seatNumber + " does not exist in the theatre.");
        return false;
    }

    public void getSeats(){

        for(Seat seat : theatreSeats){
            System.out.println(seat.getSeatNumber());
        }
    }

}
