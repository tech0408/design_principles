package clean_code;

class DiscountCalculatorUtils {

    public double calculateDiscount(double price, double discountPercentage) {
        return price * discountPercentage;
    }

    public double calculateElectronicDiscount(double price) {
        return calculateDiscount(price, 0.90); // 10% discount
    }

    public double calculateClothingDiscount(double price) {
        return calculateDiscount(price, 0.80); // 20% discount
    }

    public double calculateFurnitureDiscount(double price) {
        return calculateDiscount(price, 0.85); // 15% discount
    }
}
public class dryPrincipleSolution {

    public static void main(String[] args) {
        DiscountCalculatorUtils dis = new DiscountCalculatorUtils();
        System.out.println(dis.calculateClothingDiscount(1000));
        System.out.println(dis.calculateElectronicDiscount(20000));
        System.out.println(dis.calculateFurnitureDiscount(12000));

    }

}
