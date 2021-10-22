package com.company.Data;

import java.util.Objects;

public class Category {
    private int categoryID;
    private   String categoryType;
    private String categoryDescription;

    public Category(int categoryID, String categoryDescription, String categoryType){

        setCategoryDescription(categoryDescription);
        setCategoryID(categoryID);
        setCategoryType(categoryType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return categoryID == category.categoryID && Objects.equals(categoryType, category.categoryType) && Objects.equals(categoryDescription, category.categoryDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, categoryType, categoryDescription);
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }
}
