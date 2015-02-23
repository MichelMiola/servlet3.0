package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

//@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresa implements Tarefa{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String nomeEmpresa = req.getParameter("nome");
		Empresa empresa = new Empresa(nomeEmpresa);
		new EmpresaDAO().adiciona(empresa);
		
		req.setAttribute("empresa", empresa);
		
		//RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/paginas/novaEmpresa.jsp");
		//dispatcher.forward(req, resp);
		
		return "WEB-INF/paginas/novaEmpresa.jsp";
		
	}

}
