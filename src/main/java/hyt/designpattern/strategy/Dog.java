package hyt.designpattern.strategy;



/**
 * @Author huyouting
 * @Date 2021/2/20 16:20
 * @Description:
 */
public class Dog implements Comparable<Dog>{

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }



    @Override
    public int compareTo(Dog o) {
        if (this.food < o.food) {
            return -1;
        } else if (this.food > o.food) {
            return 1;
        } else {
            return 0;
        }
    }
}
