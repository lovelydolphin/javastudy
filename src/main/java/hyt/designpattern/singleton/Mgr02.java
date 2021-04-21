package hyt.designpattern.singleton;

/**
 * @Author huyouting
 * @Date 2021/2/20 14:12
 * @Description:
 */

/**
 * 跟01一个意思
 */
public class Mgr02 {

    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    //构造器私有
    private Mgr02() {
    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
