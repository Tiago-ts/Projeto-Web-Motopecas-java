package br.com.tiago.motopecas.dao;

import br.com.tiago.motopecas.domain.Caixa;
import br.com.tiago.motopecas.util.HibernateUtil;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CaixaDAO extends GenericDAO<Caixa>  {

	public Caixa buscar(Date dataAbertura) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Caixa.class);
			consulta.add(Restrictions.eq("dataAbertura", dataAbertura));
			Caixa resultado = (Caixa) consulta.uniqueResult();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
}