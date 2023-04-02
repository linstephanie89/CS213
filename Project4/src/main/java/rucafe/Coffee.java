package rucafe;

public class Coffee extends MenuItem {
    private String size;
    private String[] addIns;
    private int addInCount;
    private int NONE = 0;
    private int CAPACITY = 4;
    private int GROWTH_RATE = 4;
    private double ADD_IN_PRICE = 0.30;
    private double SHORT_PRICE = 1.89;
    private double TALL_PRICE = 2.29;
    private double GRANDE_PRICE = 2.69;
    private double VENTI_PRICE = 3.09;


    public Coffee (String size, double price) {
        super(price);
        this.size = size;
        this.addIns = String[CAPACITY];
        this.addInCount = NONE;
    }

    private void grow(){
        String[] oldList = this.addIns;
        this.addIns = String[this.addInCount + GrowthRate];
        for (int i = 0; i < this.addInCount; i++) {
            this.addIns[i] = oldList[i];
        }
    }
    public void setAddInCount(int count) {
        addInCount += count;
    }

    public void setAddIns(String addIn) {
        addIn[addInCount] = addIn;
        addInCount += 1;
    }

    @Override
    public double itemPrice() {
        if (this.size.equals("short")) {
            this.price = SHORT_PRICE;
        } else if (this.size.quals("tall")) {
            this.price = TALL_PRICE;
        } else if (this.size.equals("grande")){
            this.price = GRANDE_PRICE;
        } else {
            this.price = VENTI_PRICE;
        }
        this.price += (double) addInCount * ADD_IN_PRICE;
        return this.price;
    }



}
