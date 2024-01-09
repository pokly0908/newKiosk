package org.example.model;

public class Product extends Menu{
    private String name;
    private String desc;
    private int price;
    private boolean size;
    public Product(){}
    public void setInfo(String name, int price, String desc, boolean size){
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.size = size;
    }
    public void setSize(int sel){
        if(sel == 1) this.size = false;
        else if(sel == 2){
            this.size = true;
            this.price += 500;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getPrice() {return this.price;}
    public boolean getSize()  {return this.size;}
}
