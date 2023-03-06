package oopjava.factory;

import java.util.ArrayList;

import oopjava.animals.Wolf;

public class WolfsFactory {

    public static ArrayList<Wolf> createLions(int lionCount) {

        ArrayList<Wolf> wolfs = new ArrayList<>();

        for (int i = 0; i < lionCount; i++) {
            wolfs.add(new Wolf(String.format("Волк%s", i + 1),
                    2000 + i,
                    4,
                    (10 * Math.random())));
        }

        return wolfs;

    }

}