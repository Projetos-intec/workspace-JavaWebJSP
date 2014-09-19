package be.intec.frituurfrida.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.intec.frituurfrida.model.Usuarios;
import be.intec.frituurfrida.persistence.UserDao;

@WebServlet(urlPatterns = "/AddUsuario")
public class AddUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/order.jsp";
	// private static final String VIEW2 = "/register.jsp";
	private HttpServletRequest req;
	private HttpServletResponse resp;
	private RequestDispatcher dispatcher;
	private Usuarios user;
private int indexFormLogin;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.req = req;
		this.resp = resp;
		indexFormLogin = 1;
		if (req.getParameter("goTo").equals("login")) {
			System.out.println("BTn login");
			logar();
			
		} else if (req.getParameter("goTo").equals("register")) {
			registrar();
			indexFormLogin = 0;
			System.out.println("btn regstro");
		} else if (req.getParameter("goTo").equals("doRegesiter")) {
			adduser();
			System.out.println("btn Do regstro");
		}

		req.setAttribute("showFormLogin", indexFormLogin);

		// if (req.getParameter("email")!= "" && req.getParameter("senha")!=""){
		//
		//
		//
		// } else{

		// }

	}

	public void logar() throws ServletException, IOException {
		user = new Usuarios();
		user.setEmail(req.getParameter("email"));
		user.setSenha(req.getParameter("senha"));
		System.out.println(user);

		String wellcome = "Welkom: ";// + req.getParameter("email");

		req.setAttribute("welkom", wellcome);
		req.setAttribute("userLoginName", user);
		dispatcher = req.getRequestDispatcher(VIEW);
		dispatcher.forward(req, resp);

		// String nome, endereco, tel, email, password;
		// String registrar;
		//
		// email = req.getParameter("email");
		// password = req.getParameter("senha");
		;

	}

	public void registrar() throws ServletException, IOException {

		req.setAttribute("egFild", "<form action='AddUsuario' method='POST'>"
				+ "Email: <input type='email' name='email' />"
				+ "Senha: <input type='password' name='senha' />"
				+ "Nome: <input type='text' name='nome' />"
				+ "Endere�o: <input type='text' name='endreco' />"
				+ "Tel: <input type='text' name='tel' />"
				+ "<input type='hidden' name='goTo' value='doRegesiter'>"
				+ "<br />  <input type='submit' value='Register User'/>"
				+ "</form>");
		indexFormLogin = 0;
		// req.setAttribute("msg2", "redirect");
		dispatcher = req.getRequestDispatcher(VIEW);
		dispatcher.forward(req, resp);
	}

	public void adduser() throws ServletException, IOException {
		user = new Usuarios();
		user.setEmail(req.getParameter("email"));
		user.setSenha(req.getParameter("senha"));
		user.setNome(req.getParameter("nome"));
		user.setEndereco(req.getParameter("endreco"));
		user.setTel(req.getParameter("tel"));
		System.out.println(user);

		UserDao userDao = new UserDao();
		userDao.add(user);
		indexFormLogin = 0;
		dispatcher = req.getRequestDispatcher(VIEW);
		dispatcher.forward(req, resp);
	}
}
