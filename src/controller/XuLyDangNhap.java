package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class XuLyDangNhap
 */
@WebServlet("/XuLyDangNhap")
public class XuLyDangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XuLyDangNhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		HttpSession session = request.getSession();
		String username= request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println(username);
		System.out.println(pass);
		
		User u = new UserDao().layThongTinTaiKhoan(username);
		System.out.println(u);
		boolean ok = new UserDao().kiemTraDangNhap(username, pass);
		boolean coLoi = false;
		String err = "";
			if(ok){
				session.setAttribute("user", u);
				response.sendRedirect("DangNhapThanhCong.jsp");
			}else{
				err ="Sai thông tin đăng nhập";
				coLoi=true;
				response.sendRedirect("index.jsp");
			}
			session.setAttribute("err", err);
	
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println(username);
		System.out.println(pass);
		
		User u = new UserDao().layThongTinTaiKhoan(username);
		System.out.println(u);
		boolean ok = new UserDao().kiemTraDangNhap(username, pass);
		boolean coLoi = false;
		String err = "";
			if(ok){
				session.setAttribute("user", u);
				response.sendRedirect("DangNhapThanhCong.jsp");
			}else{
				err ="Sai thông tin đăng nhập";
				coLoi=true;
				response.sendRedirect("index.jsp");
			}
			session.setAttribute("err", err);
	}

}
