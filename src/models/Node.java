package models;

public class Node {
    String name;
    String parent;
    String coupon;

    public Node(String name, String parent, String coupon) {
        this.name = name;
        this.parent = parent;
        this.coupon = coupon;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", parent='" + parent + '\'' +
                ", coupon='" + coupon + '\'' +
                '}';
    }
}
