package lk.ijse.dep11.app;

import java.sql.*;

public class TestClearance3 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dep11_filtering_app","root","sachitha18")) {

            Statement stmDuplicates = connection.createStatement();
            PreparedStatement stmRetrieve = connection.prepareStatement("SELECT id FROM customer WHERE contact =?",ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
            ResultSet rstDuplicates = stmDuplicates.executeQuery("SELECT contact, COUNT(contact) as count FROM customer GROUP BY contact HAVING count > 1");
            
            while (rstDuplicates.next()){
                String contact = rstDuplicates.getString("contact");
                int count = rstDuplicates.getInt("count");
                System.out.printf("%s - %s\n",contact,count);

                stmRetrieve.setString(1,contact);
                ResultSet rstIds = stmRetrieve.executeQuery();
                rstIds.next();
                while (rstIds.next()){
                    int id = rstIds.getInt("id");
                    rstIds.deleteRow();
                    System.out.printf("%s : %d",contact,id);
                }
            }
        }
        
    }
}
