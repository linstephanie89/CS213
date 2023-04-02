package rucafe;

public class Donut extends MenuItem{
    private String type;
    private String flavor;
    private double YEAST_PRICE = 1.59;
    private double CAKE_PRICE = 1.79;
    private double DONUT_HOLE_PRICE = 0.39;
    public Donut(String type, String flavor, double price){
        super(price);
        this.type = type;
        this.flavor = flavor;
    }
    @Override
    public double itemPrice() {
        if (this.type.equals("Yeast")) {
            this.price = YEAST_PRICE;
        } else if (this.type.equals("Cake")) {
            this.price = CAKE_PRICE;
        } else {
            this.price = DONUT_HOLE_PRICE;
        }
        return this.price;
    }






}
