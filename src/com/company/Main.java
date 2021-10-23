package com.company;
import collection.*;
import com.company.Data.Category;

import java.util.List;

public class Main  {

    public static void main(String[] args) {

        managerTaskService service=new ManagerEmployeeTaskService();

        service.addCategory(new Category(1,"Milk","It is good for Body"));
        service.addCategory(new Category(2,"Meat","It is delicious"));
        service.addCategory(new Category(3,"vegetables","It is Healthy"));

        List<Category> catList=service.showAllCategory();

        for (Category cat:catList) {
            System.out.println(cat.getCategoryID()+" "+cat.getCategoryType()+" "+cat.getCategoryDescription());
        }

        Category update=new Category(1,"Fruit","It Contain All Vitamin");
        service.updateCategory(update);

        System.out.println("Updated Category after update operation");

        catList=service.showAllCategory();
        for (Category cat:catList) {
            System.out.println(cat.getCategoryID()+" "+cat.getCategoryType()+" "+cat.getCategoryDescription());
        }

        Category delete=new Category(1,"Fruit","It Contain All Vitamin");
        service.deleteCategory(delete);

        System.out.println(" Category after remove operation");

        catList=service.showAllCategory();
        for (Category cat:catList) {
            System.out.println(cat.getCategoryID()+" "+cat.getCategoryType()+" "+cat.getCategoryDescription());
        }











//        try {
//
//            List<employee> employees = new LinkedList<>();
//
//            employees.add(new employee("admin", "hana", "hana", "ndnkefnksd", "male", 21, "hannaxjka@djkb.com", "07503073788", "adamin"));
//
//
//            ArrayList<Product> products = new ArrayList<>();
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("************************* Grocery Store *************************");
//            int comand;
//            Optional<List<Product>> listOptional = Optional.of(products);
//            Scanner sc = new Scanner(System.in);
//            do {
//                System.out.println("Enter you Operation :" + "\n1.ADD PRODUCT\n2.show product\n3.Delete all the product\n4.EXit");
//                comand = input.nextInt();
//
//
//                switch (comand) {
//                    case 1:
//                        System.out.println("how many products");
//                        int times = input.nextInt();
//                        for (int i = 0; i < times; i++) {
//                            System.out.println("Enter the ProductId : ");
//                            int id = input.nextInt();
//
//                            System.out.println("Enter the quantity : ");
//                            int quantity = input.nextInt();
//
//                            System.out.println("Enter the name of the product : ");
//
//                            String Name = sc.nextLine();
//                            System.out.println("Enter the price : ");
//                            double price = input.nextInt();
//                            products.add(new Product(id, Name, quantity, price));
//
//                            FileOutputStream fileout=new FileOutputStream(new File("C:\\Users\\Click\\IdeaProjects\\grovery_v2\\src\\data.ser"));
//                            ObjectOutputStream obout=new ObjectOutputStream(fileout);
//                            obout.(products);
//                            obout.close();
//                            fileout.close();
//                            System.out.println("Data is saved in file");
//
//                        }
//                        break;
//                    case 2:
//                        FileInputStream fileinput=new FileInputStream(new File("C:\\Users\\Click\\IdeaProjects\\grovery_v2\\src\\data.ser"));
//                        ObjectInputStream obinput=new ObjectInputStream(fileinput);
//                        List<Product> products1=(List<Product>)obinput.readObject();
//                        if (products1.isEmpty()) {
//                            System.out.println("sorry but the file is empity");
//                        } else {
//                            Collections.sort(products1, (p1, p2) -> {
//                                return p1.getAddProduct().compareTo(p2.getAddProduct());
//                            });
//                            for (Product p : products1) {
//                                System.out.println("id : " + p.getProductID() + "\nProduct : " + p.getAddProduct() + "\nPrice : " + p.getAddPrice() + "\nQuantity : " + p.getAddQuantity() +"\n*********************");
//
//                            }
//
//                        }
//                        break;
//                    case 3:
//                        products.removeAll(products);
//                        System.out.println(" REMOVED ALL THE PRODUCTS ");
//
//                    case 4:
//                        System.out.println("Have a nice day.");
//
//                        break;
//                    default:
//                        System.out.println("you inter a wrong number");
//
//                }
//            } while (comand != 4);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }


}


