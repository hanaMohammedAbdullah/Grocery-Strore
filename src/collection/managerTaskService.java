package collection;

import com.company.Data.Category;
import com.company.Data.Product;
import com.company.Data.employee;

import java.util.List;

public interface managerTaskService {
    public abstract void addEmployee(employee employees);
    public abstract void removeEmployee(employee employees);
    public abstract void updateEmployee(employee employees);
    public abstract List<employee> showAllEmployee();


    public abstract void addCategory(Category category);
    public abstract void deleteCategory(Category category);
    public abstract void updateCategory(Category category);
    public abstract List<Category> showAllCategory();


    public abstract void addProduct(Product products);
    public abstract void removeProduct(Product products);
    public abstract void updateProduct(Product products);
    public abstract void searchProduct(Product products);
    public abstract List<Product> showAllProduct();


}
