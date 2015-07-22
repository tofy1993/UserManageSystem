package net.vzhang.manager;

import java.util.List;

import net.vzhang.dao.UserDao;
import net.vzhang.dao.UserDaoImpl;
import net.vzhang.po.User;

public class UserManagerImpl implements UserManager {

	private UserDao userDao=new UserDaoImpl();
	
	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userDao.listAll();
	}

}
