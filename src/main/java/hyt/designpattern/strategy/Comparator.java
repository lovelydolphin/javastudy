package hyt.designpattern.strategy;

/**
 * @Author huyouting
 * @Date 2021/2/20 17:21
 * @Description:
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
