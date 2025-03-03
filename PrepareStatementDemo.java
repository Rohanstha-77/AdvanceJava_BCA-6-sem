import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementDemo {
    Connection connect;
    PreparedStatement preparedStatement;
    
    PrepareStatementDemo() throws SQLException {
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ACHS","root","Nikesh@2206");
        if(connect == null){
            System.out.println("connection is failed");
        }
    }

    public void Insert() throws SQLException{
        preparedStatement = connect.prepareStatement( "insert into Students (rollno,name,level,major,division) values(?,?,?,?,?)");

        preparedStatement.setInt(1, 22061001);
        preparedStatement.setString(2, "Jn Bhandari");
        preparedStatement.setString(3, "Bachelor");
        preparedStatement.setString(4, "BCA");
        preparedStatement.setString(5, "first");
        
        int rowAffected = preparedStatement.executeUpdate();

        if(rowAffected > 0){
            System.out.println("Sucessfully Inserted");
        }else{
            System.out.println("Failed to insert");
        }
        
    }

    public static void main(String[] args) throws SQLException {
      PrepareStatementDemo method =  new PrepareStatementDemo();
      method.Insert();
    }
}
