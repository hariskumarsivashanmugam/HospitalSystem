/*
 *
 */
package global.coda.hms.constants;

// TODO: Auto-generated Javadoc
/**
 * The Class QueryConstants.
 */
public class QueryConstants {

	/** The Constant PATIENT_READ. */
	public static final String PATIENT_READ = "select user.pk_user_id,"
	    + "user.user_username,user.user_password,user.user_email,"
	    + "user.user_phonenumber,user.user_firstname,user.user_lastname"
	    + ",user.user_age,user.user_street,user.user_city,user.user_state,"
	    + "user.fk_role_id,patient.patient_height,patient.patient_blood_group,"
	    + "patient.patient_created_on,patient.patient_updated_on,"
	    + "patient.fk_userid,patient.patient_weight,user.user_isactive,"
	    + "user.user_created_on,user.user_updated_on,patient.patient_isactive,"
	    + "patient.pk_patient_id from t_user_details"
	    + " as user INNER JOIN t_patient_details as patient"
	    + " on user.pk_user_id = patient.fk_userid "
	    + "where user.user_isactive=1 and patient.patient_isactive=1 "
	    + "and user.fk_role_id=2 and " + "patient.pk_patient_id=#{id}";

	/** The Constant PATIENT_DELETE. */
	public static final String PATIENT_DELETE =
	    "update t_user_details as user,t_patient_details as"
	        + " patient set user.user_isactive=0,patient.patient_isactive=0 where patient.pk_patient_id=#{patientId} "
	        + "and user.pk_user_id=patient.fk_userid and patient.patient_isactive=1 and user.user_isactive=1 and  "
	        + "user.fk_role_id =2";

	/** The Constant PATIENT_UPDATE. */
	public static final String PATIENT_UPDATE = "update t_patient_details set "
	    + " patient_height=#{patientHeight},patient_blood_group=#{patientBloodGroup},patient_weight=#{patientWeight} "
	    + "where pk_patient_id=#{pkPatientId} and patient_isactive=1";

	/** The Constant PATIENT_INSERT. */
	public static final String PATIENT_INSERT =
	    "INSERT INTO  t_patient_details ( patient_height,patient_blood_group,"
	        + "patient_weight,fk_userid) VALUES (#{patientHeight},#{patientBloodGroup},#{patientHeight},#{fkUserid})";

	/** The Constant USER_INSERT. */
	public static final String USER_INSERT =
	    "INSERT INTO `hospital_management_system`."
	        + "`t_user_details` (`user_username`, `user_password`, `user_email`,"
	        + " `user_phonenumber`, `user_firstname`, `user_lastname`,"
	        + " `user_age`, `user_city`,"
	        + " `user_state`, `user_street`, `fk_role_id`) VALUES"
	        + " (#{userUsername},#{userPassword},#{userEmail},#{userPhonenumber},#{userFirstname},#{userLastname},"
	        + " #{userAge},#{userCity},#{userState},#{userStreet},#{fkRoleId})";

	/** The Constant USER_UPDATE. */
	public static final String USER_UPDATE =
	    "update t_user_details set user_username=#{userUsername},"
	        + "user_password=#{userPassword},user_email=#{userEmail},user_phonenumber=#{userPhonenumber},user_firstname=#{userFirstname},"
	        + "user_lastname=#{userLastname},user_age=#{userAge},user_city=#{userCity},user_state=#{userState},user_street=#{userStreet}"
	        + " where pk_user_id=#{pkUserId} and user_isactive=1 ";

	/** The Constant DOCTOR_READ. */
	public static final String DOCTOR_READ =
	    "select user.pk_user_id,user.user_username,"
	        + "user.user_password,user.user_email,user.user_phonenumber,"
	        + "user.user_firstname,user.user_lastname,user.user_age,user.user_street,"
	        + "user.user_city,user.user_state,user.fk_role_id,doctor.doctor_experience,doctor.fk_user_id,"
	        + "doctor.doctor_speciality,user.user_isactive,doctor.doctor_isactive,"
	        + "doctor.pk_doctor_id,user.user_created_on,user.user_updated_on,doctor.doctor_created_on,doctor.doctor_updated_on from"
	        + " t_user_details as user INNER JOIN t_doctor_details as doctor on user.pk_user_id = doctor.fk_user_id"
	        + " where user.user_isactive=1 and doctor.doctor_isactive=1 and user.fk_role_id=3"
	        + " and doctor.pk_doctor_id=#{doctorId}";

	/** The Constant DOCTOR_DELETE. */
	public static final String DOCTOR_DELETE =
	    "update t_user_details as user,t_doctor_details as doctor "
	        + "set user.user_isactive=0,doctor.doctor_isactive=0 where doctor.pk_doctor_id=#{doctorId} and "
	        + "user.pk_user_id=doctor.fk_user_id and user.user_isactive=1 and doctor.doctor_isactive=1"
	        + " and user.fk_role_id =3";

	/** The Constant DOCTOR_UPDATE. */
	public static final String DOCTOR_UPDATE =
	    "update t_doctor_details set doctor_experience=#{doctorExperience},"
	        + "doctor_speciality=#{doctorSpeciality} where pk_doctor_id=#{pkDoctorId}";

	/** The Constant DOCTOR_INSERT. */
	public static final String DOCTOR_INSERT = "INSERT INTO "
	    + "t_doctor_details "
	    + "(doctor_experience,doctor_speciality,fk_user_id)"
	    + " VALUES (#{doctorExperience},#{doctorSpeciality},#{fkUserId})";

	/** The Constant DOCTOR_PATIENT_ONE_TO_MANY. */
	public static final String DOCTOR_PATIENT_ONE_TO_MANY =
	    "select user_firstname from t_user_details tud join "
	        + "t_patient_details tpd on tud.pk_user_id = tpd.fk_userid "
	        + "join doctor_patient_mapping_details dpmd on "
	        + "tpd.pk_patient_id = dpmd.fk_patient_id where "
	        + "dpmd.fk_doctor_id = #{doctorId}";

	/** The Constant PATIENT_READ_ALL. */
	public static final String PATIENT_READ_ALL = "select user.pk_user_id,"
	    + "user.user_username,user.user_password,user.user_email,"
	    + "user.user_phonenumber,user.user_firstname,user.user_lastname"
	    + ",user.user_age,user.user_street,user.user_city,user.user_state,"
	    + "user.fk_role_id,patient.patient_height,patient.patient_blood_group,"
	    + "patient.patient_created_on,patient.patient_updated_on,"
	    + "patient.fk_userid,patient.patient_weight,user.user_isactive,user.user_created_on,"
	    + "user.user_updated_on,patient.patient_isactive,patient.pk_patient_id from t_user_details"
	    + " as user INNER JOIN t_patient_details as patient"
	    + " on user.pk_user_id = patient.fk_userid "
	    + "where user.user_isactive=1 and patient.patient_isactive=1 "
	    + "and user.fk_role_id=2";

}
