package br.edu.ifmt.edu.projeto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MEDICO")
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer crm;
	
	public Medico(Integer id, String nome, Integer crm) {
		this.id = id;
		this.nome = nome;
		this.crm = crm;
	}
	
	//Getters e Setters
	
	@Override
	public String toString() {
		return "Medico [id=" + id + ", nome=" + nome + ", crm=" + crm + "]";
	}
}
