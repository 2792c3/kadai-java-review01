
public class Review01 {

    public static void main(String[] args) {
        int productPrice = 1500;
        int taxRate = 10;
        int tax = getTax(productPrice, taxRate);
        System.out.println(productPrice + "円の商品の税込価格は" + (productPrice + tax) + "円（消費税は" + tax +"円）です。");
    }

public static int getTax(int productPrice, int taxRate) {
    double taxPercentage = (double) taxRate / 100;
    double tax = productPrice * taxPercentage;
    return (int) tax;
    }

}
