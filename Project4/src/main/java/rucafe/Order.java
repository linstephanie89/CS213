package rucafe;

public class Order {
    private MenuItem[] orderBasket;
    private int EMPTY = 0;
    Private int CAPACITY = 4;

    public Order() {
        this.orderBasket = new MenuItem[CAPACITY][];
        this.size = EMPTY;
    }

    private void grow(){
        String[] oldList = this.addIns;
        this.addIns = String[this.addInCount + GrowthRate];
        for (int i = 0; i < this.addInCount; i++) {
            this.addIns[i] = oldList[i];
        }
    }
}
