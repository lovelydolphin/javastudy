package hyt.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author huyouting
 * @Date 2021/2/22 15:25
 * @Description:
 */

class Bullet{

    public UUID id = UUID.randomUUID();
    boolean living =true;

    @Override
    public String toString() {
        return "BulletPoll{" +
                "id=" + id +
                ", living=" + living +
                '}';
    }
}

public class BulletPoll{
    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet(){
        for (Bullet b : bullets) {
            if (!b.living) {
                return b;
            }
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPoll bp  = new BulletPoll();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }
}
