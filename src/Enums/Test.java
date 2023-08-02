package Enums;

import Enums.Animal;
import Enums.Season;

public class Test {
    public static void main(String[] args) {
        Animal animal=Animal.CAT;
        Season season=Season.AUTUMN;

        System.out.println(animal.getTranslation()+" "+animal.getAvgYear());
        System.out.println(season.getTemperature());
        animal.name();
        animal.ordinal();//index

        for(Season seasons:season.values()){
            System.out.println(seasons);
        }

    }
}
