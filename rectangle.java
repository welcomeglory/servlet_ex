package edu.sejong.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
@WebServlet("/rectangle")
public class rectangle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rectangle() {
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
		 System.out.println("doPost() ..");
	       
	       double width = Double.valueOf(request.getParameter("width"));
	       double height = Double.valueOf(request.getParameter("height"));
            
	       
	      response.setContentType("text/html; charset=UTF-8");
	      
	      PrintWriter writer = response.getWriter();
	      
	      writer.println("<html>");
	      writer.println("<head>");
	      writer.println("</head>");
	      
	      writer.println("<body>");
	      writer.println("<h1>폭이 " + width+", 높이가"+height+"인 사각형의 넓이는"+width* height+"<h1>");      
	    	      
	      writer.println("</body>");
	      
	      writer.println("</html>");
	      writer.close();
	            
	      System.out.println("포스트 호출됨");
	}

}
