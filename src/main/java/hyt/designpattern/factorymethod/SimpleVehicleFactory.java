package hyt.designpattern.factorymethod;

/**
 * @Author huyouting
 * @Date 2021/2/21 10:01
 * @Description:
 */

/**
 * 简单工厂模式
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        //before processing
        return new Car();
    }

    public Broom createBroom(){
        return new Broom();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
