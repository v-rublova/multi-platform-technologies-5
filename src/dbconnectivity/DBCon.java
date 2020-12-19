/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnectivity;

/**
 *
 * @author v.rublova
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class DBCon {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    DefaultTableModel model;
    DBCon() throws Exception, SQLException, SQLException{
        ConnectToDatabase();
    }

    private void ConnectToDatabase() throws Exception{
        try{
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
        }catch(Exception e){
            
        }
    }
    public void ExecuteQuery(String query) throws Exception{
        try {
            resultSet = statement
                    .executeQuery(query);
        } catch (Exception e) {
            throw e;
        }
    }

    public void Books() throws Exception{
        ExecuteQuery("Select * from library.book");
        NewModelBooks();
    }
    public void Authors() throws Exception{
        ExecuteQuery("Select * from library.author");
        NewModelAuthors();
    }
    public void DeleteAuthor(String id) throws SQLException, Exception{
        // Remove again the insert comment
            preparedStatement = connect
            .prepareStatement("delete from author where id_author= ? ; ");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
    }
    public void DeleteBook(String id) throws SQLException, Exception{
        // Remove again the insert comment
            preparedStatement = connect
            .prepareStatement("delete from book where id_book= ? ; ");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
    }

public void NewModelBooks() throws SQLException{
    model = new DefaultTableModel(new String[]{"id_book", "id_author", "name_book", "print_date_book"}, 0);
while(resultSet.next())
{
    String a = resultSet.getString(1);
    String b = resultSet.getString(2);
    String c = resultSet.getString(3);
    String d = resultSet.getString(4);
    model.addRow(new Object[]{a,b,c,d});
}
}
public void NewModelAuthors() throws SQLException{
   
    model = new DefaultTableModel(new String[]{"id_author", "fname_author", "sname_author"}, 0);
while(resultSet.next())
{
    String a = resultSet.getString(1);
    String b = resultSet.getString(2);
    String c = resultSet.getString(3);

    model.addRow(new Object[]{a,b,c});
}
}
    // You need to close the resultSet
    public void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
