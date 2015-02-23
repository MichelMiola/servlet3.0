package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/executa")
public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String tarefa = req.getParameter("tarefa");

		if (tarefa == null) {
			throw new IllegalArgumentException("Você esqueceu de passar a tarefa");
		}

		String nomeDaClsse = "br.com.alura.gerenciador.web." + tarefa;

		try {
			
			Class type = Class.forName(nomeDaClsse);
			Tarefa instancia = (Tarefa) type.newInstance();
			String destino = instancia.execute(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(destino);
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		

	}

}
