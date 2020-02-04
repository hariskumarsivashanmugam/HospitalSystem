/*
 *
 */
package global.coda.hms.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import global.coda.hms.constants.QueryConstants;
import global.coda.hms.models.Patient;

// TODO: Auto-generated Javadoc
/**
 * The Interface PatientMapper.
 */
@Mapper
public interface PatientMapper {

	/**
	 * Gets the all patients.
	 *
	 * @return the all patients
	 */
	@Select(QueryConstants.PATIENT_READ_ALL)
	List<Patient> getAllPatients();

	/**
	 * Read patient.
	 *
	 * @param patientId the patient id
	 * @return the patient
	 */
	@Select(QueryConstants.PATIENT_READ)
	int readPatient(int patientId);

	/**
	 * Creates the patient.
	 *
	 * @param patient the patient
	 * @return the patient
	 */
	@Insert(QueryConstants.PATIENT_INSERT)
	@Options(useGeneratedKeys = true, keyProperty = "pkPatientId",
	    keyColumn = "pk_patient_id")
	int createPatient(Patient patient);
//
//	@Select(QueryConstants.PATIENT_READ)
//	Patient getPatientById(int id);

	/**
	 * Delete patient.
	 *
	 * @param patientId the patient id
	 * @return the int
	 */
	@Delete(QueryConstants.PATIENT_DELETE)
	int deletePatient(int patientId);

	/**
	 * Update patient.
	 *
	 * @param patient the patient
	 * @return the int
	 */
	@Update(QueryConstants.PATIENT_UPDATE)
	int updatePatient(Patient patient);

	/**
	 * Update patient.
	 *
	 * @param patient the patient
	 * @return the patient //
	 */
//	@Update(QueryConstants.PATIENT_UPDATE)
//	Patient updatePatient(Patient patient);
//
//	/**
//	 * Delete patient.
//	 *
//	 * @param patientId the patient id
//	 * @return the patient
//	 */
//	@Delete(QueryConstants.PATIENT_DELETE)
//	Patient deletePatient(int patientId);
//
//	@Select("select * from t_user_details as user where user.user_username = #{userUsername} and user.user_password = #{userPassword}")
//	boolean patientLogin(Patient patient);
//
//	@Insert(QueryConstants.PATIENT_INSERT)
//	@Options(useGeneratedKeys = true, keyProperty = "pkPatientId",
//	    keyColumn = "pk_patient_id")
//	int createP(Patient patient);
}
