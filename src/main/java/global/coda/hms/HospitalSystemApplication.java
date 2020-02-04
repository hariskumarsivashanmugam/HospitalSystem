/*
 *
 */
package global.coda.hms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO: Auto-generated Javadoc
/**
 * The Class HospitalSystemApplication.
 */
@SpringBootApplication
@MapperScan("global.coda.hms.mappers")
public class HospitalSystemApplication {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(HospitalSystemApplication.class, args);
	}
}
