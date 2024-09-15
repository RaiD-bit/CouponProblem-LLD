package models;

public class Coupons {
    String categoryName;
    String couponName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Coupons(String categoryName, String couponName) {
        this.categoryName = categoryName;
        this.couponName = couponName;
    }

    @Override
    public String toString() {
        return "Coupons{" +
                "categoryName='" + categoryName + '\'' +
                ", couponName='" + couponName + '\'' +
                '}';
    }
}
