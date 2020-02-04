///*
// *
// */
//package global.coda.hms.jwt;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//
//// TODO: Auto-generated Javadoc
///**
// * The Class DecodeJwt.
// */
//public class DecodeJwt {
//
//	/**
//	 * Parses the JWT.
//	 *
//	 * @param jwt the jwt
//	 */
//	private void parseJWT(String jwt) {
//
//		// This line will throw an exception if it is not a signed JWS (as expected)
//		Claims claims = Jwts.parser()
//		    .setSigningKey("MySecret")
//		    .parseClaimsJws(jwt).getBody();
//		System.out.println("ID: " + claims.getId());
//		System.out.println("Subject: " + claims.getSubject());
//		System.out.println("Issuer: " + claims.getIssuer());
//		System.out.println("Expiration: " + claims.getExpiration());
//	}
//
//}
