//package Controller;
//import Model.Category;
//import java.io.*;
//import java.util.*;
//
//public class MnagerCategoryDemo {
//
//    Scanner sc = new Scanner(System.in);
//
//    Scanner input = new Scanner(System.in);
//
//    List<Category> categories=new ArrayList<>();
//
//    ListIterator li=null;
//
//    File file= new File("src\\Files\\categories.txt");
//
//
//    ObjectOutputStream oos=null;
//
//    ObjectInputStream ois=null;
//
//     if (file.isFile()) {
//
//        try {
//            ois = new ObjectInputStream(new FileInputStream(file));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            categories = (ArrayList<Category>) ois.readObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            ois.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//    int choose=-1;
//       do{
//
//        System.out.println(" \nWelcome manager Enter your choice you : ");
//        System.out.println("1.add New Category: ");
//        System.out.println("2.Display Ctaegoey Information : ");
//        System.out.println("3.Search for a  Category : ");
//        System.out.println("4.Delete a  Category :");
//        System.out.println("5.Update a  Ctaegory :");
//        System.out.println("0.Exit from Category: ");
//        choose=input.nextInt();
//        System.out.println("--------------------------------------------------");
//        int CateTimes;
//        switch (choose) {
//            case 1:
//                System.out.println("\nWelcome manager how many category you will add");
//
//                CateTimes = input.nextInt();
//                for (int i = 0; i < CateTimes; i++) {
//                    System.out.print("Enter the Category Id Using Numbers :");
//                    int CatEid = input.nextInt();
//                    System.out.print("Enter the Category type :");
//                    String CatType = sc.nextLine();
//                    System.out.print("Enter the Category Descrepstion :");
//                    String CatDes = sc.nextLine();
//
//                    System.out.println("--------------------------------------------------");
//
//                    try {
//                        categories.add(new Category(CatEid, CatType, CatDes));
//                    } catch (InputMismatchException e) {
//                        System.out.println("There a problem with Input of data  ");
//
//                    }
//                }
//                System.out.println("--------------------------------------------------");
//                try {
//                    oos = new ObjectOutputStream(new FileOutputStream(file));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    oos.writeObject(categories);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                break;
//            case 2:
//
//                try {
//                    li = categories.listIterator();
//
//                    while (li.hasNext()) {
//
//                        System.out.println(li.next());
//
//                    }
//                } catch (Exception e) {
//                    System.out.println("--------------------------------------------------");
//
//                    System.out.println("File Doesn't Exist....!");
//
//                    System.out.println("--------------------------------------------------");
//                }
//                break;
//            if (file.isFile()) {
//
//                boolean found = false;
//
//                System.out.print("Enter the Category id to Find :");
//
//                int CatID = input.nextInt();
//
//                li = categories.listIterator();
//
//                while (li.hasNext()) {
//
//                    Category e = (Category) li.next();
//
//                    if (e.getCategoryID() == CatID) {
//
//                        found = true;
//
//                        System.out.println(e);
//                    }
//                }
//                if ((!found)) {
//
//                    System.out.println("--------------------------------------------------");
//
//                    System.out.println("Record not Found....!");
//
//                    System.out.println("--------------------------------------------------");
//
//                }
//
//            } else {
//
//                System.out.println("--------------------------------------------------");
//
//                System.out.println("File Doesn't Exist....!");
//
//                System.out.println("--------------------------------------------------");
//
//            }
//            break;
//
//            case 4:
//                if (file.isFile()) {
//
//                    boolean found = false;
//
//                    System.out.print("Enter the Category Id to Delete : ");
//
//                    int CatId = input.nextInt();
//
//                    li = categories.listIterator();
//
//
//                    while (li.hasNext()) {
//
//                        Category e = (Category) li.next();
//
//                        if (e.getCategoryID() == CatId) {
//
//                            found = true;
//
//                            li.remove();
//
//                            System.out.println(e);
//                        }
//                    }
//                    System.out.println("--------------------------------------------------");
//                    if ((found)) {
//
//                        try {
//                            oos = new ObjectOutputStream(new FileOutputStream(file));
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//
//                        try {
//                            oos.writeObject(categories);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//
//                        try {
//                            oos.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//
//                        System.out.println("The Record Delete Successfully");
//
//
//                    } else {
//
//                        System.out.println("Record not Found....!");
//
//                    }
//
//                } else {
//
//                    System.out.println("--------------------------------------------------");
//
//                    System.out.println("File Doesn't Exist....!");
//
//                }
//                System.out.println("--------------------------------------------------");
//                break;
//            case 5:
//                if (file.isFile()) {
//
//                    boolean found = false;
//
//                    System.out.print("Enter the Employee id to Update : ");
//
//                    int CatId = input.nextInt();
//
//                    li = categories.listIterator();
//
//                    while (li.hasNext()) {
//
//                        Category e = (Category) li.next();
//
//                        if (e.getCategoryID() == CatId) {
//
//                            found = true;
//                            System.out.print("Enter the Category Id Using Numbers :");
//                            int CatEid = input.nextInt();
//                            System.out.print("Enter the Category type :");
//                            String CatType = sc.nextLine();
//                            System.out.print("Enter the Category Descrepstion :");
//                            String CatDes = sc.nextLine();
//
//                            System.out.println("--------------------------------------------------");
//
//                            try {
//                                categories.add(new Category(CatEid, CatType, CatDes));
//                            } catch (InputMismatchException exception) {
//                                System.out.println("There a problem with Input of data  ");
//
//                            }
//                            System.out.println(e);
//                        }
//
//
//                        if ((found)) {
//
//
//                                System.out.println("--------------------------------------------------");
//                                try {
//                                    oos = new ObjectOutputStream(new FileOutputStream(file));
//                                } catch (IOException ioException) {
//                                    ioException.printStackTrace();
//                                }
//                                try {
//                                    oos.writeObject(categories);
//                                } catch (IOException ioException) {
//                                    ioException.printStackTrace();
//                                }
//                                try {
//                                    oos.close();
//                                } catch (IOException ioException) {
//                                    ioException.printStackTrace();
//                                }
//                                System.out.println("The Record Update Successfully");
//
//                                System.out.println("--------------------------------------------------");
//
//
//                            } else {
//                                System.out.println("--------------------------------------------------");
//
//                                System.out.println("Record not Found....!");
//
//                                System.out.println("--------------------------------------------------");
//                            }
//
//                        }
//                    } else{
//
//                    System.out.println("--------------------------------------------------");
//
//                    System.out.println("File Doesn't Exist....!");
//
//                    System.out.println("--------------------------------------------------");
//
//                }
//                break;
//            case 0:
//                System.out.println("Have a nice Day Manager.");
//                break;
//            default :
//                System.out.println("This chose is is not valide : " + choose);
//
//        }
//       }while(choose != 0);
//
//}
