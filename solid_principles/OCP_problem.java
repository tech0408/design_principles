package solid_principles;

// If a new discount type is to be introduced, we will have to change the implementation.
class DiscountService{

    public double applyDiscount(String discountType, double price){

        if(discountType.equals("NEWYEAR")){
            return price*0.9; //10% discount
        }
        else if(discountType.equals("BLACKFRIDAY")){
            return price*0.8; // 20% discount
        }
        return price;
    }
}

public class OCP_problem {
}
