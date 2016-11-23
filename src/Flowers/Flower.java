package Flowers;

/**
 * Created by Yasya on 04.10.16.
 */


abstract class Flower {


    private double price = 20;
    private FlowerSpec spec;


    public Flower() {

    }

    public Flower(FlowerSpec s, double p) {
        this.spec = s;
        this.price = p;

    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public double getPrice() { return price; }

    public FlowerSpec getSpec() { return spec; }

    @Override
    public String toString() {
        return "Name: " + spec.getName() + " Colour: " + spec.getCol() + " Length: " + Integer.toString(spec.getLen()) + " Price: "
                + Double.toString(price) + " Is Fresh: " + Boolean.toString(spec.getFreshness()) + "\n";
    }

    abstract String getType();






}
