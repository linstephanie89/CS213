package rucafe;

public class Donut extends MenuItem{
    private String type;
    private String flavor;
    public Donut(String type, String flavor, double price){
        super(price);
        this.type = type;
        this.flavor = flavor;
    }

    @Override
    public double itemPrice() {
        if (this.type.equals("Yeast")) {
            this.price = 1.59;
        } else if (this.type.equals("Cake")) {
            this.price = 1.79;
        } else {
            this.price = 0.39;
        }
        return this.price;
    }






}
