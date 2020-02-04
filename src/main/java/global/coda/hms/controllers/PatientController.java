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
import global.coda.hms.exceptions.BusinessException;
import global.coda.hms.models.Patient;
import global.coda.hms.models.Response;
import global.coda.hms.models.User;
import global.coda.hms.services.PatientServices;

// TODO: Auto-generated Javadoc
/**
 * The Class PatientController.
 */
@CrossOrigin
@RestController
@ComponentScan("global.coda.hms.models")
public class PatientController {

	/** The logger. */
	private final Logger logger = LogManager.getLogger(PatientServices.class);

	/** The patient services. */
	@Autowired
	PatientServices patientServices;

	/** The user. */
	@Autowired
	User user;

	/** The response. */
	@Autowired
	Response response;

	/** The repo. */
	@Autowired
	Repos repo;

	/**
	 * Read patient.
	 *
	 * @param userId the user id
	 * @return the response
	 */
	@GetMapping("/readPatient/{id}")
	public Response readPatient(@PathVariable("id") int userId) {
		logger.traceEntry(Integer.toString(userId));
		int patient = patientServices.readPatient(userId);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(patient);
		logger.traceExit(patient);
		return response;
	}

	/**
	 * Read all patients.
	 *
	 * @return the response
	 */
	@GetMapping("/readAllPatients")
	public Response readAllPatients() {
		logger.traceEntry();
		List<Patient> allPatients = null;
		allPatients = patientServices.getAllPatients();
		response.setData(allPatients);
		response.setStatus(StatusConstants.STATUS_200);
		logger.traceExit();
		return response;
	}

	/**
	 * Creates the patient.
	 *
	 * @param patient the patient
	 * @return the response
	 * @throws BusinessException the business exception
	 */
	@PostMapping("/createPatient")
	public Response createPatient(@RequestBody Patient patient)
	    throws BusinessException {
		logger.traceEntry(patient.toString());
		try {
			int patients = patientServices.createPatient(patient);
			response.setStatus(StatusConstants.STATUS_200);
			response.setData(patients);
			logger.traceExit(patients);
		} catch (Exception e) {
			throw new BusinessException(e.toString());
		}
		return response;

	}
//	@PostMapping("/create")
//	public Response create(@RequestBody Patient patient) {
//		logger.traceEntry();
//		Patient createdpatient = null;
//		createdpatient = patientServices.create(patient);
//		if (createdpatient == null) {
//			logger.info("Patient is not created successfully");
//			response.setData("Patient is not created successfully");
//			response.setStatus(400);
//		} else {
//			response.setStatus(StatusConstants.STATUS_200);
//			response.setData(createdpatient);
//		}
//		logger.traceExit();
//		return response;
//	}

//	@PutMapping("/update")
//	public Response update(@RequestBody Patient patient) {
//		logger.traceEntry();
//		Patient updatedpatient = null;
//		updatedpatient = patientServices.update(patient);
//		if (updatedpatient == null) {
//			logger.info("Patient is not updated successfully");
//			response.setData("Patient is not updated successfully");
//			response.setStatus(400);
//		} else {
//			response.setStatus(StatusConstants.STATUS_200);
//			response.setData(updatedpatient);
//		}
//		logger.traceExit();
//		return response;
//	}

	/**
	 * Update patient.
	 *
	 * @param patient the patient
	 * @return the response
	 */
	@PutMapping("/updatePatient")
	public Response updatePatient(@RequestBody Patient patient) {
		logger.traceEntry(patient.toString());
		int patients = patientServices.updatePatient(patient);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(patients);
		logger.traceExit(patients);
		return response;
	}

//	@DeleteMapping("/delete/{id}")
//	public Response delete(@PathVariable("id") int patientId) {
//		logger.traceEntry();
//		boolean isDeleted = false;
//		isDeleted = patientServices.delete(patientId);
//		if (isDeleted) {
//			response.setStatus(400);
//			response.setData("Patient is deleted successfully");
//		} else {
//			response.setStatus(500);
//			response.setData("Patient is not deleted successfully");
//		}
//		logger.traceExit();
//		return response;
//	}

	/**
	 * Delete patient.
	 *
	 * @param patientId the patient id
	 * @return the response
	 */
	@DeleteMapping("/deletePatient/{id}")
	public Response deletePatient(@PathVariable("id") int patientId) {
		logger.traceEntry(Integer.toString(patientId));
		int patients = patientServices.deletePatient(patientId);
		response.setStatus(StatusConstants.STATUS_200);
		response.setData(patients);
		logger.traceExit(patients);
		return response;
	}

//	@PostMapping("/login")
//	public Response patientLogin(@RequestBody Patient patient,
//	    HttpServletRequest request, HttpServletResponse responseNew) {
//		logger.traceEntry(patient.toString());
//		boolean patients = patientServices.authentication(patient);
//		if (patients) {
//			GenerateJwt jwtToken = new GenerateJwt();
//			String key = (String) responseNew.getHeader("key");
//			jwtToken.createJWT("patient", "Patient", "Authenticated", System
//			    .currentTimeMillis());
//			response.setStatus(StatusConstants.STATUS_200);
//			response.setData(key + "New" + jwtToken.createJWT("True", "Patient",
//			    "Authenticated", System.currentTimeMillis()));
//		}
//		logger.traceExit(patients);
//		return response;
//	}

//	@PostMapping("/createJPA")
//	public Response createJPA() {
//
//		sampleModel sample = new sampleModel(0, "George Harrison","firstName","lastName");
//		repo.save(sample);
//		response.setData(StatusConstants.STATUS_200);
//		response.setData(sample);
//		return response;
//	}

}
