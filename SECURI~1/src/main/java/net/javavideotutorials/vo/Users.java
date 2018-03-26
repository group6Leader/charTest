package net.javavideotutorials.vo;

public class Users {

	private String username;
	private String password;
	private char enabled;
	
	public Users(String username, String password, char enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	
	public Users() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getEnabled() {
		return enabled;
	}

	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}
}
