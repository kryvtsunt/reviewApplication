package review.model;

/**
 * Users is a simple, plain old java objects (POJO).
 * Well, almost (it extends {@link Companies_TymofiiKryvtsun}).
 */
public class Users_TymofiiKryvtsun {
	protected String userName;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String phone; 
	
	public Users_TymofiiKryvtsun(String userName, String password, String firstName, String lastName, String email, String phone) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public Users_TymofiiKryvtsun(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

		

}
