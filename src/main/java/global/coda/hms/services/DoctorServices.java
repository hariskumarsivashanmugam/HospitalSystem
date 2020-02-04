/*
 *
 */
package global.coda.hms.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import global.coda.hms.mappers.DoctorMapper;
import global.coda.hms.mappers.UserMapper;
import global.coda.hms.models.Doctor;

// TODO: Auto-generated Javadoc
/**
 * The Class DoctorServices.
 */
@Service
public class DoctorServices {

	/** The logger. */
	private final Logger logger = LogManager.getLogger(DoctorServices.class);

	/** The doctor mapper. */
	@Autowired
	DoctorMapper doctorMapper;

	/** The user mapper. */
	@Autowired
	UserMapper userMapper;

	/** The doctors. */
	@Autowired
	Doctor doctors;

	/**
	 * Creates the doctor.
	 *
	 * @param doctor the doctor
	 * @return the doctor
	 */
	public Doctor createDoctor(Doctor doctor) {
		logger.traceEntry(doctor.toString());
		if (userMapper.createUser(doctor) == 1) {
			doctor.setFkUserId(doctor.getPkUserId());
			doctors = doctorMapper.createDoctor(doctor);
		}
		logger.traceExit(doctors.toString());
		return doctors;
	}

	/**
	 * Read doctor.
	 *
	 * @param doctorId the doctor id
	 * @return the doctor
	 */
	public Doctor readDoctor(int doctorId) {
		logger.traceEntry(Integer.toString(doctorId));
		doctors = doctorMapper.readDoctor(doctorId);
		logger.traceExit(doctors.toString());
		return doctors;
	}

	/**
	 * Update doctor.
	 *
	 * @param doctor the doctor
	 * @return the doctor
	 */
	public Doctor updateDoctor(Doctor doctor) {
		logger.traceEntry(doctor.toString());
		doctors = doctorMapper.updateDoctor(doctor);
		logger.traceExit(doctor.toString());
		return doctors;

	}

	/**
	 * Delete doctor.
	 *
	 * @param doctorId the doctor id
	 * @return the doctor
	 */
	public Doctor deleteDoctor(int doctorId) {
		logger.traceEntry(Integer.toString(doctorId));
		doctors = doctorMapper.deleteDoctor(doctorId);
		logger.traceExit(doctors);
		return null;
	}

	/**
	 * Find my patients.
	 *
	 * @param doctorId the doctor id
	 * @return the list
	 */
	public List<String> findMyPatients(int doctorId) {
		logger.traceEntry(Integer.toString(doctorId));
		List<String> list = doctorMapper.findMyPatient(doctorId);
		logger.traceExit(list.toString());
		return list;
	}

	/**
	 * Find all patients.
	 *
	 * @return the list
	 */
	public List<Doctor> findAllPatients() {
		logger.traceEntry();
		List<Doctor> list = doctorMapper.getAllPatientUnderAllDoctors();
		logger.traceExit();
		return list;
	}
}
