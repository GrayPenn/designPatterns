package com.example.young.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgy
 * @date 2021/5/27 4:17 下午
 **/
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}