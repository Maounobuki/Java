package Models;

public class Toy {
    private int toy_id;
    private String toy_name;
    private double toy_frequency;

    public Toy(int toy_id, String toy_name, int toy_frequency) {
        this.toy_id = toy_id;
        this.toy_name = toy_name;
        this.toy_frequency = toy_frequency;
    }

    public int getToy_id() {
        return toy_id;
    }

    public void setToy_id(int toy_id) {
        this.toy_id = toy_id;
    }

    public String getToy_name() {
        return toy_name;
    }

    public void setToy_name(String toy_name) {
        this.toy_name = toy_name;
    }
    public double getToy_frequency() {
        return toy_frequency;
    }
    public void setToy_frequency() {
    this.toy_frequency = toy_frequency;
    }
    @Override
    public String toString() {
        return "Toy [toy_id = " + toy_id + ", toy_name = " + toy_name + "\n" + " toy_frequency = "+toy_frequency+"]";
    }
}
