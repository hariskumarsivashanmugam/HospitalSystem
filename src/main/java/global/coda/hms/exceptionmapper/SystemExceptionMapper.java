/*
 *
 */
package global.coda.hms.exceptionmapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import global.coda.hms.exceptions.BusinessException;
import global.coda.hms.exceptions.SystemException;

// TODO: Auto-generated Javadoc
/**
 * The Class SystemExceptionMapper.
 */
@ControllerAdvice
public class SystemExceptionMapper {

	/**
	 * Exception.
	 *
	 * @param exception the exception
	 * @return the response entity
	 */
	@ExceptionHandler(value = SystemException.class)
	public ResponseEntity<Object> exception(BusinessException exception) {
		return new ResponseEntity<>("System Down",
		    HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
