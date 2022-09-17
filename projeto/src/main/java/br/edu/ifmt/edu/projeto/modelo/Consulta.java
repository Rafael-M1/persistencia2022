package br.edu.ifmt.edu.projeto.modelo;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONSULTA")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate dtConsulta;
	@ManyToOne
	private Pessoa paciente;
	@ManyToOne
	private Medico medico;

	public Consulta(Integer id, LocalDate dtConsulta, Pessoa paciente, Medico medico) {
		this.id = id;
		this.dtConsulta = dtConsulta;
		this.paciente = paciente;
		this.medico = medico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(LocalDate dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public Pessoa getPaciente() {
		return paciente;
	}

	public void setPaciente(Pessoa paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", dtConsulta=" + dtConsulta + ", paciente=" + paciente + ", medico=" + medico
				+ "]";
	}
}
