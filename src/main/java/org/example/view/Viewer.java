package org.example.view;
import org.example.controller.paySystem;
import org.example.model.Cart;
import org.example.model.Product;
import org.example.vo.PProduct;

import java.util.Scanner;

import static org.example.controller.paySystem.comPay;

public class Viewer {

    PProduct product = new PProduct();
    Scanner sc = new Scanner(System.in);


    //--------------------1번째---------------------
    //-------------------메인메뉴--------------------
    public void mainMenu() {
        product.setMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("NBK MENU BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ NBK MENU ]");
        System.out.println("1. " + product.burgers.getName() + "         | " + product.burgers.getDesc());
        System.out.println("2. " + product.drinks.getName() + "          | " + product.drinks.getDesc());
        System.out.println("3. " + product.frozenCustards.getName() + "  | " + product.frozenCustards.getDesc());
        System.out.println("4. " + product.beers.getName() + "            | " + product.beers.getDesc());
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        String select = sc.nextLine();
        switch (select) {
            case "1":
                burgerMenu();
            case "2":
                drinkMenu();
            case "3":
                frozenMenu();
            case "4":
                beerMenu();
            case "5":
                mainMenu();
            case "6":
                mainMenu();
            case "0":
                totalPriceMenu();
            default:
                System.out.println("잘못 입력하였습니다. 메인으로 돌아갑니다.");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    // InterruptedException 처리
                    e.printStackTrace();
                }
                mainMenu();
        }

    }

    //---------------------2번째---------------------
    //--------------------제품주문--------------------
    public void burgerMenu() {
        product.setProd();
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Burgers MENU ]");
        System.out.println("1. " + product.cheese.getName());
        System.out.println("2. " + product.bulgogi.getName());
        System.out.println("3. " + product.shrimp.getName());
        System.out.println("4. " + product.chicken.getName());
        System.out.println("5. " + product.krab.getName());
        System.out.println("6. 뒤로 가기");
        String select = sc.nextLine();
        switch (select) {
            case "1":
                sizeMenu(product.cheese);
            case "2":
                sizeMenu(product.bulgogi);
            case "3":
                sizeMenu(product.shrimp);
            case "4":
                sizeMenu(product.chicken);
            case "5":
                sizeMenu(product.krab);
            case "6":
                mainMenu();
            default:
                System.out.println("잘못 입력하였습니다. 메인으로 돌아갑니다.");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    // InterruptedException 처리
                    e.printStackTrace();
                }
                mainMenu();
        }

    }

    public void beerMenu() {
        product.setProd();
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Beers MENU ]");
        System.out.println("1. " + product.cass.getName());
        System.out.println("2. " + product.asahi.getName());
        System.out.println("6. 뒤로 가기");
        String select = sc.nextLine();
        switch (select) {
            case "1":
                sizeMenu(product.cass);
            case "2":
                sizeMenu(product.asahi);
            case "6":
                mainMenu();
            default:
                System.out.println("잘못 입력하였습니다. 메인으로 돌아갑니다.");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    // InterruptedException 처리
                    e.printStackTrace();
                }
                mainMenu();
        }
    }

    public void drinkMenu() {
        product.setProd();
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks MENU ]");
        System.out.println("1. " + product.cola.getName());
        System.out.println("2. " + product.cider.getName());
        System.out.println("6. 뒤로 가기");
        String select = sc.nextLine();
        switch (select) {
            case "1":
                sizeMenu(product.cola);
            case "2":
                sizeMenu(product.cider);
            case "6":
                mainMenu();
            default:
                System.out.println("잘못 입력하였습니다. 메인으로 돌아갑니다.");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    // InterruptedException 처리
                    e.printStackTrace();
                }
                mainMenu();
        }

    }

    public void frozenMenu() {
        product.setProd();
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ FrozenCustard MENU ]");
        System.out.println("1. " + product.choco.getName());
        System.out.println("2. " + product.milk.getName());
        System.out.println("6. 뒤로 가기");
        String select = sc.nextLine();
        switch (select) {
            case "1":
                sizeMenu(product.choco);
            case "2":
                sizeMenu(product.milk);
            case "6":
                mainMenu();
            default:
                System.out.println("잘못 입력하였습니다. 메인으로 돌아갑니다.");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    // InterruptedException 처리
                    e.printStackTrace();
                }
                mainMenu();
        }
    }

    //------------------3번째----------------
    //------------------사이즈---------------
    public void sizeMenu(Product p) {
        System.out.println("--------사이즈를 선택해 주세요---------");
        System.out.println("1. Normal");
        System.out.println("2. Large");
        String select = sc.nextLine();
        switch (select) {
            case "1":
                p.setSize(1); //노말사이즈
                org.example.controller.paySystem.addCart(p);
                cartMenu();
                break;
            case "2":
                p.setSize(2); //라지사이즈 500원추가
                org.example.controller.paySystem.addCart(p);
                cartMenu();
                break;
            default:
                System.out.println("잘못 입력하였습니다. 메인으로 돌아갑니다");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    // InterruptedException 처리
                    e.printStackTrace();
                }
                mainMenu();
                break;
        }
    }

    //--------------------------4단계------------------------
    //-------------------------장바구니-----------------------
    public void cartMenu() {
        System.out.println("[현재 장바구니]");
        for(int i = 0; i < Cart.cart.size(); i++){
            System.out.println(Cart.cart.get(i));
        }
        System.out.println();
        System.out.println("1. 결제 하기");
        System.out.println("2. 뒤로 가기");
        String select = sc.nextLine();
        switch (select){
            case "1":
                comMenu();
            case "2":
                mainMenu();
        }
    }

    //----------------------5단계---------------------------
    //---------------------결제완료--------------------------
    public void comMenu(){
        comPay();
        System.out.println("주문번호 : " + Cart.history.size()+ "입니다");
        System.out.println("----------주문 내역.----------");
        for(int i = 0; i < Cart.cart.size(); i++){
            System.out.println(Cart.cart.get(i));
        }
        Cart.cart.clear(); // 주문 내역(최종 장바구니)출력 후 초기화
        mainMenu();
    }
    //----------------------그외(총합, 결제기록)-------------------
    public void totalPriceMenu(){
        System.out.println("총 " + Cart.totalPrice + " 원");
    }
}
