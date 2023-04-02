package rucafe;

public abstract class MenuItem {
    private double price;

    public MenuItem(double price) {
        this.price = price;
    }

    public abstract double itemPrice() {
        return this.price;
    }
}