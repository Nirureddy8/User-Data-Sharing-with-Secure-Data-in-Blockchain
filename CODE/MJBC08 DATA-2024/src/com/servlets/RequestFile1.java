package com.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBConnection;

/**
 * Servlet implementation class RequestFile1
 */
@WebServlet("/RequestFile1")
public class RequestFile1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestFile1() {
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
		String ownername=request.getParameter("ownerid");
		String userid=request.getParameter("userid");
		String fileid=request.getParameter("fileid");
		String status="pending";
		System.out.println(ownername+userid+status+fileid);
		try {
			int i=DBConnection.saveRequest1(ownername,userid,status,fileid);
			if(i==-1){
				System.out.println("connection failed");
			}else{
				response.sendRedirect("ViewData3.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}