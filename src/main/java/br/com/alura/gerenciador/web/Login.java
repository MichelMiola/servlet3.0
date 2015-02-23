package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

//@WebServlet(urlPatterns = "/login")
public class Login implements Tarefa {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp)	{

		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);

		HttpSession session = req.getSession();
		session.setAttribute("usuarioLogado", usuario);
		
		//RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/logado.jsp");
		//dispatcher.forward(req, resp);
		
		return "/WEB-INF/paginas/logado.jsp";
	}

}
