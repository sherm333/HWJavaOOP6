package oopjava.animals.comparators;

import java.util.Comparator;

import oopjava.animals.Wolf;

public class WolfComparator implements Comparator<Wolf> {

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (Double.compare(o1.getWeight(), o2.getWeight()) != 0) {
            return Double.compare(o1.getWeight(), o2.getWeight());
        } else {
            return Double.compare(o1.getAge(), o2.getAge());
        }
    }

}