package br.com.tiago.motopecas.dao;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

import br.com.tiago.motopecas.domain.Fabricante;
import br.com.tiago.motopecas.domain.Produto;

public class ProdutoDAOTest {
	
	@Test
	@Ignore
	public void salvar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("3"));
		
		Produto produto = new Produto();
		produto.setDescricao("bengala cb300");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("130.00"));
		produto.setQuantidade(new Short("2"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}

}
