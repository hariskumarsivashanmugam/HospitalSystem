/*
 *
 */
package global.coda.hms;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import global.coda.hms.constants.TestConstants;
import global.coda.hms.controllers.PatientController;
import global.coda.hms.exceptions.BusinessException;
import global.coda.hms.exceptions.PatientNotFound;
import global.coda.hms.models.Patient;
import global.coda.hms.models.Response;
import global.coda.hms.services.PatientServices;
@SpringBootTest
public class HospitalSystemTests {

   @Autowired
	 private PatientServices test;

   @Autowired
   PatientController controlTest;
//
//	/** The logger. */
//	private final Logger logger = LogManager.getLogger(PatientServices.class);


  @Test
  public void testReadPatient1()
  {
      int result=test.readPatient(13);
      assertEquals(result, 28);
  }
  @Test
  public void testReadPatient2()
  {

     Response result=controlTest.readPatient(TestConstants.TEST_CASE_1);
     assertEquals( result.getStatus(), 24);
  }
  @Test
  public void testCreatePatient1() throws BusinessException, PatientNotFound {
  	Patient patient = new Patient();
		patient.setUserUsername(TestConstants.USERNAME);
		patient.setUserPassword(TestConstants.PASSWORD);
		patient.setUserAge(TestConstants.AGE);
		patient.setPatientBloodGroup(TestConstants.BLOODGROUP);
		patient.setPatientHeight(TestConstants.HEIGHT);
		patient.setPatientWeight(TestConstants.WEIGHT);
		patient.setUserEmail(TestConstants.EMAIL);
		patient.setUserFirstname(TestConstants.FIRSTNAME);
		patient.setUserLastname(TestConstants.LASTNAME);
		patient.setUserPhonenumber(TestConstants.PHONE_NUMBER);
		patient.setUserState(TestConstants.STATE);
		patient.setUserStreet(TestConstants.STREET);
		patient.setUserCity(TestConstants.CITY);
		try {
			int result = test.createPatient(patient);
			assertEquals(result,1);
		} catch (BusinessException e) {
			throw new BusinessException(e.toString());
		}
  }
  @Test
  public void testCreatePatient2() throws PatientNotFound, BusinessException {
  	Patient patient = new Patient();
		patient.setUserUsername(TestConstants.USERNAME);
		patient.setUserPassword(TestConstants.PASSWORD);
		patient.setUserAge(TestConstants.AGE);
		patient.setPatientBloodGroup(TestConstants.BLOODGROUP);
		patient.setPatientHeight(TestConstants.HEIGHT);
		patient.setPatientWeight(TestConstants.WEIGHT);
		patient.setUserEmail(TestConstants.EMAIL);
		patient.setUserFirstname(TestConstants.FIRSTNAME);
		patient.setUserLastname(TestConstants.LASTNAME);
		patient.setUserPhonenumber(TestConstants.PHONE_NUMBER);
		patient.setUserState(TestConstants.STATE);
		patient.setUserStreet(TestConstants.STREET);
		patient.setUserCity(TestConstants.CITY);
		try {
			int result = test.createPatient(patient);
			assertEquals(result,1);
		} catch (BusinessException e) {
			throw new BusinessException(e.toString());
		}
  }
  @Test
  public void testUpdatePatient1() throws PatientNotFound, BusinessException {
  	Patient patient = new Patient();
		patient.setUserUsername(TestConstants.USERNAME);
		patient.setUserPassword(TestConstants.PASSWORD);
		patient.setUserAge(TestConstants.AGE);
		patient.setPatientBloodGroup(TestConstants.BLOODGROUP);
		patient.setPatientHeight(TestConstants.HEIGHT);
		patient.setPatientWeight(TestConstants.WEIGHT);
		patient.setUserEmail(TestConstants.EMAIL);
		patient.setUserFirstname(TestConstants.FIRSTNAME);
		patient.setUserLastname(TestConstants.LASTNAME);
		patient.setUserPhonenumber(TestConstants.PHONE_NUMBER);
		patient.setUserState(TestConstants.STATE);
		patient.setUserStreet(TestConstants.STREET);
		patient.setUserCity(TestConstants.CITY);
		try {
			int result = test.createPatient(patient);
			assertEquals(result,1);
		} catch (BusinessException e) {
			throw new BusinessException(e.toString());
		}
  }
  @Test
  public void testUpdatePatient2() throws PatientNotFound, BusinessException {
  	Patient patient = new Patient();
		patient.setUserUsername(TestConstants.USERNAME);
		patient.setUserPassword(TestConstants.PASSWORD);
		patient.setUserAge(TestConstants.AGE);
		patient.setPatientBloodGroup(TestConstants.BLOODGROUP);
		patient.setPatientHeight(TestConstants.HEIGHT);
		patient.setPatientWeight(TestConstants.WEIGHT);
		patient.setUserEmail(TestConstants.EMAIL);
		patient.setUserFirstname(TestConstants.FIRSTNAME);
		patient.setUserLastname(TestConstants.LASTNAME);
		patient.setUserPhonenumber(TestConstants.PHONE_NUMBER);
		patient.setUserState(TestConstants.STATE);
		patient.setUserStreet(TestConstants.STREET);
		patient.setUserCity(TestConstants.CITY);
		try {
			int result = test.createPatient(patient);
			assertEquals(result,0);
		} catch (BusinessException e) {
			throw new BusinessException(e.toString());
		}
  }
  @Test
  public void testDeletePatient1() {
  	 Response result = controlTest.deletePatient(TestConstants.TEST_CASE_1);
  	 assertEquals(result.getStatus(),TestConstants.STATUS_OK);
  }
  @Test
  public void testDeletePatient2() {
 	 Response result = controlTest.deletePatient(TestConstants.TEST_CASE_2);
 	 assertEquals(result.getStatus(),TestConstants.STATUS_OK);
  }
}



