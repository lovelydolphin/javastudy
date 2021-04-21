package hyt.designpattern.observer.v5;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author huyouting
 * @Date 2021/2/22 10:17
 * @Description:
 */

class Child{
    private boolean cry =false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        cry =true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }
}

interface Observer{
    void actionOnWakeUp();
}

class Dad implements Observer{

    public void feed(){
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}

class Mum implements Observer{

    public void fug(){
        System.out.println("mum fugging...");
    }

    @Override
    public void actionOnWakeUp() {
        fug();
    }
}

class Dog implements Observer{

    public void wang(){
        System.out.println("dog wanging...");
    }

    @Override
    public void actionOnWakeUp() {
        wang();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
