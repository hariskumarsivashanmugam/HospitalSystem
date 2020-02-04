/*
 *
 */
package global.coda.hms.models;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class Response.
 */
@Component
public class Response {

	/** The status. */
	int status;

	/** The data. */
	Object data;

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Response [status=" + status + ", data=" + data + "]";
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(Object data) {
		this.data = data;
	}
}
