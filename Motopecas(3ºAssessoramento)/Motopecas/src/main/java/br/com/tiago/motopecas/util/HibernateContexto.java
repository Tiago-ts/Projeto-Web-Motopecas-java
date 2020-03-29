package br.com.tiago.motopecas.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateContexto implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent event) {
		HibernateUtil.getFabricaDeSessoes().close();
	}

	public void contextInitialized(ServletContextEvent event) {
		HibernateUtil.getFabricaDeSessoes();
	}

}
