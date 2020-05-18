package ru.geekbrains.lesson1;

public class Dog implements Members{
    private String name;

    private float runLimit;
    private float jumpLimit;


    public Dog(String name, float runLimit, float jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }
    public boolean run(float distance){
        return(distance <= runLimit);
    }

    public boolean jumpOver(float height){
        return (height <= jumpLimit);
    }
}
