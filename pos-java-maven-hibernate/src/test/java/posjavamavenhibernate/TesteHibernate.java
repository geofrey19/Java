package posjavamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {

	@Test
	public void TesteHibernateUtil() {
		/*HibernateUtil.getEntityManager();*/
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setIdade(45);
		pessoa.setLogin("teste");
		pessoa.setNome("Alex Fernando 2");
		pessoa.setSenha("123");
		pessoa.setSobrenome("Egídio");
		pessoa.setEmail("alex@gmail.com");
		
		daoGeneric.salvar(pessoa);
		
	}
}
