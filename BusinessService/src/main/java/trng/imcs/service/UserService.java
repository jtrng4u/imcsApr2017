package trng.imcs.service;

import trng.imcs.service.bo.User;

public interface UserService {
	User getUser(String userId, String passwored);
}
