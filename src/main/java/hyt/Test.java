package hyt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author huyouting
 * @Date 2021/3/23 10:14
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        List<Short> collect = list.stream().map(Integer::shortValue).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
