package w05;

public class Item {
    private String name;
    private double price;

    public Item(){
        name = null;
        price = 0;
    }

    public Item(String i_name,double i_price){
        name = i_name;
        price = i_price;
    }

    public String getItemName(){
        return name;
    }
    public void setItemName(String input){
        name = input;
    }
    public double getItemPrice(){
        return price;
    }
    public void setItemPrice(double input){
        price = input;
    }
}
