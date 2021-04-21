package hyt.designpattern.abstractfactory;

/**
 * @Author huyouting
 * @Date 2021/2/21 13:55
 * @Description:
 */

/**
 * 这里用接口和抽象类都可以
 * 建议：形容词用接口，名词用抽象类
 */
public abstract class AbstractFactory {

    abstract  Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
