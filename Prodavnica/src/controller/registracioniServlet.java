package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.hibernateMetode;

/**
 * Servlet implementation class registracioniServlet
 */
@WebServlet(description = "ovo je servlrvlet za registraciju", urlPatterns = { "/registracioniServlet" })
public class registracioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public registracioniServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		
		hibernateMetode hm = new hibernateMetode();
		if (hm.ubaciUseraUBazu(userName, password)){
			//sve ok
			response.sendRedirect("index.html");
		}else{
			//nije ubacio
			response.sendRedirect("registracija.html");
		}
	}

}
