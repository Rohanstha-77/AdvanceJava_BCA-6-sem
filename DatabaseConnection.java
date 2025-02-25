import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/CURDinJava";
        String username = "root";
        String password = "Nikesh@2206";

        //Establish the connection
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url,username,password);
            
            //create statement object to execute query
            Statement stm = connect.createStatement();

            // writting sql queries
            String query = "select * from Students";

            //exectuing query it print the resultset object reference instead of data
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                String name = result.getString("name");
                String address = result.getString("Address");
                // int PhoneNumber = result.getInt("PhoneNumber");
                // int rollNUmber = result.getInt("RollNumber");
                System.out.println(name);
                System.out.println(address);
            }
            result.close();
            stm.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
