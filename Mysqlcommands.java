package mysqlmws;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlcommands {

	public static void main(String[] args) throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		
		Statement stmt=con.createStatement();
		
		String s="INSERT INTO city VALUES(1,'Jerry','IND','TN','0001');";
		
		stmt.execute(s);
		con.close();
		System.out.println("Query executed");

	}

}
