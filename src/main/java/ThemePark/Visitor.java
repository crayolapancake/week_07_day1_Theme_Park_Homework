package ThemePark;

public class Visitor {
    public int age;
    public int height;
    public int money;

    public Visitor(int age, int height, int money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge(){
        return age;}

    public int getHeight(){
        return height;
    }

    public int getMoney(){
        return money;
    }


}
