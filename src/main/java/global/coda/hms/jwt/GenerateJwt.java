///*
// *
// */
//package global.coda.hms.jwt;
//
//import java.security.Key;
//import java.util.Date;
//
//import javax.crypto.spec.SecretKeySpec;
//import javax.xml.bind.DatatypeConverter;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import global.coda.hms.services.DoctorServices;
//import io.jsonwebtoken.JwtBuilder;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//// TODO: Auto-generated Javadoc
///**
// * The Class GenerateJwt.
// */
//public class GenerateJwt {
//
//	/**
//	 * Creates the JWT.
//	 *
//	 * @param id the id
//	 * @param issuer the issuer
//	 * @param subject the subject
//	 * @param ttlMillis the ttl millis
//	 * @return the string
//	 */
////Sample method to construct a JWT
//	public String createJWT(String id, String issuer, String subject,
//	    long ttlMillis) {
//		final Logger logger = LogManager.getLogger(DoctorServices.class);
//
//		// The JWT signature algorithm we will be using to sign the token
//		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
//
//		long nowMillis = System.currentTimeMillis();
//		Date now = new Date(nowMillis);
//
//		// We will sign our JWT with our ApiKey secret
//		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("SecretKey");
//		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm
//		    .getJcaName());
//
//		// Let's set the JWT Claims
//		JwtBuilder builder = Jwts.builder().setId(id)
//		    .setIssuedAt(now)
//		    .setSubject(subject)
//		    .setIssuer(issuer)
//		    .signWith(signatureAlgorithm, signingKey);
//
//		// if it has been specified, let's add the expiration
//		if (ttlMillis >= 0) {
//			long expMillis = nowMillis + ttlMillis;
//			Date exp = new Date(expMillis);
//			builder.setExpiration(exp);
//		}
//		logger.traceExit(builder);
//		// Builds the JWT and serializes it to a compact, URL-safe string
//		return builder.compact();
//	}
//
//}
