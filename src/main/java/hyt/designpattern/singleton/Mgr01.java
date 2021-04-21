package hyt.designpattern.singleton;

/**
 * @Author huyouting
 * @Date 2021/2/20 14:07
 * @Description:
 */

/**
 * 饿汗式
 * 类加载到内存后，就实例化一个单例，jvm保证线程安全
 * 简单实用，推荐实用
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * (如果是你不用的，你装载它干嘛)
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    //构造器私有
    private Mgr01() {
    }

    public static Mgr01 getInstance() {
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
