package net.vzhang.action;

import java.sql.SQLException;
import java.util.List;

import net.vzhang.manager.UserManager;
import net.vzhang.manager.UserManagerImpl;
import net.vzhang.po.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private static final String List="list";
	
	private UserManager userMgr=new UserManagerImpl();
	
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String listAll() throws SQLException {
		System.out.println("Yes");
		this.users=userMgr.listAll();
		return List;
	}
}
