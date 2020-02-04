/*
 *
 */
package global.coda.hms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class sampleModel.
 */
@Entity
public class sampleModel {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	/** The user name. */
	String userName;

	/** The first name. */
	String firstName;

	/** The last name. */
	String lastName;

	/**
	 * Instantiates a new sample model.
	 */
	public sampleModel() {

	}

	/**
	 * Instantiates a new sample model.
	 *
	 * @param id the id
	 * @param username the username
	 * @param firstName the first name
	 * @param lastName the last name
	 */
	public sampleModel(int id, String username, String firstName,
	    String lastName) {
		super();
		this.id = id;
		this.userName = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return userName;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.userName = username;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
