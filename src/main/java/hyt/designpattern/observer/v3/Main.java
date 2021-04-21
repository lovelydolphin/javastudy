package hyt.designpattern.observer.v3;

/**
 * @Author huyouting
 * @Date 2021/2/22 10:00
 * @Description:
 */

class Child{

    private boolean cry =false;
    private Dad d = new Dad();

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        cry =true;
        d.feed();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do sth
        child.wakeUp();
    }
}
