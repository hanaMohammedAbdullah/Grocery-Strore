package collection;

import com.company.Data.Category;
import com.company.Data.Product;
import com.company.Data.employee;

public interface managerTask  {

    public abstract void addEmployee(employee employees);
    public abstract void removeEmployee(employee employees);
    public abstract void updateEmployee(employee employees);
    public abstract void showAllEmployee(employee employees);


    public abstract void addCategory(Category category);
    public abstract void deleteCategory(Category category);
    public abstract void updateCategory(Category category);
    public abstract void showAllEmployee(Category category);


    public abstract void addProduct(Product products);
    public abstract void removeProduct(Product products);
    public abstract void updateProduct(Product products);
    public abstract void searchProduct(Product products);
    public abstract void showAllProduct(Product products);



}
