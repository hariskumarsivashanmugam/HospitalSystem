/*
 *
 */
package global.coda.hms.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import global.coda.hms.constants.QueryConstants;
import global.coda.hms.models.Doctor;
// TODO: Auto-generated Javadoc

/**
 * The Interface DoctorMapper.
 */
@Mapper
public interface DoctorMapper {

	/**
	 * Read doctor.
	 *
	 * @param doctorId the doctor id
	 * @return the doctor
	 */
	@Select(QueryConstants.DOCTOR_READ)
	Doctor readDoctor(int doctorId);

	/**
	 * Creates the doctor.
	 *
	 * @param doctor the doctor
	 * @return the doctor
	 */
	@Insert(QueryConstants.DOCTOR_INSERT)
	@Options(useGeneratedKeys = true, keyProperty = "pkDoctorId",
	    keyColumn = "pk_doctor_id")
	Doctor createDoctor(Doctor doctor);

	/**
	 * Update doctor.
	 *
	 * @param doctor the doctor
	 * @return the doctor
	 */
	@Update(QueryConstants.DOCTOR_UPDATE)
	Doctor updateDoctor(Doctor doctor);

	/**
	 * Delete doctor.
	 *
	 * @param doctorId the doctor id
	 * @return the doctor
	 */
	@Delete(QueryConstants.DOCTOR_DELETE)
	Doctor deleteDoctor(int doctorId);

	/**
	 * Find my patient.
	 *
	 * @param doctorId the doctor id
	 * @return the list
	 */
	@Select("<script> select user_firstname from t_user_details tud join"
	    + "t_patient_details tpd on tud.pk_user_id = tpd.fk_userid n"
	    + "join doctor_patient_mapping_details dpmd on "
	    + "tpd.pk_patient_id = dpmd.fk_patient_id"
	    + "<if test='doctorId!=0'>where dpmd.fk_doctor_id = #{doctorId}</if>"
	    + " </script>")
	List<String> findMyPatient(int doctorId);

	/**
	 * Gets the all patient under all doctors.
	 *
	 * @return the all patient under all doctors
	 */
	@Select(QueryConstants.DOCTOR_PATIENT_ONE_TO_MANY)
	@Results(value = {
	    @Result(property = "pkUserId", column = "pk_user_id"),
	    @Result(property = "userUsername", column = "user_username"),
	    @Result(property = "userEmail", column = "user_email"),
	    @Result(property = "userPassword", column = "user_password"),
	    @Result(property = "fkRoleId", column = "fk_role_id"),
	    @Result(property = "patientList", javaType = List.class,
	        column = "pk_user_id",
	        many = @Many(select = "findMyPatient"))
	})
	List<Doctor> getAllPatientUnderAllDoctors();
}
