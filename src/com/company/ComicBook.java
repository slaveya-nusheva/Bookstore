package com.company;

public class ComicBook extends Book{
    private String characterName;

    @Override
    public double getPrice(){
        System.out.println(super.getTitle() + " is on sale 60% off. The price is ");
        return super.getPrice()*0.6;
    }

    public double getPrice(double percent){
        System.out.println(super.getTitle() + " is on sale " + percent*100 + "% off. The price is ");
        return super.getPrice()*percent;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
