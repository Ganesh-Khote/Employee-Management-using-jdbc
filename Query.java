public class Query{
  public static final String insert="Insert into employee (id,Name,Salary,Department,Address) values(?,?,?,?,?)"; 
//    static String view="slect * from rmployee";
public static final String view = "SELECT id, Name, Salary, Department, Address FROM Employee";
// public static final	String update="UPDATE Employee SET name = ? WHERE id = ?";
public static final String update = "UPDATE Employee SET Name = ?, Salary = ?, Department = ?, Address = ? WHERE id = ?";

	public static final	String delete="Delete from Employee where id= ?";

}