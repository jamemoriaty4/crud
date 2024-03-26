package abstracted;


import config.InputMethods;
import entity.Product;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ProductImplement implements IDesignProduct {

    List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() throws ParseException {
        System.out.println("nhập sản phẩm cần thêm mới!");
        Product product = new Product();
        product.inputData(true, true);
        productList.add(product);
    }

    @Override
    public void displayProduct() {
        if (productList.isEmpty()) {
            System.err.println("Danh sách trống");
        } else {
            for (Product i : productList) {
                i.displayData();
            }
        }

    }

    @Override
    public void sortPrice() {
        productList.sort((o1, o2) -> Float.compare(o1.getPrice(), o2.getPrice()));
    }

    @Override
    public void updateProduct() throws ParseException {
        System.out.println("nhap vào id can thay doi");
        int id = InputMethods.getInteger();

        productList.get(id).inputData(false, true);
    }

    @Override
    public void deleteProduct() {
        System.out.println("nhap vào id can xoa");
        int id = InputMethods.getInteger();
        productList.remove(id);
        System.out.println("xoá thành công");
    }

    @Override
    public void findProductByID() {
        System.out.println("nhap vào id can tim kiem");
        int id = InputMethods.getInteger();
        productList.get(id);
    }

    @Override
    public void findProductByPrice() {
        float a, b;
        System.out.println("nhập giá a: ");
        a = InputMethods.getFloat();
        System.out.println("nhâ giá B : ");
        b = InputMethods.getFloat();
        while (a > b) {
            System.out.println("nhập lại giá a: ");
            a = InputMethods.getFloat();
            System.out.println("nhâ  lại giá B : ");
            b = InputMethods.getFloat();
        }
        boolean check = false;
        for (Product p : productList) {
            if (p.getPrice() >= a && p.getPrice() <= b) {
                p.displayData();
                check = true;
            }
        }
        if (!check) {
            System.err.println("không thấy sp");
        }
    }
}
