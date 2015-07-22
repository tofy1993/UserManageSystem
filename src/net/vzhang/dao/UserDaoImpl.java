package net.vzhang.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.vzhang.dao.util.DBUtil;
import net.vzhang.po.User;

public class UserDaoImpl implements UserDao {

	private DBUtil util;
	
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		util=DBUtil.getInstance();
	}
	
	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		List<User> users=new ArrayList<User>();
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=util.getConnection();
			String sql="select * from members";
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next()) {
				User user=new User();
				user.setUid(rs.getInt("uid"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setRegIp(rs.getString("regip"));
				long time=rs.getInt("regdate");
				user.setRegDate(new Date(time));
				users.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
