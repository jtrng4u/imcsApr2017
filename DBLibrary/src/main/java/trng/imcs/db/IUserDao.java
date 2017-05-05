package trng.imcs.db;

import trng.imcs.db.pojo.UserData;

public interface IUserDao {
	UserData getUserData(String userId, String password);
}
