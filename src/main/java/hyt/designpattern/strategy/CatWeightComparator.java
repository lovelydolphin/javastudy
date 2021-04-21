package hyt.designpattern.strategy;

/**
 * @Author huyouting
 * @Date 2021/2/20 17:33
 * @Description:
 */
public class CatWeightComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight < o2.weight) {
            return -1;
        } else if (o1.weight > o2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
