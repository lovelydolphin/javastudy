package hyt.designpattern.observer.v7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huyouting
 * @Date 2021/2/22 10:17
 * @Description:
 */

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
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

        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed",this);

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

//事件类 fireEvent
class wakeUpEvent {
    long timestamp;
    String loc;
    Child source;

    public wakeUpEvent(long timestamp, String loc,Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source=source;
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
