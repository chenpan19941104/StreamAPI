package com.study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author cp
 * @create 2019-12-30 20:48
 *   此类用于演示   Stream API的中间操作
 *
 *  filter(Predicate p)   是筛选符合条件的数据
 *  distinct()    通过对象的equals方法去重
 *  limit(long maxSize)取前最大个数为maxSize个数据
 *  skip(long n)扔掉前n个数据
 *  peek(Consumer action)
 *  sorted()  自然排序进行排序
 *  sorted(Comparator) 根据定制排序进行排序
 *  map(Function) 映射关系
 */
public class StreamAPI {
    public static void main(String[] args) {
        //通过集合去获得一个顺序流
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("php");
        list.add("php");
        list.add("h5");
        list.add("h5");
        list.add("python");
        list.add("python");

        Stream<String> stream = list.stream();
        //Stream<String> stream1 = stream.filter(s -> s.length() >= 3);
        stream
//                .distinct()
//                .filter(s -> s.length() >= 1)
//                .skip(2)
//                .limit(2)
//                .peek(s->System.out.println("peek:"+s))
                .sorted()//自然排序 ,还有一个定制排序
                .map(t->t+t.length())//映射
                .forEach(System.out::println);
       /* String[] strs={"11","22"};
        Stream<String> stream = Arrays.stream(strs);
        stream.forEach(System.out::println);*/
    }
}
