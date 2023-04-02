package Homework1OOP;

public class Human {


    private String name;
    private Cat cat;

        public Human(String name){
            this.name = name;
        }

        public void callCat(){
            System.out.println("Кс-Кс-Кс");
            cat.invite();
        }

        public void strokeCat(){
            cat.stroke();
        }

        public void buyCat(Cat cat) {
            this.cat = cat;
        }
    }

