package trng.imcs.db;

import java.util.Arrays;
import java.util.List;

import trng.imcs.db.pojo.UserData;

public class UserDao implements IUserDao {

	List<UserData> userDataLilst;
	public UserDao() {
		userDataLilst = Arrays.asList(
				new UserData("U101", "tiger", "Raj", Arrays.asList("ADMIN_ROLE", "SUPER_ROLE")), 
				new UserData("U102", "lion", "Mohan", Arrays.asList("SUPER_ROLE"))
				);
	}
	
	public UserData getUserData(String userId, String password) {
		for(UserData userData : userDataLilst) {
			if (userData.getUserId().equalsIgnoreCase(userId) && userData.getPassword().equals(password)) {
				return userData;
			}
		}
		return null;
	}

}
