import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

interface CurdMethods{
    void insert();
    void create();
    void update ();
    void read() throws SQLException;
    void delete();

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

        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/CURDinJava","root","Nikesh@2206");
        if(connect == null){
            System.out.println("connection is failed");
        }
    }
    
     @Override
     public void insert(){
        
     }

    @Override
    public void create() {
        
    }

    @Override
    public void update() {
       
    }

    @Override
    public void read() throws SQLException {
        stm = connect.createStatement();
        result = stm.executeQuery("select * from Students");
        while (result.next()) {
            String name = result.getString("name");
            String address = result.getString("address");
            long PhoneNumber = result.getLong("PhoneNumber");
            long RollNumber = result.getLong("RollNo");

            System.out.println("Roll Number " + RollNumber);
            System.out.println("name " + name);
            System.out.println("Address " + address);
            System.out.println("Phone Number " + PhoneNumber);
        }
    }

    @Override
    public void delete() {
        
    }

    public static void main(String[] args) {
        try {
            CRUDinJava methods = new CRUDinJava();
            methods.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}