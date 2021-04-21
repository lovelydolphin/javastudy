package hyt.designpattern.decorator.v3;

import java.awt.image.ImageConsumer;

/**
 * @Author huyouting
 * @Date 2021/3/2 15:03
 * @Description:
 */
public class Game {

    public static void main(String[] args) {
        DecoratorTank tank = new DecoratorTank();
        DecoratorBullet bullet = new DecoratorBullet();
        DecoratorPlane plane = new DecoratorPlane();
        tank.type();
        bullet.type();
        plane.type();
    }
}

interface DecoratorWeapon{
    void type();
}

class Tank implements DecoratorWeapon{

    @Override
    public void type() {
        System.out.println("轻型坦克");
    }

}

class Bullet implements DecoratorWeapon {

    @Override
    public void type() {
        System.out.println("小口径子弹");
    }
}

class Plane implements DecoratorWeapon{

    @Override
    public void type() {
        System.out.println("喷气式战斗机");
    }
}

class DecoratorTank implements DecoratorWeapon {

    //聚合被装饰对象
    Tank tank = new Tank();

    @Override
    public void type() {
        tank.type();
        System.out.println("升级防御系统");
    }
}

class DecoratorBullet implements DecoratorWeapon {

    Bullet bullet = new Bullet();

    @Override
    public void type() {
        bullet.type();
        System.out.println("升级弹壳");
    }
}

class DecoratorPlane implements DecoratorWeapon {

    Plane plane = new Plane();

    @Override
    public void type() {
        plane.type();
        System.out.println("升级引擎");
    }
}
