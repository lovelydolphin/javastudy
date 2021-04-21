package hyt.designpattern.observer.v4;

/**
 * @Author huyouting
 * @Date 2021/2/22 10:00
 * @Description:
 */

class Child{

    private boolean cry =false;
    private Dad dad = new Dad();
    private mum mum = new mum();
    private Dog dog = new Dog();
    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        cry =true;
        dad.feed();
        mum.hug();
        dog.wang();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }
}
class mum{
    public void hug(){
        System.out.println("mum hugging...");
    }
}
class Dog{
    public void wang(){
        System.out.println("Dog wang...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do sth
        child.wakeUp();
    }
}
