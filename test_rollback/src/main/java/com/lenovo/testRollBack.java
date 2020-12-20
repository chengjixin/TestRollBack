package com.lenovo;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class testRollBack {

    @Test
    public void test01(){
        List<Consumer> list = new ArrayList();

        list.add(new Consumer("zhang3",10,"email@163.com"));
        list.add(new Consumer("li4",18,"email@163.com"));
        list.add(new Consumer("wang5",17,"email@163.com"));
        list.add(new Consumer("zhao6",9,"email@163.com"));

        List<Consumer> sortedList = list
                .stream()
                .sorted(Comparator.comparing(Consumer::getAge))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}

