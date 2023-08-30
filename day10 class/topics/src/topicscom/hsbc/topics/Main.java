package topicscom.hsbc.topics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws SQLException{
			String url = "jdbc:mysql://localhost/hsbc";
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet res = null;
			List<Topics> topic = new ArrayList<>();
			
				con = DriverManager.getConnection(url,"root","Agra@282005");
				
				String query = "select * from topics";
				stmt = con.prepareStatement(query);
				res = stmt.executeQuery();
				while(res.next()) {
					
					Topics topics =new Topics();
					topics.setTid(res.getString("tid"));
					topics.setName(res.getString("name"));
					topic.add(topics);
					
				}
				
				res.close();
				stmt.close();
				con.close();
				System.out.println(topic);
				
			/*	Topics t1 = new Topics();
				t1.setName("Linux");
				t1.setTid("T3");
				Main.add(t1);
		
	}
	
	public static void add(Topics t) {
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		
		try {
			con = DriverManager.getConnection(url,"root","Agra@282005");
			
			String query = "insert into topics(tid,name) values(?,?)";
			stmt = con.prepareStatement(query);
			stmt.setString(1,t.getTid());
			stmt.setString(2,t.getName());
			
			int n = stmt.executeUpdate();
			System.out.println(n+"topic Inserted");
			stmt.close();
			con.close();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}}
