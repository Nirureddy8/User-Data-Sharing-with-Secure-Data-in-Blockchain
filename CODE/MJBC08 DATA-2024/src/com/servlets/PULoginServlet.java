package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PULoginServlet
 */
@WebServlet("/PULoginServlet")
public class PULoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PULoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Get parameters from the login form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform authentication (dummy authentication for demonstration purposes)
        if ("PU".equals(username) && "PU".equals(password)) {
            // Redirect to a success page
            response.sendRedirect("PUHomepage.jsp");
        } else {
            // Redirect back to the login page with an error message
            response.sendRedirect("login.html?error=1");
        }
    }

	}

