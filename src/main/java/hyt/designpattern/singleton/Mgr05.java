package hyt.designpattern.singleton;

/**
 * @Author huyouting
 * @Date 2021/2/20 14:16
 * @Description:
 */
public class Mgr05 {

    //禁止指令重排，否则会在没有初始化的情况下返回INSTANCE
    private static volatile Mgr05 INSTANCE;

    //构造器私有
    private Mgr05() {
    }

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            //试图通过减小同步代码块的方式提高效率，然后不可行
            synchronized (Mgr05.class){
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
