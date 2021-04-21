package hyt.designpattern.factorymethod;

/**
 * @Author huyouting
 * @Date 2021/2/21 10:05
 * @Description:
 */
public class CarFactory {

    public Car createCar(){
        System.out.println("a car created!");
        return new Car();
    }
}
