package com.cyblib.userserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LibUser
 */
@WebServlet("/LibUser")
public class LibUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		
		
		pw.write("<html>");
		pw.write("<head>");
		pw.write("</head>");
		pw.write("<body bgcolor='lightyellow'  background='/CYBAGENET/WebContent/images/bglib.jpg'>");
		pw.write("<div>");

		pw.write(
				"<div style='width:400px; height: 350px; margin: 0 auto; padding-top:30px;#background-color:#F6F3C5;background-image: url(/CYBAGENET/WebContent/images/bglib.jpg);'>");

		pw.write("<form action='' method='post'>" + "<button onclick='fun()'>Click tgdtgme</button>"
				+ "&nbsp;&nbsp;&nbsp;" + "<input type='submit' name='button2' value='RemoveBook' />"
				+ "&nbsp;&nbsp;&nbsp;" + "<input type='submit' name='button3' value='ViewDeatil' />" + "</form>");
		pw.write("</div>");
		
		pw.write("<div id='form1' style='width:200px; height: 200px;>");
		pw.write("</div>");
		
		pw.write("</div>");
		pw.write("</body>");
	
		pw.write("</html>");
	
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
