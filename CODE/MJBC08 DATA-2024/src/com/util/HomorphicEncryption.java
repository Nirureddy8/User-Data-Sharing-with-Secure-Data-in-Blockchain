package com.util;

import java.awt.Component;

import java.awt.Container;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JLabel;

/**
 * Servlet implementation class FullyHomorphicEncryption
 * @param <JHelCipher>
 * @param <JHelKeyGenerator>
 */
@WebServlet("/FullyHomorphicEncryption")
public class HomorphicEncryption<JHelCipher, JHelKeyGenerator> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomorphicEncryption() {
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
	 * @param JHel 
	 * @param result 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Container JHel, Object result) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		// Generate homomorphic encryption keys and
		// Perform homomorphic addition
        HomorphicEncryption keyGenerator = new HomorphicEncryption();
        Component publicKey = keyGenerator.generateKey();
        Component secretKey = keyGenerator.generateKey();

        // Get the input values from the form
        int plaintext1 = Integer.parseInt(request.getParameter("input1"));
      

        // Encrypt the input values
      /*  JHelCipher encrypted1 = JHel.encrypt1(publicKey, plaintext1);*/
        Class<? extends Container> encrypted1 = JHel.getClass();
     

        

       
        
        out.println("<p>Encrypted " + plaintext1 + " + " +  " = " +  "</p>");
        out.println("</body></html>");
   /* } catch (private Component generateKey() {*/
		// TODO Auto-generated method stub
		return;
	}
	private Component generateKey() {
		// TODO Auto-generated method stub
		return null;
	}
}