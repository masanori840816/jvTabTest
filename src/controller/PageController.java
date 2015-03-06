package controller;


import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page")
public class PageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Enumeration<String> _enmParamName;
	String _strPagePath = "";
	RequestDispatcher _rdsDispatcher;

	static final String PAGE_MAIN = "mainpage.html";
	static final String PAGE_MAIN2 = "mainpage2.html";
  public PageController() {
      super();
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	// エンコーディングの指定.
	  request.setCharacterEncoding("UTF-8");

	  // JavaScriptからパラメータを取得.
	  _enmParamName = request.getParameterNames();

	  if (_enmParamName.hasMoreElements()){
		  switch(Integer.parseInt(request.getParameter(_enmParamName.nextElement())))
			{
			case 0:
				_strPagePath = PAGE_MAIN;
				break;
			case 1:
				_strPagePath = PAGE_MAIN2;
				break;
			}
			_rdsDispatcher = request.getRequestDispatcher(_strPagePath);
			// ページ遷移
			_rdsDispatcher.forward(request, response);
	  }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
