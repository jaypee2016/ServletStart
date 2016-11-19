import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;

public class CurrentDateAndTimeServlet extends HttpServlet {
	
	public void doGet(final HttpServletRequest requests, 
		final HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		Date curDateTime = new Date();
		out.println(
			"<html><body><h1>Current Servlet Date and Time:</h1> <br> "
			+ curDateTime +
			"</body></html>");
		
	}
	
	
}