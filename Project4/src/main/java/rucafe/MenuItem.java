package rucafe;

public abstract class MenuItem implements Comparable<MenuItem>{
    private double price;
    public abstract double itemPrice();

    public MenuItem(double price) {
        this.price = price;
    }
}