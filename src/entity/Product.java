package entity;

import config.InputMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date createDate;
    private int productStatus;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, Date createDate, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.createDate = createDate;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public String status() {
        String signal = productStatus == 0 ? "Đang bán" :
                (productStatus == 1 ? "Het hàng" : "không ban");
        return signal;
    }

    //    Nhap du lieu
    public void inputData(boolean isChange, boolean status) throws ParseException {
        String regexID = "^[CSA][A-Z0-9]{3}$";

        if (isChange) {

            while (true) {

                System.out.println("nhập mã product");
                this.productId = InputMethods.getString();
                boolean checked = Pattern.compile(regexID).matcher(productId).matches();
                if (!checked) {
                    System.err.println("LOI");
                } else break;

            }
        }


        while (true) {
            System.out.println("nhập tên product");
            this.productName = InputMethods.getString();

            if (productName.length() < 10 || productName.length() > 50) {
                System.err.println("lỗi");
            } else break;
        }

        System.out.println("nhập giá cho sản phẩm!");
        this.price = InputMethods.getFloat();
        while (price < 0) {
            System.out.println("nhập lại giá cho sản phẩm!");
            this.price = InputMethods.getFloat();
        }

        System.out.println("nhập ngày nhận");
        this.createDate = sdf.parse(InputMethods.getString());
        System.out.println("nhập mieu tả product");
        this.description = InputMethods.getString();
        if (status) {
            System.out.println("nhập tran thái catalog");
            this.productStatus = InputMethods.getInteger();
        }

    }

    //xuat du lieu
    public void displayData() {
        System.out.printf("Mã Sp: %-4s | Tên Sp: %-15s |Giá: %-5.2f |Miêu tả: %-30s |Ngày nhập hàng: %-10s  | Trạng thái: %-15s \n", productId, productName, price, description, sdf.format(createDate), status());
    }
}
