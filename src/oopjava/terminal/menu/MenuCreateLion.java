package oopjava.terminal.menu;

import java.util.ArrayList;
import java.util.List;

import oopjava.PopulationOfZoo;

public class MenuCreateLion extends MenuCreate {
    protected String introductoryPhrase = String.format("Enter the data about the %s:", PopulationOfZoo.LION.getName());
    protected String maneVolume = "Mane volume:";

    @Override
    public List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        menu.addAll(super.getMenu());
        menu.add(maneVolume);
        return menu;
    }

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }
}