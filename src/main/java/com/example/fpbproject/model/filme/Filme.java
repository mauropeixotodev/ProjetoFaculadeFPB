package com.example.fpbproject.model.filme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.example.fpbproject.model.cinema.Cinema;

@Entity
public class Filme {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "filme_seq")
	@SequenceGenerator(name="filme_seq", sequenceName = "filme_seq", allocationSize=1)
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private String imagem;
	
	@ManyToOne
	@JoinColumn(name = "cinema_id", referencedColumnName = "id", nullable = false)
	private Cinema cinema;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
