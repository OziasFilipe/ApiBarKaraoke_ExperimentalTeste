package model;

import javax.persistence.*;

@Entity(name  = "usuario")
public class ModelDados {
	
	@Id
	public Integer id;
	
	@Column(nullable = false, length = 4)
	public Integer codigoMusica;
	
	@Column(nullable = false, length = 25)
	public String nomeMusica;
	
	@Column(nullable = false, length = 40)
	public String letraMusica;

	@Column(nullable = false, length = 30)
	public String nomeCantor;
	
	public Integer getId() {
		return id;
	}
	
	public void  setId(Integer id) {
		 this.id = id;
	}
	
	public Integer getCodigoMusica() {
		return codigoMusica;
	}
	
	public void setCodigoMusica(Integer codigoMusica) {
		this.codigoMusica = codigoMusica;
	}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	
	public void setNomeMusica(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}
	
	public String getLetraMusica() {
		return letraMusica;
	}
	
	public void setLetraMusica(String letraMusica) {
		this.letraMusica = letraMusica;
	}
	
	public String getNomeCantor() {
		return nomeCantor;
	}
	
	public void setNomeCantor(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}
}
