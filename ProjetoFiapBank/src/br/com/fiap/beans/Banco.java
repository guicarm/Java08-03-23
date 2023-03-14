package br.com.fiap.beans;

public class Banco {
	
    // Visibilidade (Públi ou Private) > tipo de dados (String, int e pa) >  e o nome da variável
	
	private String nome;
	private int agencia;
	private ClienteBanco cliente;
	private EnderecoBanco endereco;
	
	// Setters (Entrada)  ========================================================================

	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	public void setCliente (ClienteBanco cliente) {
		this.cliente = cliente;
	}
	public void setEndereco (EnderecoBanco endereco) {
		this.endereco = endereco;
	}
	
	// Getters (Saída)  ========================================================================
	
	public String getNome () {
		return nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public ClienteBanco getClienteBanco () {
		return cliente;
	}
	public EnderecoBanco getEnderecoBanco () {
		return endereco;
	}
}
