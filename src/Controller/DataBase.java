package Controller;

import Model.employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase  {

    public static void SaveDataToFile(String path, Object list) throws IOException{
        saveEmplo(path, (List<employee>) list);

    }

    private static void saveEmplo(String path,List<employee> employeeList) throws IOException {
        File file= new File(path);
        FileOutputStream FOS=new FileOutputStream(path);
        ObjectOutputStream oos =new ObjectOutputStream(FOS);
        oos.writeObject(employeeList);
        oos.close();

    }
    public static Object LoadDataOfFile(String Path) throws IOException, ClassNotFoundException {
       Object employees = LoadEmploye(Path);
       return  employees;
    }

    private static Object LoadEmploye(String path) throws IOException, ClassNotFoundException {
        File file=new File(path);
        FileInputStream FIS=new FileInputStream(file);
        ObjectInputStream OIS=new ObjectInputStream(FIS);
        List<employee> employees= (ArrayList<employee>)OIS.readObject();
        OIS.close();
        return employees;
    }


}
