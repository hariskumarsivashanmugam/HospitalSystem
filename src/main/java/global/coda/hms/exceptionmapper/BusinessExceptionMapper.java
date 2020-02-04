/*
 *
 */
package global.coda.hms.exceptionmapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import global.coda.hms.exceptions.BusinessException;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessExceptionMapper.
 */
@ControllerAdvice
public class BusinessExceptionMapper {

	/**
	 * Exception.
	 *
	 * @param exception the exception
	 * @return the response entity
	 */
	@ExceptionHandler(value = BusinessException.class)
	public ResponseEntity<Object> exception(BusinessException exception) {
		return new ResponseEntity<>("Error Thrown", HttpStatus.NOT_ACCEPTABLE);
	}
}
