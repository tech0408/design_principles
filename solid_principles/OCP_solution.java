package solid_principles;

interface Discount{

    public double  apply(double price);
}

class NewYearDiscount implements Discount{

    @Override
    public double apply(double price) {
        return price*0.9;  // 10% discount
    }
}

class BlackFridayDiscount implements Discount{

    @Override
    public double apply(double price) {
        return price*0.8; // 20% discount
    }
}

class DiscountService1 {

    public double applyDiscount(Discount discount, double price){
        return discount.apply(price);
    }
}

public class OCP_solution {

    public static void main(String[] args) {
        DiscountService1 disSvc = new DiscountService1();

        Discount nYDis = new NewYearDiscount();
        System.out.println("New year discount price: "+ disSvc.applyDiscount(nYDis,100.0));

        Discount bfDis = new BlackFridayDiscount();
        System.out.println("Black friday discount price: "+ disSvc.applyDiscount(bfDis,100.0));

    }
}
