package org.example.controller;

import org.example.model.Cart;
import org.example.model.Product;

import java.util.ArrayList;

public class paySystem {
    public static void addCart(Product p){      //장바구니에 Product P 담기
        ArrayList<String> product = new ArrayList<>();
        product.add(p.getName());
        product.add(String.valueOf(p.getPrice()));
        Cart.totalPrice += p.getPrice();
        if(p.getSize()) product.add("Large");
        else product.add("Normal");
        org.example.model.Cart.cart.add(product);
    }
    public static void comPay(){              //결제된 항목에 추가하기
        Cart.history.add(Cart.cart);
    }
}
