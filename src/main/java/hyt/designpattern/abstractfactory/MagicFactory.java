package hyt.designpattern.abstractfactory;

/**
 * @Author huyouting
 * @Date 2021/2/21 14:07
 * @Description:
 */
public class MagicFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
