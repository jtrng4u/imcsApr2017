package trng.imcs.service;

import trng.imcs.db.UserDao;
import trng.imcs.db.pojo.UserData;
import trng.imcs.service.bo.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl() {
		super();
		this.userDao = new UserDao();
	}

	public User getUser(String userId, String password) {
		UserData userData = userDao.getUserData(userId, password);
		return prepareUser(userData);
	}

	private User prepareUser(UserData userData) {
		User user = new User();
		user.setUserId(userData.getUserId());
		user.setUserName(userData.getUserName());
		user.setUserRoles(userData.getUserRoles());

		return user;

	}

}
