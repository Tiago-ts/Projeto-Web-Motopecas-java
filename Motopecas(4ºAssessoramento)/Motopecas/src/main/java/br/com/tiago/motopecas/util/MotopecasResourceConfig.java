package br.com.tiago.motopecas.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MotopecasResourceConfig extends ResourceConfig {
	public MotopecasResourceConfig() {
		packages("br.com.tiago.motopecas.service");
	}

}
