package ProjectOneDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ProjectOneModel.User;

public class userDao {

	static {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            }
    }
    
    public User getByUserName(String Uname) throws ClassNotFoundException {
    	String URL = "jdbc:postgresql://mydatabase.cqzwrx5bqbes.us-east-2.rds.amazonaws.com:5432/project1";
		String username = "jdbu";
		String password = "12345";
        
          //Class.forName("org.postgressql.Driver");
        try ( Connection conn = DriverManager.getConnection(URL,username,password)){
            String sql="select * from users where lower(username) =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,Uname);
            ResultSet rs = ps.executeQuery();
            User u = null;
            while(rs.next()) {
                u= new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
                
            }
    return u;
            
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    

}
