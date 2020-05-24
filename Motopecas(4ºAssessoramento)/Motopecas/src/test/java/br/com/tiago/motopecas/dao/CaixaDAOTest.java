package br.com.tiago.motopecas.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.com.tiago.motopecas.domain.Caixa;

public class CaixaDAOTest {

	@Test
	@Ignore
	public void salvar() throws ParseException {
		Caixa caixa = new Caixa();
		caixa.setDataAbertura(new SimpleDateFormat("dd/MM/yyyy").parse("24/05/2020"));
		caixa.setValorAbertura(new BigDecimal("100.00"));
		
		CaixaDAO caixaDAO = new CaixaDAO();
		caixaDAO.salvar(caixa);
	}

	@Test
	@Ignore
	public void buscar() throws ParseException {
		CaixaDAO caixaDAO = new CaixaDAO();
		Caixa caixa = caixaDAO.buscar(new SimpleDateFormat("dd/MM/yyyy").parse("23/05/2020"));
		System.out.println(caixa);
		Assert.assertNull(caixa);
	}
}