package hyt.designpattern.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huyouting
 * @Date 2021/2/22 10:17
 * @Description:
 */

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;

        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(),"bed");

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

//事件类 fireEvent
class wakeUpEvent {
    long timestamp;
    String loc;

    public wakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

interface Observer {
    void actionOnWakeUp(wakeUpEvent event);
}

class Dad implements Observer {

    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}

class Mum implements Observer {

    public void fug() {
        System.out.println("mum fugging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        fug();
    }
}

class Dog implements Observer {

    public void wang() {
        System.out.println("dog wanging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
