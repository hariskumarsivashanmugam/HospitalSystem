/*
 *
 */
package global.coda.hms.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import global.coda.hms.constants.StatusConstants;
import global.coda.hms.models.Doctor;
import global.coda.hms.models.Response;
import global.coda.hms.models.User;
import global.coda.hms.services.DoctorServices;
import global.coda.hms.services.PatientServices;

// TODO: Auto-generated Javadoc
/**
 * The Class DoctorController.
 */
@CrossOrigin
@RestController
@ComponentScan("global.coda.hms.models")
public class DoctorController {

	/** The logger. */
	private final Logger logger = LogManager.getLogger(PatientServices.class);

	/** The doctor services. */
	@Autowired
	DoctorServices doctorServices;

	/** The user. */
	@Autowired
	User user;

	/** The response. */
	@Autowired
	Response response;

	/**
	 * Read doctor.
	 *
	 * @param userId the user id
	 * @return the response
	 */
	@GetMapping("/readDoctor/{id}")
	public Response readDoctor(@PathVariable("id") int userId) {
		logger.traceEntry(Integer.toString(userId));
		Doctor doctor = doctorServices.readDoctor(userId);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(doctor);
		logger.traceExit(doctor.toString());
		return response;
	}

	/**
	 * Creates the patient.
	 *
	 * @param doctor the doctor
	 * @return the response
	 */
	@PostMapping("/createDoctor")
	public Response createPatient(@RequestBody Doctor doctor) {
		logger.traceEntry(doctor.toString());
		Doctor doctors = doctorServices.createDoctor(doctor);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(doctors);
		logger.traceExit(doctors.toString());
		return response;
	}

	/**
	 * Update patient.
	 *
	 * @param doctor the doctor
	 * @return the response
	 */
	@PutMapping("/updateDoctor")
	public Response updatePatient(@RequestBody Doctor doctor) {
		logger.traceEntry(doctor.toString());
		Doctor doctors = doctorServices.updateDoctor(doctor);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(doctors);
		logger.traceExit(doctors.toString());
		return response;
	}

	/**
	 * Delete patient.
	 *
	 * @param doctorId the doctor id
	 * @return the response
	 */
	@DeleteMapping("/deleteDoctor/{id}")
	public Response deletePatient(@PathVariable("id") int doctorId) {
		logger.traceEntry(Integer.toString(doctorId));
		Doctor doctors = doctorServices.deleteDoctor(doctorId);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(doctors);
		logger.traceExit(doctors.toString());
		return response;
	}

	/**
	 * Find my patient.
	 *
	 * @param doctorId the doctor id
	 * @return the response
	 */
	@GetMapping("/doctor/{id}/patient")
	public Response findMyPatient(@PathVariable("id") int doctorId) {
		logger.traceEntry(Integer.toString(doctorId));
		List<String> list = doctorServices.findMyPatients(doctorId);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(list);
		logger.traceExit(list.toString());
		return response;
	}

	/**
	 * Find all patients.
	 *
	 * @return the response
	 */
	@GetMapping("/doctor/patient")
	public Response findAllPatients() {
		logger.traceEntry();
		List<Doctor> list = doctorServices.findAllPatients();
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(list);
		logger.traceExit(response);
		return response;

	}

}
