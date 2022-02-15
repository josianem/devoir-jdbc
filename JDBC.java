import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC{
public static void main(String[] args)throws SQLException{
String url="jdbc:mysql://localhost:3306/usersinfo";
String user="root";
String password="mypassword";
String query="select * from users";

try{
Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e){
e.printStackTrace();
}
try{
Connection con=DriverManager.getConnection(url,user,password);
Statement statement=con.createStatement();
ResultSet result=statement.executeQuery(query);

while (result.next()){
String UsersData="";
for (int i=1;i<=4;i++){
ClubsData += result.getString(i)+":";
}
System.out.println(UsersData);
}



}
catch(SQLException e) {
	e.printStackTrace();
}
}
}