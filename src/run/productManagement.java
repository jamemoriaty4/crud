package run;

import abstracted.IDesignProduct;
import abstracted.ProductImplement;
import config.InputMethods;

import java.text.ParseException;

public class productManagement {
    private static final IDesignProduct designProduct = new ProductImplement();
    public static void main(String[] args) throws ParseException {
        while (true) {
            System.out.println("""
                    *******************PRODUCT MANAGEMENT*****************
                    1.\tNhập thông tin các sản phẩm
                    2.\tHiển thị thông tin các sản phẩm
                    3.\tSắp xếp các sản phẩm theo giá
                    4.\tCập nhật thông tin sản phẩm theo mã sản phẩm
                    5.\tXóa sản phẩm theo mã sản phẩm
                    6.\tTìm kiếm các sản phẩm theo tên sản phẩm
                    7.\tTìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)
                    8.\tThoát
                    """);

            System.out.println("nhập va lựa cho của bạn");
            byte choice = InputMethods.getByte();

            switch (choice) {
                case 1:
                        designProduct.addProduct();
                    break;
                case 2:
                    designProduct.displayProduct();
                    break;
                case 3:
                    designProduct.sortPrice();
                    break;
                case 4:designProduct.updateProduct();
                    break;
                case 5:
                    designProduct.findProductByID();
                    break;
                case 6:
                    designProduct.findProductByPrice();
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Kết thúc chương trình");
                    return;
            }
        }
    }
}
