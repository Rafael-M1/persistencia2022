package br.edu.ifmt.edu.projeto;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifmt.edu.projeto.modelo.Consulta;
import br.edu.ifmt.edu.projeto.modelo.Medico;
import br.edu.ifmt.edu.projeto.modelo.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Rafael", 25);
		Medico m1 = new Medico(null, "Paulo", 4125);
		Consulta c1 = new Consulta(null, LocalDate.now(), p1, m1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(m1);
		em.persist(c1);
		em.getTransaction().commit();
		System.out.println("Cadastrado com sucesso!");
		
		em.close();
		emf.close();
	}
}
