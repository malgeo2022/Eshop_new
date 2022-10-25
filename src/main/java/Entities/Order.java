package Entities;

public interface Order {

    void setProducts(Product[] products);
    boolean isCreditCardNumberValid(String userInput);
    void setCreditCardNumber(String userInput);
    void setCustomerId(int customerId);
    int getCustomerId();

    String getAdress();

    void setAdress(String adress);

    boolean isTelephoneNumberValid(String userInput);
    void setTelephoneNumber(String userInput);





}
