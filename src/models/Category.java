package models;

public class Category {
    String categoryName;
    String parentCategoryName;

    public Category(String categoryName, String parentCategoryName) {
        this.categoryName = categoryName;
        this.parentCategoryName = parentCategoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    @Override
    public String toString() {
        return "models.Category{" +
                "categoryName='" + categoryName + '\'' +
                ", parentCategoryName='" + parentCategoryName + '\'' +
                '}';
    }
}
