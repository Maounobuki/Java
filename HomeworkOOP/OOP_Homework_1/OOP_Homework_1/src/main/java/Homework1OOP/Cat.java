package Homework1OOP;

public class Cat <T,V>  {
    private String name;
    private boolean hunger;

    public T weight;
    public V age;

    public Cat(String name) {
        this.name = name;
        this.hunger = true;
        this.weight = weight;
        this.age = age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public V getAge() {
        return age;
    }

    public T getWeight() {
        return weight;
    }
    CatsVoice b = () -> {return "мрррр-мяв";};
    protected void invite() {
        if (hunger) {
            System.out.println(b.catsVoice());
        }
    }

    public void stroke() {
        System.out.println(b.catsVoice());
    }


}
