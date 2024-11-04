
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

class DBConnection2{

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

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the id and name=");
			int id = scanner.nextInt();
			String name = scanner.next();


			//Step.4 Execute the Query
			//stmt.executeUpdate("create table imrdInfo(id number(3),name varchar2(10))");
			stmt.executeUpdate("insert into imrdInfo values("+id+",'"+name+"')");
			//stmt.executeUpdate("delete from imrdInfo where id=2");
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