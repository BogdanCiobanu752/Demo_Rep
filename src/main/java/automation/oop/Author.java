package automation.oop;

public class Author {
	String name;
	String email;

	/**
	 * @return This method returns author name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return This method returns the author email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param name
	 *        This is the author name
	 * @param email
	 *        This is the author email
	 */
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

}
