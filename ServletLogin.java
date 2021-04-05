package projeto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Usuario UsuarioAdministrador = new Usuario("Administrador", "12345", "admin@admin.com");
	Usuario UsuarioFelipe = new Usuario("Felipe", "felipe", "felipe@admin.com");
	Usuario UsuarioThomas = new Usuario("Thomas", "thomas", "thomas@admin.com");

	public ServletLogin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter Mensagem = response.getWriter();
		
		RequestDispatcher Esqueceu = request.getRequestDispatcher("login.jsp");
		Esqueceu.forward(request, response);

		Mensagem.println("<script type=\"text/javascript\">");
		Mensagem.println("alert('Enviou pelo Get!')");
		Mensagem.println("</script>");

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter Mensagem = response.getWriter();
		
		String email = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		String a = UsuarioAdministrador.getEmail();
		String aNome = UsuarioAdministrador.getNome();
		String aSenha = UsuarioAdministrador.getSenha();

		String b = UsuarioFelipe.getEmail();
		String bSenha = UsuarioFelipe.getSenha();

		String c = UsuarioThomas.getEmail();
		String cSenha = UsuarioThomas.getSenha();

		
		
		
		
		if (email.equals(a) && senha.equals(aSenha) || email.equals(b) && senha.equals(bSenha)
				|| email.equals(c) && senha.equals(cSenha)) {
			response.sendRedirect("Logado.jsp");
			
		} else {
			

			Mensagem.println("<script type=\"text/javascript\">");
			Mensagem.println("alert('Login ou senha inválidos! Tente novamente!')");
			Mensagem.println("</script>");

		}

	}

}
