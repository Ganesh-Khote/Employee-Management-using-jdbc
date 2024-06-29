public  class Employee{
    private static int id;
    private static String Name;
    private static Double Salary;
    private static String Department;
    private static String Address;
    
    
    public Employee(int id, String name, Double salary, String department, String address) {
        this.id = id;
        Name = name;
        Salary = salary;
        Department = department;
        Address = address;
    }

    


    public static int getId() {
        return id;
    }


    public static String getName() {
        return Name;
    }


    public static Double getSalary() {
        return Salary;
    }


    public static String getDepartment() {
        return Department;
    }


    public static String getAddress() {
        return Address;
    }

    

    
}