package com.company;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()) return 1;
        if (o1.getAge() < o2.getAge()) return -1;
        return 0;
    }
}
