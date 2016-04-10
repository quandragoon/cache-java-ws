package cache.ws;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by qdnguyen on 4/9/16.
 */
public class RestApi extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        String arg = request.getQueryString();
        PrintWriter pw = response.getWriter();
        pw.write(arg);
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
