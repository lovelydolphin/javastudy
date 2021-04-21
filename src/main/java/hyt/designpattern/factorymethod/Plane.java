package hyt.designpattern.factorymethod;

/**
 * @Author huyouting
 * @Date 2021/2/21 9:52
 * @Description:
 */
public class Plane implements Moveable{

    @Override
    public void go(){
        System.out.println("Plane flying sousousou...");
    }
}
