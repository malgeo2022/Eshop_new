package Entities.Impl;

import Entities.Order;
import Entities.Product;

import java.util.Arrays;

public class DefaultOrder implements Order {

    private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;
    private static final int AMOUNT_OF_DIGITS_IN_TELEPHONE_NUMBER = 10;

    private String creditCardNumber;
    private Product[] products;
    private int customerId;
    private String adress;
    private String telephoneNumber;


    @Override
    public void setProducts(Product[] products) {
        this.products = products;

    }

    @Override
    public boolean isCreditCardNumberValid(String creditCardNumber) {
        return creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER
                && !creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber) > 0;
    }

    @Override
    public void setCreditCardNumber(String userInput) {
        if (creditCardNumber == null){
            return;
        }
        this.creditCardNumber = creditCardNumber;

    }

    @Override
    public void setCustomerId(int customerId) {
        this.customerId = customerId;

    }

    @Override
    public int getCustomerId() {
        return this.customerId;
    }

    @Override
    public String getAdress() {
        return this.adress;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean isTelephoneNumberValid(String telephoneNumber) {
        return telephoneNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_TELEPHONE_NUMBER
                && !telephoneNumber.contains(" ") && Long.parseLong(telephoneNumber) > 0;
    }

    @Override
    public void setTelephoneNumber(String userInput) {
        if (telephoneNumber == null){
            return;
        }
        this.telephoneNumber = telephoneNumber;

    }

    @Override
    public String toString() {
        return "DefaultOrder{" +
                "creditCardNumber='" + creditCardNumber + '\'' +
                ", products=" + Arrays.toString(products) +
                ", customerId=" + customerId +
                ", adress='" + adress + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
