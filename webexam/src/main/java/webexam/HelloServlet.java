package webexam;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/HelloServlet", "/hi" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloServlet() {
       System.out.println("HelloServlet 생성자");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("HelloServlet init");
	}

	public void destroy() {
		System.out.println("HelloServlet destroy");
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("HelloServlet service!!!!");
//	}
//

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet doGet!!!!");
		System.out.println(req.getParameter("name"));
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet doPost!!!!");
		
		System.out.println(req.getParameter("name"));
	}
	
	

}
