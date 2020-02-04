/*
 *
 */
package global.coda.hms.models;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;
// TODO: Auto-generated Javadoc

/**
 * The Class Doctor.
 */
@Component
public class Doctor extends User {

	/** The pk doctor id. */
	private int pkDoctorId;

	/** The doctor experience. */
	private int doctorExperience;

	/** The doctor speciality. */
	private String doctorSpeciality;

	/** The fk user id. */
	private int fkUserId;

	/** The doctor isactive. */
	private int doctorIsactive;

	/** The doctor created on. */
	private Timestamp doctorCreatedOn;

	/** The doctor updated on. */
	private Timestamp doctorUpdatedOn;

	/** The patient list. */
	List<String> patientList;

	/**
	 * Gets the patient list.
	 *
	 * @return the patient list
	 */
	public List<String> getPatientList() {
		return patientList;
	}

	/**
	 * Sets the patient list.
	 *
	 * @param patientList the new patient list
	 */
	public void setPatientList(List<String> patientList) {
		this.patientList = patientList;
	}

	/**
	 * Gets the pk doctor id.
	 *
	 * @return the pk doctor id
	 */
	public int getPkDoctorId() {
		return pkDoctorId;
	}

	/**
	 * Sets the pk doctor id.
	 *
	 * @param pkDoctorId the new pk doctor id
	 */
	public void setPkDoctorId(int pkDoctorId) {
		this.pkDoctorId = pkDoctorId;
	}

	/**
	 * Gets the doctor experience.
	 *
	 * @return the doctor experience
	 */
	public int getDoctorExperience() {
		return doctorExperience;
	}

	/**
	 * Sets the doctor experience.
	 *
	 * @param doctorExperience the new doctor experience
	 */
	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	/**
	 * Gets the doctor speciality.
	 *
	 * @return the doctor speciality
	 */
	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	/**
	 * Sets the doctor speciality.
	 *
	 * @param doctorSpeciality the new doctor speciality
	 */
	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	/**
	 * Gets the fk user id.
	 *
	 * @return the fk user id
	 */
	public int getFkUserId() {
		return fkUserId;
	}

	/**
	 * Sets the fk user id.
	 *
	 * @param fkUserId the new fk user id
	 */
	public void setFkUserId(int fkUserId) {
		this.fkUserId = fkUserId;
	}

	/**
	 * Gets the doctor isactive.
	 *
	 * @return the doctor isactive
	 */
	public int getDoctorIsactive() {
		return doctorIsactive;
	}

	/**
	 * Sets the doctor isactive.
	 *
	 * @param doctorIsactive the new doctor isactive
	 */
	public void setDoctorIsactive(int doctorIsactive) {
		this.doctorIsactive = doctorIsactive;
	}

	/**
	 * Gets the doctor created on.
	 *
	 * @return the doctor created on
	 */
	public Timestamp getDoctorCreatedOn() {
		return doctorCreatedOn;
	}

	/**
	 * Sets the doctor created on.
	 *
	 * @param doctorCreatedOn the new doctor created on
	 */
	public void setDoctorCreatedOn(Timestamp doctorCreatedOn) {
		this.doctorCreatedOn = doctorCreatedOn;
	}

	/**
	 * Gets the doctor updated on.
	 *
	 * @return the doctor updated on
	 */
	public Timestamp getDoctorUpdatedOn() {
		return doctorUpdatedOn;
	}

	/**
	 * Sets the doctor updated on.
	 *
	 * @param doctorUpdatedOn the new doctor updated on
	 */
	public void setDoctorUpdatedOn(Timestamp doctorUpdatedOn) {
		this.doctorUpdatedOn = doctorUpdatedOn;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Doctor [pkDoctorId=" + pkDoctorId + ", doctorExperience="
		    + doctorExperience + ", doctorSpeciality="
		    + doctorSpeciality + ", fkUserId=" + fkUserId + ", doctorIsactive="
		    + doctorIsactive
		    + ", doctorCreatedOn=" + doctorCreatedOn + ", doctorUpdatedOn="
		    + doctorUpdatedOn + ", getPkUserId()="
		    + getPkUserId() + ", getUserUsername()=" + getUserUsername()
		    + ", getUserPassword()="
		    + getUserPassword() + ", getUserEmail()=" + getUserEmail()
		    + ", getUserPhonenumber()="
		    + getUserPhonenumber() + ", getUserFirstname()=" + getUserFirstname()
		    + ", getUserLastname()="
		    + getUserLastname() + ", getUserAge()=" + getUserAge()
		    + ", getUserCity()=" + getUserCity()
		    + ", getUserState()=" + getUserState() + ", getUserStreet()="
		    + getUserStreet() + ", getFkRoleId()="
		    + getFkRoleId() + ", getUserIsactive()=" + getUserIsactive()
		    + ", getUserCreatedOn()="
		    + getUserCreatedOn() + ", getUserUpdatedOn()=" + getUserUpdatedOn()
		    + "]";
	}

}
