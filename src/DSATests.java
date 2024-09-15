import models.Category;
import models.Coupons;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DSATests {

    @Test
    void couponProblem(){
        CouponProblem cp = new CouponProblem();

        /*
                Coupons = [
        {"CategoryName:Comforter Sets", "CouponName:Comforters Sale"},
        {"CategoryName:Bedding", "CouponName:Savings on Bedding"},
        {"CategoryName:Bed & Bath", "CouponName:Low price for Bed & Bath"}
        ]

        Categories = [
        {"CategoryName:Comforter Sets", "CategoryParentName:Bedding"},
        {"CategoryName:Bedding", "CategoryParentName:Bed & Bath"},
        {"CategoryName:Bed & Bath", "CategoryParentName:None"},
        {"CategoryName:Soap Dispensers", "CategoryParentName:Bathroom Accessories"},
        {"CategoryName:Bathroom Accessories", "CategoryParentName:Bed & Bath"},
        {"CategoryName:Toy Organizers", "CategoryParentName:Baby And Kids"},
        {"CategoryName:Baby And Kids", "CategoryParentName:None}
        ]*/

        List<Coupons> coupons = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Comforter Sets", "Bedding"));
        categories.add(new Category("Bedding", "Bed & Bath"));
        categories.add(new Category("Bed & Bath", "None"));
        categories.add(new Category("Soap Dispensers", "Bathroom Accessories"));
        categories.add(new Category("Bathroom Accessories", "Bed & Bath"));
        categories.add(new Category("Toy Organizers", "Baby And Kids"));
        categories.add(new Category("Baby And Kids", "None"));


        coupons.add(new Coupons("Comforter Sets", "Comforters Sale"));
        coupons.add(new Coupons("Bedding", "Savings on Bedding"));
        coupons.add(new Coupons("Bed & Bath", "Low price for Bed & Bath"));
        cp.couponController(coupons, categories);

        /*
            "Comforter Sets" => "Comforters Sale"
            "Bedding" => "Savings on Bedding"
            "Bathroom Accessories" => "Low price for Bed & Bath"
            "Soap Dispensers" => "Low price for Bed & Bath"
            "Toy Organizers" => null
         */
        System.out.println(cp.query("Comforter Sets"));
        System.out.println(cp.query("Bedding"));
        System.out.println(cp.query("Bathroom Accessories"));
        System.out.println(cp.query("Soap Dispensers"));
        System.out.println(cp.query("Toy Organizers"));
    }
}
