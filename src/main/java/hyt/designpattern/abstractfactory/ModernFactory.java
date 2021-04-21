package hyt.designpattern.abstractfactory;

/**
 * @Author huyouting
 * @Date 2021/2/21 14:05
 * @Description:
 */
public class ModernFactory extends AbstractFactory{

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
