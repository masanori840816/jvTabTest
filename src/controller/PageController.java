package controller;


import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Checker;

@WebServlet("/page")
public class PageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Enumeration<String> _enmParamName;
	String _strPagePath = "";
	RequestDispatcher _rdsDispatcher;

	String _strParamName = "";
	static final String PARAM_TAB = "tab";
	static final String PAGE_MAIN = "mainpage.html";
	static final String PAGE_MAIN2 = "mainpage2.html";
	
	Checker _chkChecker = new Checker();
	
  public PageController() {
      super();
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	// エンコーディングの指定.
	  request.setCharacterEncoding("UTF-8");

	  // JavaScriptからパラメータを取得.
	  _enmParamName = request.getParameterNames();

	  while (_enmParamName.hasMoreElements()){
			_strParamName = _enmParamName.nextElement();
			if (_strParamName.equals(PARAM_TAB))
			{
				if(_chkChecker.checkPageNum(request.getParameter(_strParamName))){
					switch(Integer.parseInt(request.getParameter(_strParamName)))
					{
					case 1:
						_strPagePath = PAGE_MAIN2;
						break;
					default:
						// 1以外はすべて0のページを表示しておく.
						_strPagePath = PAGE_MAIN;
						break;
					}
				}
				else{
					// 数字以外が含まれていた場合も0のページを表示.
					_strPagePath = PAGE_MAIN;
				}
				_rdsDispatcher = request.getRequestDispatcher(_strPagePath);
				// ページ遷移
				_rdsDispatcher.forward(request, response);
			}
	  }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
