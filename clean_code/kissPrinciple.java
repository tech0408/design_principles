package clean_code;

import java.util.Arrays;
import java.util.List;

public class kissPrinciple {

    public static void printEvenNumbers(List<Integer> nums){
        for(Integer num: nums) {

            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {

        // Print even numbers
        List<Integer> nums = Arrays.asList(2,45,14,9,66);

        // Violation of KISS principle.
       // printEvenNumbers(nums);

        // Adhering to KISS
        nums.stream().filter(num->num%2==0).forEach(System.out::println);

    }
}
