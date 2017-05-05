package trng.imcs.db.pojo;

import java.util.List;

public class UserData {
	private String userId;
	private String password;
	private String userName;
	private List<String> userRoles;
	
	public UserData(String userId, String password, String userName, List<String> userRoles) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userRoles = userRoles;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(List<String> userRoles) {
		this.userRoles = userRoles;
	}
}
