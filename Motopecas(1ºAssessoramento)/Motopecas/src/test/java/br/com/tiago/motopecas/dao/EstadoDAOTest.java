package br.com.tiago.motopecas.dao;
import br.com.tiago.motopecas.domain.Estado;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class EstadoDAOTest {
	
	@Test
	@Ignore
	public void salvar() {
		
		Estado estado = new Estado();
		
		//estado.setNome("Pernambuco");
		//estado.setSigla("PE");
		
		estado.setNome("Santa Catarina");
		estado.setSigla("SC");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
		
		System.out.println("Registros inserirdo ");
		System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
	}

		@Test
		@Ignore
		public void listar() {
			EstadoDAO estadoDAO = new EstadoDAO();
			List<Estado> resultado = estadoDAO.listar();

			System.out.println("Total de Registros Encontrados: " + resultado.size());

			for (Estado estado : resultado) {
				System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
			}
		}
		
		
		@Test
		@Ignore
		public void buscar(){
			Long codigo = 3L;
			
			EstadoDAO estadoDAO = new EstadoDAO();
			Estado estado = estadoDAO.buscar(codigo);
			
			if(estado == null){
				System.out.println("Nenhum registro encontrado");
			}else{
				System.out.println("Registro encontrado:");
				System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
			}
		}
		
		@Test
		@Ignore
		public void excluir(){
			
			Long codigo = 3L;
			EstadoDAO estadoDAO = new EstadoDAO();
			Estado estado = estadoDAO.buscar(codigo);
			
			if(estado == null){
				
				System.out.println("Nenhum registro encontrado");
				
			}else{
				
				estadoDAO.excluir(estado);
				System.out.println("Registro removido:");
				System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
			}
		}
		
		@Test
		
		public void editar(){
			
			Long codigo = 10L;
			
			EstadoDAO estadoDAO = new EstadoDAO();
			Estado estado = estadoDAO.buscar(codigo);
			
			if(estado == null){
				
				System.out.println("Nenhum registro encontrado");
				
			}else{
				
				System.out.println("Registro editado - Antes:");
				System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
				
				estado.setNome("Minas Gerais");
				estado.setSigla("MG");
				estadoDAO.editar(estado);
				
				System.out.println("Registro editado - Depois:");
				System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
			}
		}
	}