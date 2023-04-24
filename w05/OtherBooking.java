package w05;

import java.util.ArrayList;

public class OtherBooking extends Booking{

    public OtherBooking(){
        itemsList = new ArrayList<Item>();
        total = 0;
        style = "Other";
    }

    public double bookingSum(){
        double tip = (Math.random() *10);
        return total + total*tip/100;
    }
}
