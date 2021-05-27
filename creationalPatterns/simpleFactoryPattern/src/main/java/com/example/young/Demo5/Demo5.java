package com.example.young.Demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author pgy
 * @date 2021/5/14 4:32 下午
 **/
public class Demo5 {
    public static void main(String[] args) {


        setDatas("111","222","333","444");
    }


    public static void setDatas(String... datas) {
        System.out.println(datas.length);
        System.out.println(datas.getClass().getTypeName());
        Stream.iterate(0, i -> i + 1).limit(datas.length).forEach(index -> {
            String s = datas[index];
            System.out.println(s);
        });
    }





}
