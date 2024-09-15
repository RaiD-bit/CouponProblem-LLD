import models.Category;
import models.Coupons;
import models.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CouponProblem {
    HashMap<String, Node> db = new HashMap<>();

    void couponController(List<Coupons> coupons, List<Category> categories){
        // lets create tree
        for (Category c: categories){
            db.put(c.getCategoryName(), new Node(c.getCategoryName(), c.getParentCategoryName(), ""));
        }

        for (Coupons c: coupons){
            db.get(c.getCategoryName()).setCoupon(c.getCouponName());
        }

    }

    String query(String categoryname){
        Node current = db.get(categoryname);
        while(current != null && !Objects.equals(current.getName(), "None")){
            if(!Objects.equals(current.getCoupon(), "")){
                return current.getCoupon();
            }
            current = db.get(current.getParent());
        }

        return "sorry no coupons for u";
    }
}



