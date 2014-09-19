package be.intec.frituurfrida.model;

public class Produtos {

	
	
	private int id;
	private String prodNome;
	private String descricao;
	private double preco_S ;
	private double preco_M ;
	private double preco_L ;
	private String tamanho;
	
	public Produtos() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdNome() {
		return prodNome;
	}
	public void setProdNome(String prodNome) {
		this.prodNome = prodNome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco_S() {
		return preco_S;
	}
	public void setPreco_S(double preco_S) {
		this.preco_S = preco_S;
	}
	public double getPreco_M() {
		return preco_M;
	}
	public void setPreco_M(double preco_M) {
		this.preco_M = preco_M;
	}
	public double getPreco_L() {
		return preco_L;
	}
	public void setPreco_L(double preco_L) {
		this.preco_L = preco_L;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Produtos [id=" + id + ", prodNome=" + prodNome + ", descricao="
				+ descricao + ", preco_S=" + preco_S + ", preco_M=" + preco_M
				+ ", preco_L=" + preco_L + ", tamanho=" + tamanho + "]";
	} 
	
	
	
	
}
