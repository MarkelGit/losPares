package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Usuario;
import modelo.dao.UsuarioModelo;

/**
 * Servlet implementation class GuardarUsuario
 */
@WebServlet("/guardarusuario")
public class GuardarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recibir parametros
		String inputUsername = request.getParameter("inputUsername");
		String inputPassword4 = request.getParameter("inputPassword4");
		String inputEmail = request.getParameter("inputEmail");
		
		//crear usuario
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(inputUsername);
		usuario.setContraseña(inputPassword4);
		usuario.setEmail(inputEmail);
		
		//crear modelo
		UsuarioModelo um = new UsuarioModelo();
		
		//insertar usuario en BBDD
		//um.insert(usuario);
		
		
		request.setAttribute("usuario", usuario);
		//habrir una vista
		request.getRequestDispatcher("verUsuario.jsp").forward(request, response);
	}

}
