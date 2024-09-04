package com.devsuperior.event.entities;

import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") 
	private Instant start;
    
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") 
	private Instant finish;
	
	@ManyToOne
	@JoinColumn(name = "atividade_id")
	private Activity atividade;

	public Block(Long id, Instant start, Instant finish, Activity atividade) {
		super();
		this.id = id;
		this.start = start;
		this.finish = finish;
		this.atividade = atividade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getStart() {
		return start;
	}

	public void setStart(Instant start) {
		this.start = start;
	}

	public Instant getFinish() {
		return finish;
	}

	public void setFinish(Instant finish) {
		this.finish = finish;
	}

	public Activity getAtividade() {
		return atividade;
	}

	public void setAtividade(Activity atividade) {
		this.atividade = atividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(atividade, finish, id, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Block other = (Block) obj;
		return Objects.equals(atividade, other.atividade) && Objects.equals(finish, other.finish)
				&& Objects.equals(id, other.id) && Objects.equals(start, other.start);
	}
	
	
}
