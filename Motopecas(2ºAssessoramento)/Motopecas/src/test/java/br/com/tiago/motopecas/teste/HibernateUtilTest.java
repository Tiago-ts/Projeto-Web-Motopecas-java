package br.com.tiago.motopecas.teste;

import org.hibernate.Session;
import org.junit.Test;

import br.com.tiago.motopecas.util.HibernateUtil;

public class HibernateUtilTest {
	
	@Test
	public void conectar() {
		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}