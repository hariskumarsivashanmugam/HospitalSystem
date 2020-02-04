/*
 *
 */
package global.coda.hms.filters;

import java.io.IOException;
import java.util.Random;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomFilter.
 */
@Component
public class CustomFilter extends OncePerRequestFilter {

	/**
	 * Do filter internal.
	 *
	 * @param request the request
	 * @param response the response
	 * @param filterChain the filter chain
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request,
	    HttpServletResponse response, FilterChain filterChain)
	    throws ServletException,
	    IOException {
		response.addHeader("key", Integer.toString(new Random().nextInt(1000)));
		request.setAttribute("key", Integer.toString(new Random().nextInt(1000)));
		filterChain.doFilter(request, response);
	}

}
