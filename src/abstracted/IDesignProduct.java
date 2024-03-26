package abstracted;

import java.text.ParseException;

public interface IDesignProduct {
    void addProduct() throws ParseException;
    void displayProduct();

    void sortPrice();
    void updateProduct() throws ParseException;
    void deleteProduct();
    void findProductByID();
    void findProductByPrice();

}
