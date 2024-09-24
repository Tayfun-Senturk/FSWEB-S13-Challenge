package org.example.enums;

public enum Plan {
    BASIC("Start",100);

    private String planName;
    private int price;

    Plan(String planName,int price){
        this.planName=planName;
        this.price=price;
    }

    public String getName() {
        return planName;
    }

    public int getPrice() {
        return price;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
