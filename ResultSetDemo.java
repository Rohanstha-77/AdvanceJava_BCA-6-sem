// import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
    Connection connect;
    ResultSet ResultSets;
    Statement stm;
    

    ResultSetDemo() throws SQLException {
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ACHS","root","Nikesh@2206");
        if(connect == null){
            System.out.println("connection is failed");
        }
        stm = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }


    public void read() throws SQLException{
        ResultSets = stm.executeQuery("select * from Students");

        //move to the first row
        ResultSets.first();
        ResultSets.updateString("division", "Fourth");
        ResultSets.updateRow();

        // insert new user
        ResultSets.moveToInsertRow();
        ResultSets.updateString("rollno", "22061000");
        ResultSets.updateString("name", "Abhishek");
        ResultSets.updateString("level", "Bachelor");
        ResultSets.updateString("major", "MBA");
        ResultSets.updateString("Division", "First");
        ResultSets.insertRow();

        
    }
    
    public static void main(String[] args) throws SQLException {
        ResultSetDemo methodDemo = new ResultSetDemo();
        methodDemo.read();
    }


}
