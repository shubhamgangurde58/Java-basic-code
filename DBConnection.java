
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

class DBConnection{

	public static void main(String args[]){
	
		try{
			//Step.1 Register the Driver
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Registraction Succesfully...");
	
			//Step.2 Get Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","root");
			System.out.println("Get Connection Succesfully...");

			//Step.3 Create Statement Object
			Statement stmt = con.createStatement();
			System.out.println("Statement Object Creation Succesfully..");

			//Step.4 Execute the Query
			//stmt.executeUpdate("create table imrdInfo(id number(3),name varchar2(10))");
			stmt.executeUpdate("insert into imrdInfo values(2,'jayesh')");
			stmt.executeUpdate("insert into imrdInfo values(3,'ritesh')");
			stmt.executeUpdate("insert into imrdInfo values(4,'chetan')");
			System.out.println("Query Executed Succesfully..");				

			//Step.5 close the Connection 
			stmt.close();
			System.out.println("Connection close..");
		}
		catch(SQLException ex){

			System.out.println("error in database connection..");
	
		}
	}

}