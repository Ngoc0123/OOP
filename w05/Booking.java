package w05;
import java.util.ArrayList;


public class Booking {
    protected ArrayList<Item> itemsList;
    protected double total;
    protected String style;

    public Booking(){
        itemsList = new ArrayList<Item>();
        total = 0;
    }


    public ArrayList<Item> getItemsList() {
        return itemsList;
    }
    public double bookingSum(){
        return total;
    }

    public void addItem(Item item){
        itemsList.add(item);

        total = total + item.getItemPrice();
    }
}
