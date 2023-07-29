package com.driver;

public class Pizza {

    private int basePrice;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;
    private int cheesePrice=80;
    private int toppingsPrice;
    private int paperBagPrice=20;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBill;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.basePrice=300;
            this.toppingsPrice=70;
            bill="Base Price Of The Pizza: "+basePrice+"\n";
        }else{
            this.basePrice=400;
            this.toppingsPrice=120;
            bill="Base Price Of The Pizza: "+basePrice+"\n";
        }

    }

    public int getPrice(){

        return this.totalPrice;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            totalPrice=totalPrice+cheesePrice;
            bill=bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            totalPrice=totalPrice+toppingsPrice;
            bill=bill+"Extra Toppings Added: "+toppingsPrice+"\n";
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice=totalPrice+paperBagPrice;
            bill=bill+"Paperbag Added: "+paperBagPrice+"\n";
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBill){
            bill=bill+"Total Price: "+totalPrice+"\n";
            isBill=true;
        }

        return this.bill;
    }
}
