package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class BuscaEmpresa implements Tarefa {
	
	public BuscaEmpresa() {
		System.out.println("Instanciando um Servlet do tipo BuscaEmpresa" + this);
	}
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp)	{

		String filtro = req.getParameter("filtro");
		
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		req.setAttribute("empresas", empresas);
		//RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/buscaEmpresa.jsp");
		//dispatcher.forward(req, resp);
		return "/WEB-INF/paginas/buscaEmpresa.jsp";

	}

}
