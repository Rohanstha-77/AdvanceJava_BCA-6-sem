import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

interface CurdMethods{
    void insert() throws SQLException;
    void create();
    void update () throws SQLException;
    void read() throws SQLException;
    void delete() throws SQLException;

}

// abstract class InnerCRUDinJava {
//     abstract void insert();
//     abstract void create();
//     abstract void update ();
//     abstract void read();
//     abstract void delete();
    
// }
public class CRUDinJava implements CurdMethods {

    private Connection connect;
    private ResultSet result;
    private Statement stm;

    //constructor
    CRUDinJava() throws SQLException{

        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ACHS","root","Nikesh@2206");
        if(connect == null){
            System.out.println("connection is failed");
        }
    }
    
     @Override
     public void insert() throws SQLException{
        stm = connect.createStatement();
        String query = "insert into Students (rollno,name,level,major,division) values('22061024','Bishesh limbu','Bachelors','BCA','third Division')";
        int InsertResult = stm.executeUpdate(query); 
        if(InsertResult > 0) {
            System.out.println("Data has sucessfully inserted");
        }else{
            System.out.println("Fail to insert data");
        }
     }

    @Override
    public void create() {
        
    }

    @Override
    public void update() throws SQLException {
       stm = connect.createStatement();
       String updateQuery = "update Students set name = 'Rohan Shrestha' where rollno = '22061003'";
       int UpdateResult = stm.executeUpdate(updateQuery);
       if(UpdateResult > 0 ){
        System.out.println("sucessfully updated your data");
       }else{
        System.out.println("failed to update your data");
       }

    }

    @Override
    public void read() throws SQLException {
        stm = connect.createStatement();
        result = stm.executeQuery("select * from Students");
        while (result.next()) {
            String rollno = result.getString("rollno");
            String name = result.getString("name");
            String level = result.getString("level");
            String major = result.getString("major");
            String division = result.getString("division");
            
            System.out.println("Roll Number " + rollno);
            System.out.println("Name " + name);
            System.out.println("level " + level);
            System.out.println("Major Number " + major);
            System.out.println("Division" + division);
        }
    }

    @Override
    public void delete() throws SQLException {
        stm = connect.createStatement();
        String DeleteQuery = "delete from Students where rollno = '22061002'";
        int DeleteResult = stm.executeUpdate(DeleteQuery);
        if(DeleteResult > 0){
            System.out.println("successfully deleted");
        }else{
            System.out.println("fail to delete");
        }
        read();
    }

    public static void main(String[] args) {
        try {
            CRUDinJava methods = new CRUDinJava();
            // methods.insert();
            // methods.delete();
            methods.update();
            methods.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}