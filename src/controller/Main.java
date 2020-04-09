package controller;

import java.sql.SQLException;

import dao.SkillDAO;
import model.Skill;

public class Main
{
	public static void main(String[] args) throws SQLException, Exception
	{
		Skill skill = new Skill(null, null);
		SkillDAO skilldao = new SkillDAO();
		
		System.out.println("list of name");
		System.out.println();
		
		for(int i=0;i>skilldao.listskills().size();i++)
		{
			System.out.println(i+1 + " " + skilldao.listskills().get(i).getSkillName());
		}
	}
}
