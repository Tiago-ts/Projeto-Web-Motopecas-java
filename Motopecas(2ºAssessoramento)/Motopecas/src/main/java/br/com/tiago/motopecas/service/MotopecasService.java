package br.com.tiago.motopecas.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/Motopecas/rest/motopecas
@Path("motopecas")
public class MotopecasService {
	@GET
	public String exibir(){
		return "Curso de Java";
	}
}


