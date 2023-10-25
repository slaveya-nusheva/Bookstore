package com.company;

public class Comics extends Book{
    private String characterName;

    @Override
    public double getPrice(){
        System.out.println(super.getTitle() + " is on sale 50% off. The price is ");
        return super.getPrice()*0.5;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
