package hyt.designpattern.factorymethod;

/**
 * @Author huyouting
 * @Date 2021/2/21 9:51
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
//        //第一天
//        Moveable m = new Plane();
//        m.go();
//        //第二天
//        Moveable m1 = new Car();
//        m1.go();
//        //第三天
//        Moveable m2 = new Broom();
//        m2.go();
        Moveable m =new CarFactory().createCar();
    }
}
