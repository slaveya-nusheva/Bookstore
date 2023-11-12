package com.company;

import java.text.DecimalFormat;

public class ChildBook extends Book{
    private int childAge;
    DecimalFormat df = new DecimalFormat("####0.00");
    @Override
    public double getPrice(){
        System.out.println(super.getTitle() + " is on sale 70% off. The price is " + df.format(super.getPrice()*0.7));
        return super.getPrice()*0.7;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }
}

