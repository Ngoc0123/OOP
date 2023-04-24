package w05;

import java.util.ArrayList;

public class WesternBooking extends Booking{

    public WesternBooking(){
        itemsList = new ArrayList<Item>();
        total = 0;
        style = "Western style";
    }

    public double bookingSum(){
        return total*115/100;
    }
}
