package HomeworkOOPandSolid.Human;

import HomeworkOOPandSolid.Fields.AgeInfo;
import HomeworkOOPandSolid.Fields.AgeInstall;
import HomeworkOOPandSolid.Fields.NameInfo;
import HomeworkOOPandSolid.Fields.StatusInfo;

public class Human<S extends String, N extends Number> implements NameInfo, StatusInfo, AgeInfo, AgeInstall {
    S name, status, gender;
    N age;

    public Human(S name, S status, S gender, N age) {
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public S getStatus() {return status;}
    @Override
    public S getName() {return name;}
    @Override
    public N getAge() {return age;}
    @Override
    public void setAge(Number age) {this.age = (N) age;}
}