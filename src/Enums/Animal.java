package Enums;

public enum Animal {
    DOG("собака",12),CAT("кошка",16),FROG("лягушка",1);

    public int getAvgYear() {
        return avgYear;
    }

    public String getTranslation() {
        return translation;
    }

    private String translation;
    private  int avgYear;

    Animal(String translation,int avgYear){
        this.translation=translation;
    }

    Animal() {

    }
}
