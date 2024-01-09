package org.example.model;

public class Menu {
    private String name;
    private String desc;
    public Menu() {
    }
    public void setInfo(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
}
