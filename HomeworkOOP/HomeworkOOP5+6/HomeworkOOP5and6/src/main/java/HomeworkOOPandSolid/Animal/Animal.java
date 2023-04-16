package HomeworkOOPandSolid.Animal;


import HomeworkOOPandSolid.Fields.*;


public abstract class Animal<S extends String, N extends Number>
        implements AgeInfo, AgeInstall, NameInfo, Voice, HealthInstall, HealthInfo, StatusInfo {

    S type, name, color, gender;
    N age, weight, health;

    public Animal(S type, S name, S color, S gender, N age, N weight, N health) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.health = health;
    }
    @Override
    public S getName() {return name;}
    @Override
    public N getAge() {return age;}
    @Override
    public void setAge(Number age) {this.age = (N) age;}
    @Override
    public N getHealth() {return health;}
    @Override
    public void setHealth(Number health) {this.health = (N) health;}
    @Override
    public S getStatus() {return type;}

//    public void setType(S type) {this.type = type;}
//    public void setName(S name) {this.name = name;}
//    public N getWeight() {return weight;}
//    public void setWeight(N weight) {this.weight = weight;}

}
