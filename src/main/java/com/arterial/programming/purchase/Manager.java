package com.arterial.programming.purchase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    public static void main(String[] args) {
        User aravind = new User(1, "Aravind", 1234567890L, new PlatinumMembership());
        User ashwin = new User(2, "Ashwin", 1023456789L, new GoldMembership());

        Product boost = new Product(1L, "Boost", 100);
        Product complan = new Product(2L, "Complan", 150);

        Map<Product, Integer> products = new HashMap<>();
        products.put(boost, 10);
        products.put(complan, 5);

        List<User> registerUsers = new ArrayList<>();
        registerUsers.add(aravind);
        registerUsers.add(ashwin);

        Store store = new Store(products, registerUsers);

        Product bornvita = new Product(3, "Bornvita", 75);

        try {
            System.out.println(store.purchase(ashwin, bornvita, 2));
        } catch (Exception e) {
            products.put(bornvita, 100);
            System.out.println(store.purchase(ashwin, bornvita, 2));
        }
    }
}
