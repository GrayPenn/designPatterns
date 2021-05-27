package com.example.young.demo1;

import java.util.List;

/**
 * @author pgy
 * @date 2021/5/27 4:16 下午
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}