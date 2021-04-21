package hyt.designpattern.strategy;


import java.util.Arrays;

/**
 * @Author huyouting
 * @Date 2021/2/20 15:33
 * @Description:
 */
public class Main {

//    public static void main(String[] args) {
//        Cat [] a = {new Cat(1,1),new Cat(5,5),new Cat(3,3)};
//        Dog [] b = {new Dog(1),new Dog(3),new Dog(2)};
//        Sorter sorter = new Sorter();
//        sorter.sort(b);
//        System.out.println(Arrays.toString(b));
//    }

    public static void main(String[] args) {
        Cat [] a = {new Cat(1,1),new Cat(5,5),new Cat(3,3)};
        Dog [] b = {new Dog(1),new Dog(3),new Dog(2)};
        SorterP<Cat> sorterP = new SorterP<>();
        sorterP.sort(a,new CatWeightComparator());
//        SorterP<Dog> sorterP = new SorterP<>();
//        sorterP.sort(b,new DogComparator());
        System.out.println(Arrays.toString(a));
    }
}
