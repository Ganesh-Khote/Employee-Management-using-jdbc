import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDao{

    public static void createEmployee(Employee employee){
        String query=Query.insert;

        try(Connection conn=Connections.connect();
        PreparedStatement psmt=conn.prepareStatement(query)){
            psmt.setInt(1, Employee.getId());
            psmt.setString(2, Employee.getName());
            psmt.setDouble(3, Employee.getSalary());
            psmt.setString(4, Employee.getDepartment());
            psmt.setString(5, Employee.getAddress());

            int Addonerow=psmt.executeUpdate();
            if(Addonerow>0){
                System.out.println("Employee Add Successfully with id"+Employee.getId());
            }else{
                System.out.println("Employee Not Add");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void viewEmployee() throws SQLException{
      
        String query=Query.view;
        try(Connection conn=Connections.connect();
        PreparedStatement psmt=conn.prepareStatement(query) ;
        ResultSet rs=psmt.executeQuery()){

            while (rs.next()) {
                int id=rs.getInt("id");
                String name=rs.getString("Name");
                Double Salary=rs.getDouble("Salary");
                String Department=rs.getString("Department");
                String Address=rs.getString("Address");

                System.out.println("Id :"+id+"  Name :"+name+"  Salary :"+Salary+"  Dapartment :"+Department+"  Address :"+Address);
                
            }



        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void deleteEmployee(int idd) throws SQLException{
        String query= Query.delete;
        try(Connection conn=Connections.connect()){
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1,idd);
           int Affectedrow= psmt.executeUpdate();
           
           if(Affectedrow > 0) {
               System.out.println("Employee is Delete Successfully with id:"+idd);
           }
           else {
               System.out.println("No Found id With Employee");
           }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void updateEmployee(int id,String Name,Double Salary,String Department,String Address){
        String query=Query.update;
        try(Connection conn=Connections.connect();
        PreparedStatement psmt=conn.prepareStatement(query)){

           
          

      
            psmt.setInt(5, id);
            psmt.setString(1,Name);
            psmt.setDouble(2, Salary);
            psmt.setString(3, Department);
            psmt.setString(4, Address);

            int Affectedrow=psmt.executeUpdate();

            if(Affectedrow>0){
                System.out.println("Employee Data Update Successfully");
            }else{
                System.out.println("Employee Data Not Update");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}