package Homework1OOP;

public class Cat {
    private String name;
    private boolean hunger;

    public Cat(String name) {
        this.name = name;
        this.hunger = true;
    }

    protected void invite() {
        if (hunger) {
            System.out.println("мяу мяу мяу");
        }
    }

    public void stroke() {
        System.out.println("мрррр-мяв");
    }
}
