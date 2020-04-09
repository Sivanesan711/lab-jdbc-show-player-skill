package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public 	List<Skill> listskills() throws SQLException, Exception
	{
		List<Skill> list = new ArrayList<Skill>();
		Skill skill = null;
		
		ConnectionManager con = new ConnectionManager();
		
		Statement st = con.getConnection().createStatement();
		
		String sql = "select name from skill";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			skill = new Skill(null, sql);
			
			System.out.println(rs.getString("name"));
			list.add(skill);
			
		}
		
		rs.close();
		st.close();
		con.getConnection().close();
		return list;
		
	}
}
