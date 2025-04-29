package Kiosk.Level5;

public class menuitem {

    private String name;
    private double price;
    private String description;

    public menuitem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    public void addMenuItem(String name, int price, String description) {
        menuitem item = new menuitem(name, price, description);

    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


}

