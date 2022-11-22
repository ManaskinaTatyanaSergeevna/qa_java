package com.example;

import java.util.List;

public class Lion  {

    boolean hasMane;
    private Predator predator;

    public Lion(String sex, Feline feline) throws Exception {
        this.predator = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }


    public int getKittens() {
        return predator.getYoungAnimal(1);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
