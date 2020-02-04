/*
 *
 */
package global.coda.hms.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import global.coda.hms.exceptions.BusinessException;
import global.coda.hms.exceptions.PatientNotFound;

//import org.springframework.beans.factory.annotation.Autowired;

import global.coda.hms.mappers.PatientMapper;
import global.coda.hms.mappers.UserMapper;
import global.coda.hms.models.Patient;

// TODO: Auto-generated Javadoc
/**
 * The Class PatientServices.
 */
@Service
public class PatientServices {

	/** The logger. */
	private final Logger logger = LogManager.getLogger(PatientServices.class);

	/** The patient mapper. */
	@Autowired
	PatientMapper patientMapper;

	/** The user mapper. */
	@Autowired
	UserMapper userMapper;

	/** The patients. */
	int patients;

	/**
	 * Creates the patient.
	 *
	 * @param patient the patient
	 * @return the patient
	 * @throws BusinessException the business exception
	 * @throws PatientNotFound the patient not found
	 */
	public int createPatient(Patient patient)
	    throws BusinessException,
	    PatientNotFound {
		logger.traceEntry(patient.toString());
		if (userMapper.createUser(patient) == 1) {
			patient.setFkUserid(patient.getPkUserId());
			patients = (int) patientMapper.createPatient(patient);
		}
		logger.traceExit(patients);
		return patients;
	}

	/**
	 * Read patient.
	 *
	 * @param patientId the patient id
	 * @return the patient
	 */
	public int readPatient(int patientId) {
		logger.traceEntry(Integer.toString(patientId));
		patients = (int) patientMapper.readPatient(patientId);
		logger.traceExit(patients);
		return patients;
	}

	/**
	 * Update patient.
	 *
	 * @param patient the patient
	 * @return the patient
	 */
	public int updatePatient(Patient patient) {
		logger.traceEntry(patient.toString());
		patients = patientMapper.updatePatient(patient);
		logger.traceExit(patient.toString());
		return patients;

	}

	/**
	 * Delete patient.
	 *
	 * @param patientId the patient id
	 * @return the patient
	 */
	public int deletePatient(int patientId) {
		logger.traceEntry(Integer.toString(patientId));
		patients = patientMapper.deletePatient(patientId);
		logger.traceExit(patients);
		return patients;
	}

//	public boolean authentication(Patient patient) {
//		logger.traceEntry(patient.toString());
//		boolean patients = patientMapper.patientLogin(patient);
//		return patients;
	/**
	 * Gets the all patients.
	 *
	 * @return the all patients
	 */
//	}
	public List<Patient> getAllPatients() {
		logger.traceEntry();
		List<Patient> allPatients = null;
		allPatients = patientMapper.getAllPatients();
		logger.traceExit();
		return allPatients;
	}
//	public Patient create(Patient patient) {
//		logger.traceEntry();
//		int rowsAffectedInUser = 0;
//		int rowsAffectedInPatient = 0;
//		Patient createdPatient = null;
//		rowsAffectedInUser = userMapper.createUser(patient);
//		if (rowsAffectedInUser == 1) {
//			int userId = patient.getPkUserId();
//			patient.setFkUserid(userId);
//			rowsAffectedInPatient = patientMapper.createP(patient);
//			if (rowsAffectedInPatient == 1) {
//				createdPatient = patient;
//			}
//		}
//		logger.traceExit();
//		return createdPatient;
//	}
//	public Patient update(Patient patient) {
//		logger.traceEntry();
//		int rowsAffectedInPatient = 0;
//		Patient updatedPatient = null;
//		rowsAffectedInPatient = patientMapper.update(patient);
//		if (rowsAffectedInPatient == 1) {
//			logger.info("Patient table updated successfully");
//		}
//		logger.traceExit();
//		return updatedPatient;
//	}
//	public boolean delete(int patientId) {
//		logger.traceEntry();
//		boolean result = false;
//		int rowsAffected = 0;
//		Patient patient = null;
//		patient = patientMapper.getPatientById(patientId);
//		logger.info(patient.toString());
//		rowsAffected = patientMapper.delete(patientId);
//		if (rowsAffected == 2) {
//			logger.info("Patient is deleted successfully");
//			result = true;
//		}
//		logger.traceExit();
//		return result;
//	}
}
