package com.example;

import java.util.List;

public class AlexLion extends Lion {

    private static String SEX = "Самец";

    public AlexLion(Feline feline) throws Exception{
        super(SEX, feline);
    }

    public List<String> getFriends(){
        return List.of("Марти","Глория","Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return 0;
    }


}
