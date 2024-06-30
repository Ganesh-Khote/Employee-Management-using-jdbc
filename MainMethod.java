import java.sql.SQLException;

import java.util.Scanner;

public class MainMethod{
    public static void main(String[] args) throws SQLException {
        System.out.println("Employee Management System");
Scanner sc=new Scanner(System.in);
int choice;


     do{ 
    

            System.out.println(" 1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Update Employee");
            System.out.println("4.Delete Employee");
            System.out.println("Enter your choice");
             choice=sc.nextInt();

        

        switch(choice){
            case 1:
            System.out.println("Add New Employee");
            System.out.println("Enter the employee Id");
            int id=sc.nextInt();
            System.out.println("Enter the employee Name");
            String name=sc.next();
           
            System.out.println("Enter the employee Salary");
            Double salary=sc.nextDouble();
            
            System.out.println("Enter the employee Department");
            String dept=sc.next();
            
            System.out.println("Enter the employee Address");
            String Address=sc.next();
       

            Employee emp=new Employee(id, name, salary, dept, Address);
            EmployeeDao.createEmployee(emp);

            break;

          case 2:
          System.out.println("VIew Employee");
          EmployeeDao.viewEmployee();
         
          break; 
          
          case 3:
            System.out.println("Update Employee");
            
            System.out.println("Enter the employee Id");
            int idu=sc.nextInt();
            System.out.println("Enter the employee Name");
            String nameu=sc.next();
            
            System.out.println("Enter the employee Salary");
            Double salaryu=sc.nextDouble();
            
            System.out.println("Enter the employee Department");
            String deptu=sc.next();
            
            System.out.println("Enter the employee Address");
            String Addressu=sc.next();
        

            
            EmployeeDao.updateEmployee(idu, nameu, salaryu, deptu, Addressu);
            
          break;

          case 4:
          System.out.println("Delete Employee");
          System.out.println("Enter the Employee Id You Want to delete");
          int idd=sc.nextInt();
          EmployeeDao.deleteEmployee(idd);
          break;
        }

        } while(choice !=5);


    
    }
}