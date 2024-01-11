package org.example.vo;

import org.example.model.*;

public class PProduct extends org.example.model.Product {

    //------PRODUCT------
    public Product cheese = new Product();
    public Product bulgogi = new Product();
    public Product shrimp = new Product();
    public Product chicken = new Product();
    public Product krab = new Product();
    public Product cass = new Product();
    public Product asahi = new Product();
    public Product cola = new Product();
    public Product cider = new Product();
    public Product choco = new Product();
    public Product milk = new Product();
    //------MENU------
    public Menu burgers = new Menu();
    public Menu beers = new Menu();
    public Menu frozenCustards = new Menu();
    public Menu drinks = new Menu();

    public void setMenu() {
        burgers.setInfo("Burgers", "앵거스 비프 통살을 다져 만든 버거");
        beers.setInfo("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        frozenCustards.setInfo("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        drinks.setInfo("Drinks", "매장에서 직접 만드는 음료");
    }

    public void setProd() {
        cheese.setInfo("치즈버거", 3500, "치즈버거", false);
        bulgogi.setInfo("불고기버거", 4000, "불고기버거", false);
        shrimp.setInfo("새우버거", 4200, "새우버거", false);
        chicken.setInfo("치킨버거", 3700, "치킨버거", false);
        krab.setInfo("게살버거", 3400, "게살버거", false);
        choco.setInfo("초코 아이스크림", 2000, "진한 초코 아이스크림", false);
        milk.setInfo("밀크 아이스크림", 2000, "달콤한 밀크 아이스크림", false);
        cola.setInfo("콜라", 1500, "스파르타 콜라", false);
        cider.setInfo("사이다", 1500, "스파르타 사이다", false);
        cass.setInfo("카스", 3500, "강한 탄산의 맥주", false);
        asahi.setInfo("아사히", 4000, "진한 맥아의 맥주", false);
    }


}
