package com.tecsup.lab2.ex2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String C_USER = "TESCUP";
		String C_PASSWORD = "123456";
		HttpSession session = request.getSession();
		
		if(user.equals(C_USER)) {
			if(pass.equals(C_PASSWORD)){
				session.setAttribute("info1", "Correcto");
				request.getRequestDispatcher("/menu.jsp").forward(request, response);
			}else {
				session.setAttribute("info2", "Contraseña incorrecta.");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		}else {
			session.setAttribute("info2", "Usuario incorrecto.");
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
		
		//response.getWriter().append("Served at: "+user+" password:"+pass);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
