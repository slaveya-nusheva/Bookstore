package com.company;

import java.text.DecimalFormat;

public class ComicBook extends Book{
    private String characterName;
    DecimalFormat df = new DecimalFormat("####0.00");
    @Override
    public double getPrice(){
        System.out.println(super.getTitle() + " is on sale 60% off. The price is " + df.format(super.getPrice( )*0.6));
        return super.getPrice( )*0.6;
    }

    public double getPrice(double percent){
        System.out.println(super.getTitle() + " is on sale " + percent*100 + "% off. The price is " + df.format(super.getPrice()*percent));
        return super.getPrice();
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
