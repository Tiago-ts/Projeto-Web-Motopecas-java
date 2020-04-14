package br.com.tiago.motopecas.dao;
import br.com.tiago.motopecas.domain.Cidade;
import br.com.tiago.motopecas.domain.Estado;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

	public class CidadeDAOTest {
		
		@Test
		@Ignore
		public void salvar(){
			EstadoDAO estadoDAO = new EstadoDAO();
			
			Estado estado = estadoDAO.buscar(4L);
			
			Cidade cidade = new Cidade();
			cidade.setNome("vit�ria de santo ant�o");
			cidade.setEstado(estado);
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.salvar(cidade);
			
			System.out.println(cidade.getNome() + " - " +  estado.getNome());
			
		}
		
		@Test
		@Ignore
		public void listar() {
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			List<Cidade> resultado = cidadeDAO.listar();

			for (Cidade cidade : resultado) {
				System.out.println("Codigo da Cidade: " + cidade.getCodigo());
				System.out.println("Nome da Cidade: " + cidade.getNome());
				System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
				System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
				System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
				System.out.println();
			}
		}
		
		@Test
		@Ignore
		public void buscar(){
			
			Long codigo = 7L;
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			Cidade cidade = cidadeDAO.buscar(codigo);
			
			System.out.println("Codigoo da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Codigoo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		}
		
		@Test
		@Ignore
		public void excluir(){
			
			Long codigo = 4L;
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			Cidade cidade = cidadeDAO.buscar(codigo);
			
			cidadeDAO.excluir(cidade);
			
			System.out.println("Cidade Removida");
			System.out.println("Codigo da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		}
		
		@Test
		@Ignore
		public void editar(){
			
			Long codigoCidade = 6L;
			Long codigoEstado = 11L;
			
			EstadoDAO estadoDAO = new EstadoDAO();
			Estado estado = estadoDAO.buscar(codigoEstado);
			
			System.out.println("Codigo do Estado: " + estado.getCodigo());
			System.out.println("Sigla do Estado: " + estado.getSigla());
			System.out.println("Nome do Estado: " + estado.getNome());
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			Cidade cidade = cidadeDAO.buscar(codigoCidade);
			
			System.out.println("Cidade A Ser Editada");
			System.out.println("Codigo da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			
			cidade.setNome("Guarapuava");
			cidade.setEstado(estado);
			
			cidadeDAO.editar(cidade);
			
			System.out.println("Cidade Editada");
			System.out.println("Codigo da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		}
		@Test
		public void buscarPorEstado() {
			Long estadoCodigo = 4L;
			
			CidadeDAO cidadeDAO = new CidadeDAO();
			List<Cidade> resultado = cidadeDAO.buscarPorEstado(estadoCodigo);

			for (Cidade cidade : resultado) {
				System.out.println("Código da Cidade: " + cidade.getCodigo());
				System.out.println("Nome da Cidade: " + cidade.getNome());
				System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
				System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
				System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
				System.out.println();
			}
		}
	}