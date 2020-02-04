///*
// *
// */
//package global.coda.hms;
//
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.util.Date;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import global.coda.hms.services.PatientServices;
//
//// TODO: Auto-generated Javadoc
///**
// * The Class ElkExampleSpringBootApplication.
// */
//@SpringBootApplication
//public class ElkExampleSpringBootApplication {
//
//	/**
//	 * The main method.
//	 *
//	 * @param args the arguments
//	 */
//	public static void main(String[] args) {
//		SpringApplication.run(ElkExampleSpringBootApplication.class, args);
//	}
//}
//
//@RestController
//class ELKController {
//	private final Logger logger = LogManager.getLogger(PatientServices.class
//	    .getName());
//
//	@Autowired
//	RestTemplate restTemplete;
//
//	@Bean
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//
//	@RequestMapping(value = "/elkdemo")
//	public String helloWorld() {
//		String response = "Hello user ! " + new Date();
//		logger.info("/elkdemo - &gt; " + response);
//
//		return response;
//	}
//
//	@RequestMapping(value = "/elk")
//	public Object helloWorld1() {
//
//		Object response = restTemplete.exchange("http://localhost:8080/elkdemo",
//		    HttpMethod.GET, null, new ParameterizedTypeReference() {
//		    }).getBody();
//		logger.info("/elk - &gt; " + response);
//
//		try {
//			Object exceptionrsp = restTemplete.exchange(
//			    "http://localhost:8080/exception", HttpMethod.GET, null,
//			    new ParameterizedTypeReference() {
//			    }).getBody();
//			logger.info("/elk trying to print exception - &gt; " + exceptionrsp);
//			response = response + " === " + exceptionrsp;
//		} catch (Exception e) {
//			// exception should not reach here. Really bad practice :)
//		}
//
//		return response;
//	}
//
//	@RequestMapping(value = "/exception")
//	public String exception() {
//		String rsp = "";
//		try {
//			int i = 1 / 0;
//			// should get exception
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error(e);
//
//			StringWriter sw = new StringWriter();
//			PrintWriter pw = new PrintWriter(sw);
//			e.printStackTrace(pw);
//			String sStackTrace = sw.toString(); // stack trace as a string
//			logger.error("Exception As String :: - &gt; " + sStackTrace);
//
//			rsp = sStackTrace;
//		}
//
//		return rsp;
//	}
//}
