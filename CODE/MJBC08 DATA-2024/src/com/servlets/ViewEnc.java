package com.servlets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DBConnection;
import com.dao.Test;

/**
 * Servlet implementation class ViewData2
 */
@WebServlet("/ViewEnc")
public class ViewEnc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEnc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String da = request.getParameter("da");
		HttpSession session = request.getSession(false);
		String email = (String) session.getAttribute("email");
		String sql = "select * from store where fid='"+da+"'";
		Connection con = DBConnection.connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			OutputStream o = response.getOutputStream();
			if(rs.next()){
				//response.setContentType(rs.getString(7));
			//	o.write(rs.getBytes(4));
				//byte[] bytes = rs.getBytes(4).toByteArray();//Convert into Byte array
				String blobString = new String(rs.getBytes(4));
				 
				String enct=Test.encryption(blobString, "abdfsajfklsaadcv");
				System.out.println("ency   "+blobString);
				
				byte[] byteData = enct.getBytes("UTF-8");//Better to specify encoding
			o.write(byteData);
				
			}
			o.flush();
			o.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
