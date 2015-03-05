package controller;


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
@WebServlet("/TabController")
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
    	/*// エンコーディングの指定.
    	  request.setCharacterEncoding("UTF-8");

    	  // JavaScriptから「cnt=0」のように渡されるパラメータを取得.
    	  Enumeration names = request.getParameterNames();
    	  String strContent = "";
    	  String strGotResult = "";
    	  if (names.hasMoreElements()){
    	    strContent = (String)request.getParameter(names.nextElement());
    	    // 取得したパラメータから、HTMLファイルのパスを取得する.
    	    String strCntFilePath = this.getServletContext().getRealPath("/contents/" + strContent + ".html");
    	    // 取得したパスからファイルを取得する.
    	    File file = new File(strCntFilePath);

    	    char data[] = new char[3000];
    	    FileReader filereader = new FileReader(file);
    	    // ファイルの内容を読み込む.
    	    int charscount = filereader.read(data);
    	    strGotResult = new String(data,0,charscount);
    	    // ファイルリーダーを閉じる
    	    filereader.close();
    	  }
    	  // 戻り値の内容をHTMLに設定して、読み込んだ内容を返す.
    	  response.setContentType("text/html");
    	  response.getWriter().write(strGotResult);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
