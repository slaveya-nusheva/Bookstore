package com.company;

public class ChildBook extends Book{
    private int childAge;

    @Override
    public double getPrice(){
        System.out.println(super.getTitle() + " is on sale 70% off. The price is ");
        return super.getPrice()*0.7;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }
}

