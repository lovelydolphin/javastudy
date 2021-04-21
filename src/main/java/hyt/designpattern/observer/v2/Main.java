package hyt.designpattern.observer.v2;

/**
 * @Author huyouting
 * @Date 2021/2/22 10:00
 * @Description:
 */

class Child{

    private boolean cry =false;

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        System.out.println("wake up！crying wuwuwuwuwu...");
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }
}
