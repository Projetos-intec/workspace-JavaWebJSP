package be.intec.frituurfrida.model;

import java.io.Serializable;

public class Usuarios extends LoginUsuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private int  fkIdUsuario;
	private String nome;
	private String endereco;
	private String tel;
	

	public Usuarios() {


	}

	public Usuarios(int id, String email, String senha) {
		super(id, email, senha);
		// TODO Auto-generated constructor stub

	}



public int getFkIdUsuario() {
		return fkIdUsuario;
	}

	public void setFkIdUsuario(int id) {
		this.fkIdUsuario = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}



	@Override
	public String toString() {
		return super.toString() + "Usuarios [idUsuario=" + fkIdUsuario
				+ ", nome=" + nome + ", endereco=" + endereco + ", tel=" + tel
				+  "]";
	}
}
