import java.io.Serializable;

public class Item implements Serializable {
    protected String name = "";
    protected String type = "";
    protected String description = "";
    protected double cost = 0;
    protected double count = 0;

    // Constructors
    public Item() {
    }

    public Item(String name, String type, String description, double cost, double count) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.cost = cost;
        this.count = count;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.cost;
    }

    public double getCount() {
        return this.count;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCount(double cost) {
        this.cost = count;
    }

    public String printItem() {
        return "\nName: " + this.name +
                "\nType: " + this.type +
                "\nDescription: " + this.description +
                "\nCost: " + this.cost +
                "\nStock: " + this.count;
    }
}
