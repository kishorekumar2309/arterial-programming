package com.arterial.programming.purchase;

import java.util.List;
import java.util.Map;

public class Store {
    private final Map<Product, Integer> products;
    private final List<User> registeredUsers;

    public Store(Map<Product, Integer> products, List<User> registeredUsers) {
        this.products = products;
        this.registeredUsers = registeredUsers;
    }

    double purchase(User user, Product product, int numberOfItems) {
        if (user == null || product == null) {
            throw new IllegalArgumentException("Input parameters cannot be null");
        }
        if (numberOfItems <= 0) {
            throw new IllegalArgumentException("Number of items should be greater than 0");
        }
        if (!products.containsKey(product)) {
            throw new RuntimeException("Product not available in the store");
        }
        if (products.get(product) < numberOfItems) {
            throw new RuntimeException("Product out of stock in the store, we only have " + products.get(product) + " count/s");
        }
        return discountedPrice(user, product) * numberOfItems;
    }

    private double discountedPrice(User user, Product product) {
        double discountAmount = user.getMembership().getDiscount() / 100 * product.getPrice();
        return product.getPrice() - discountAmount;
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                ", registeredUsers=" + registeredUsers +
                '}';
    }
}
