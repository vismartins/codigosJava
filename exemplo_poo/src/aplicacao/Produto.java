package aplicacao;

public class Produto {
	public String nome;
	public double preco;
	public double quantidade;
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
}
