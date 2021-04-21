package hyt.designpattern.decorator.v2;

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
        tank.tank();
        bullet.bullet();
        plane.plane();
    }
}

class Tank {

    public void type() {
        System.out.println("轻型坦克");
    }

}

class Bullet {

    public void type() {
        System.out.println("小口径子弹");
    }
}

class Plane {

    public void type() {
        System.out.println("喷气式战斗机");
    }
}

class DecoratorTank extends Tank {

    public void tank() {

        super.type();
        System.out.println("升级防御系统");
    }

}

class DecoratorBullet extends Bullet {

    public void bullet() {

        super.type();
        System.out.println("升级弹壳");
    }

}

class DecoratorPlane extends Plane {

    public void plane() {

        super.type();
        System.out.println("升级引擎");
    }
}