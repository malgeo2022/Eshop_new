package Entities.Impl;

import Entities.Cart;
import Entities.Product;

import java.util.Arrays;

public class DefaultCart implements Cart {

    private static final int DEFAULT_CART_CAPACITY = 5;

    private Product[] products;
    private int lastIndex;

    {
        products = new Product[DEFAULT_CART_CAPACITY];
    }

    @Override
    public boolean isEmpty(){
        if (products == null || products.length == 0){
            return true;
        }
        for (Product product : products){
            if (product != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public void addProduct(Product product) {
        if (product == null){
            return;
        }
        if (products.length <= lastIndex){
            products = Arrays.copyOf(products, products.length << 1);
        }
        products[lastIndex++] = product;
    }

    @Override
    public Product[] getProducts(){
        int notNullProductsAmount = 0;
        for (Product product : products){
            if (product != null){
                notNullProductsAmount++;
            }
        }
      Product[] notNullProducts = new Product[notNullProductsAmount];
        int index = 0;
        for (Product product : products){
            if (product != null){
                notNullProducts[index++] = product;
            }
        }
        return notNullProducts;
    }

    @Override
    public void clear(){
        products = new Product[DEFAULT_CART_CAPACITY];
    }


}
