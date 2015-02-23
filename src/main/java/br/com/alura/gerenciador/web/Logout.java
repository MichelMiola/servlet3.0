package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements Tarefa{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		
		req.getSession().removeAttribute("usuarioLogado");
		
		/*
		 * 302 - O código 302 significa que o recurso foi encontrado, mas o usuário deve 
		 * 		 encontrá-lo em outro lugar, por isso o navegador segue essa indicação.
		 * 
		 * 200 - Conseguiu achar a pagina.
		 * 
		 * 500 - Erro que aconteceu no servidor.
		 * 
		 */
		//RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/logout.html");
		//dispatcher.forward(req, resp);
		//resp.sendRedirect("logout.html");
		
		return "/WEB-INF/paginas/logout.html";
	}

}
