package it.sara;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SitoServlet  extends HttpServlet {

		//inizio pagina
		private static final String PAGE_TOP = ""
		    + "<html>"
		    + "<head>"
		    + "<title> Primo sito con Servlet </title>"
		    + "</head>"
		    + "<body>"
		;

		//fine pagina
		private static final String PAGE_BOTTOM = ""
			+ "<center> <footer> Copyright Sara Esposito </footer> </center>\r\n"
		    + "</body>"
		    + "</html>"
	    ;
		
		private static final long serialVersionUID = 1L;

		@Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) 
	            throws ServletException, IOException {
	        
	        Writer w = resp.getWriter();
	        
	        w.write(PAGE_TOP); //inizio pagina
	        
	        w.write(  "    <center> <table>\r\n"
	        		+ "        <tr>\r\n"
	        		+ "            <caption> <h1> IL MIO PRIMO SITO </h1> </caption>\r\n"
	        		+ "        </tr>\r\n"
	        		+ "        <tr>\r\n"
	        		+ "            <td> <h3> <a style=\"text-decoration: none\" href=#> HOME &nbsp &nbsp &nbsp</a> </h3> </td>\r\n"
	        		+ "            <td> <h3> <a style=\"text-decoration: none\" href=#> CHI SONO &nbsp &nbsp &nbsp</a> </h3> </td>\r\n"
	        		+ "            <td> <h3> <a style=\"text-decoration: none\" href=#> SERVIZI &nbsp &nbsp &nbsp</a> </h3> </td>\r\n"
	        		+ "            <td> <h3> <a style=\"text-decoration: none\" href=#> CONTATTI </a> </h3> </td>\r\n"
	        		+ "        </tr>\r\n"
	        		+ "    </table> </center>\r\n"
	        		+ "   \r\n"
	        		+ "   \r\n"
	        		+ "   <br><br>\r\n"
	        		+ "   <center><img src=\'https://www.webmasterpoint.org/img/news/original/62882_linguaggio-di-programmazione-r.jpg'></center>"
	        		+ "   <br><br><br><br><br><br>\r\n");		
	        
	        w.write(PAGE_BOTTOM); //fine pagina
	        
	        w.flush();
	        w.close();

}
}

