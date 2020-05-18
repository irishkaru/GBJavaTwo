package ru.geekbrains.lesson1;

public class Main {
    public static void main(String[] args) {

        Members[] hum = {new Human("Vasya", 6000, 2),
                new Dog("Barbos", 400, 3),
                new Robot("Venya", 3000, 1)};

        Barrier[] bar = {new Treadmill(1000 ), new Wall(2)};
        for (int i = 0; i < hum.length; i++) {
            for (int j = 0; j < bar.length; j++) {
                if (bar[j].height != 0) {
                    if (hum[i].jumpOver(bar[j].height))
                        System.out.println(hum[i].getName() + " has jumped over a barrier in height "+ bar[j].height + " m.");
                    else break;
                }
                if (bar[j].length != 0) {
                    if (hum[i].run(bar[j].length))
                        System.out.println(hum[i].getName() + " has run over a track in length  "+ bar[j].length + " m.");
                    else break;
                }
            }
        }
    }
}