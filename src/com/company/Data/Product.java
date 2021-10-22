package com.company.Data;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

     int productID;
     String addProduct;
     int addQuantity;
     double addPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productID == product.productID && addQuantity == product.addQuantity && Double.compare(product.addPrice, addPrice) == 0 && Objects.equals(addProduct, product.addProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, addProduct, addQuantity, addPrice);
    }

    public Product(int productID, String addProduct, int addQuantity, double addPrice){

        setProductID(productID);
        setAddProduct(addProduct);
        setAddQuantity(addQuantity);
        setAddPrice(addPrice);

    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getAddProduct() {
        return addProduct;
    }

    public void setAddProduct(String addProduct) {
        this.addProduct = addProduct;
    }

    public int getAddQuantity() {
        return addQuantity;
    }

    public void setAddQuantity(int addQuantity) {
        this.addQuantity = addQuantity;
    }

    public double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(double addPrice) {
        this.addPrice = addPrice;
    }


}
