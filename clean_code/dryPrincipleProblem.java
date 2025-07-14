package clean_code;

class DiscountCalculator {

    public double calculateElectronicDiscount(double price) {
        return price * 0.90; // 10% discount
    }

    public double calculateClothingDiscount(double price) {
        return price * 0.80; // 20% discount
    }

    public double calculateFurnitureDiscount(double price) {
        return price * 0.85; // 15% discount
    }
}

public class dryPrincipleProblem {

    public static void main(String[] args) {

        DiscountCalculator dis = new DiscountCalculator();
        System.out.println(dis.calculateClothingDiscount(1000));
        System.out.println(dis.calculateElectronicDiscount(20000));
        System.out.println(dis.calculateFurnitureDiscount(12000));
    }
}
