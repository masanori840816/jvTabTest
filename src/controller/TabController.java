package controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TabController
 */
@WebServlet("/contents")
public class TabController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Enumeration<String> names = request.getParameterNames();
		String paramName;
		String content = "";
		if (names.hasMoreElements()){
			paramName = names.nextElement();
			content = (String)request.getParameter(paramName);
		}
		String strCntFilePath = this.getServletContext().getRealPath("/contents/" + content + ".html");
		
		File file = new File(strCntFilePath);
		
		char data[] = new char[3000];
		FileReader filereader = new FileReader(file);
		int charscount = filereader.read(data);
		String str = new String(data,0,charscount);		
		filereader.close();
		response.setContentType("text/html");
		response.getWriter().write(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
