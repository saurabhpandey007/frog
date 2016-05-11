package com.cyblib.adminserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cyblib.utilities.BookID;

/**
 * Servlet implementation class LibAdmin
 */
//@WebServlet("/LibAdmin")
public class LibAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw=response.getWriter();
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/javascript/functions.js");
		//dispatcher.include(request, response);

		try {
			BookID.getNewBookId();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<script type='text/javascript' language='javascript'>");
		
		pw.write("function fun(){  alert('fgsdjfgajsfgvsdfuhasgfiushiaua');}");
		//pw.write("alert('fgsdjfgajsfgvsdfuhasgfiushiaua')");
		//pw.write("}");
		
		pw.println("function showAddBookForm() {");
		pw.write("alert('fgsdjfgajsfgva')");
		pw.write("var str="+"<form name='loginForm' method='post' action='loginServlet'>"+
	"Username: <input type='text' name='usesername'/>'+' <br/>"+
	"Password: <input type='password' name='password'/> '+'<br/>"+
	"<input type='submit' value='Login' />"+
	"</form>"+";");
		pw.write("document.getElementById('form1').innerHTML=str;");
		
		
		pw.println("}");
		
		
		pw.write("</script>");
		pw.write("</head>");
		pw.write("<body bgcolor='lightyellow'  background='/CYBAGENET/WebContent/images/bglib.jpg'>");
		pw.write("<div>");
		pw.write("<div style='width: 990px;height: 200px; background-color: lightblue;color: navy; border: 2px solid blue; padding: 5px;' align='center'>");
		
pw.write("<p align='center' font-family:'Comic Sans MS'>");
pw.write("<font size='6'>Welcome To Cybage Library<br/><br/>Please Manage Your Task</font>");	
pw.write("</p>");
		
		pw.write("</div>");
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
		
		
		PrintWriter pw=response.getWriter();
		
		pw.write(
				"<div style='width:400px; height: 350px; margin: 0 auto; padding-top:30px;#background-color:#F6F3C5;background-image: url(/CYBAGENET/WebContent/images/bglib.jpg);'>");

		pw.write("<form action='' method='post'>" + "<button onclick='fun()'>Click me</button>"
				+ "&nbsp;&nbsp;&nbsp;" + "<input type='text' name='' value='RemoveBook' />"
				+ "&nbsp;&nbsp;&nbsp;" + "<input type='submit' name='button3' value='ViewDeatil' />" + "</form>");
		pw.write("</div>");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
