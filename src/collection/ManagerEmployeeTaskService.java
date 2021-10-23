package collection;

import com.company.Data.Category;
import com.company.Data.Product;
import com.company.Data.employee;

import java.util.List;

public class ManagerEmployeeTaskService implements managerTaskService{

    managerTask man=new ManagerEmployeeTask();

    @Override
    public void addEmployee(employee employees) {
        man.addEmployee(employees);
    }

    @Override
    public void removeEmployee(employee employees) {
        man.removeEmployee(employees);
    }

    @Override
    public void updateEmployee(employee employees) {
        man.updateEmployee(employees);
    }

    @Override
    public List<employee> showAllEmployee() {
        return man.showAllEmployee();
    }

    @Override
    public void addCategory(Category category) {
        man.addCategory(category);
    }

    @Override
    public void deleteCategory(Category category) {
        man.deleteCategory(category);
    }

    @Override
    public void updateCategory(Category category) {
        man.updateCategory(category);
    }

    @Override
    public List<Category> showAllCategory() {
        return man.showAllCategory();
    }

    @Override
    public void addProduct(Product products) {
        man.addProduct(products);
    }

    @Override
    public void removeProduct(Product products) {
        man.removeProduct(products);
    }

    @Override
    public void updateProduct(Product products) {
        man.updateProduct(products);
    }

    @Override
    public void searchProduct(Product products) {

    }

    @Override
    public List<Product> showAllProduct() {
        return man.showAllProduct();
    }

}
