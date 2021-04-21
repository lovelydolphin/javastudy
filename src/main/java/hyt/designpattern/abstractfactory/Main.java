package hyt.designpattern.abstractfactory;

/**
 * @Author huyouting
 * @Date 2021/2/21 9:51
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.go();
//        AK47 ak47 = new AK47();
//        ak47.shoot();
//        Bread bread = new Bread();
//        bread.printName();

//        Broom broom = new Broom();
//        broom.go();
//        MagicStick magicStick  =new MagicStick();
//        MushRoom mushRoom = new MushRoom();
//        mushRoom.printName();

        //AbstractFactory factory = new ModernFactory();
        AbstractFactory factory = new MagicFactory();
        Vehicle v = factory.createVehicle();
        Weapon w = factory.createWeapon();
        Food f = factory.createFood();
    }
}
