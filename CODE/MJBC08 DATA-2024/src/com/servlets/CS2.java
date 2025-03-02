package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CS2
 */
@WebServlet("/CS2")
public class CS2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CS2() {
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
	
		PrintWriter out=response.getWriter();

		HttpSession session=request.getSession();
		String uname=request.getParameter("sid");
		String pass=request.getParameter("spwd");
	
			 try {
				/*if(uname.equalsIgnoreCase("server@gmail.com")&&pass.equalsIgnoreCase("server"))
				{
					session.setAttribute("CloudServer1", uname);
					response.sendRedirect("CloudServerHome.jsp");
				}else */
					if(uname.equalsIgnoreCase("server@gmail.com")&&pass.equalsIgnoreCase("server")){
					session.setAttribute("CloudServer2", uname);
					response.sendRedirect("CloudServerHome2.jsp");
				}
				else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('failed to login');");
					out.println("window.location='index.html'</script>");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
	