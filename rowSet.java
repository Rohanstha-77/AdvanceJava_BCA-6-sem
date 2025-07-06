import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class rowSet {
    JdbcRowSet rowSet;
    rowSet() throws SQLException{
        // creating rowset Instance

        rowSet = RowSetProvider.newFactory().createJdbcRowSet();

        //connecting to database
        rowSet.setUrl("jdbc:mysql://localhost:3306/ACHS");
        rowSet.setUsername("root");
        rowSet.setPassword("Nikesh@2206");
    }

    public void Insert() throws SQLException{
        rowSet.setCommand("select * from Students");
        rowSet.execute();
        while (rowSet.next()) {
            System.out.println(rowSet.getInt(1));
            System.out.println(rowSet.getString(2));
            System.out.println(rowSet.getString(3));
            System.out.println(rowSet.getString(4));
            System.out.println(rowSet.getString(5));
        }
        rowSet.close();
    }

    public static void main(String[] args) throws SQLException{
        rowSet methods = new rowSet();
        methods.Insert();
        
    }
}
