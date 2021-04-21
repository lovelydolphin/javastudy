package hyt.designpattern.decorator.v1;

/**
 * @Author huyouting
 * @Date 2021/3/2 15:03
 * @Description:
 */
public class Game {

    public static void main(String[] args) {
        Tank tank = new Tank();
        Bullet bullet = new Bullet();
        Plane plane = new Plane();
        tank.type();
        bullet.type();
        plane.type();
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
