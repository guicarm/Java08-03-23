package br.com.fiap.main;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.ClienteBanco;
import br.com.fiap.beans.EnderecoBanco;

public class TesteFiapBank {

	
	// Instanciar Objetos =======================================================================================================
	public static void main(String[] args) {
		
		Banco objBanco = new Banco();
		ClienteBanco objClienteBanco = new ClienteBanco();
		EnderecoBanco objEnderecoBanco = new EnderecoBanco();
	
		
	// Setters	==================================================================================================================
	// Setters Banco

       objBanco.setNome("Fiap Bank");
       objBanco.setAgencia(1106);
       objBanco.setCliente(objClienteBanco);
       objBanco.setEndereco(objEnderecoBanco);
       
    // Setters Cliente
       
       objClienteBanco.setNomeCliente("Verón");
       objClienteBanco.setIdade(18);
       objClienteBanco.setRg("baguiloko");
       objClienteBanco.setNumeroCartao(123456789);
       
    // Setters  Endereco
       
       objEnderecoBanco.setLogradouro("Rua Jacinto Pinto");
       objEnderecoBanco.setNumero(157);
       objEnderecoBanco.setBairro("Casa do Caralho");
       objEnderecoBanco.setMunicipio("Juquitiba");
       

    // Getters	==================================================================================================================

       System.out.println("Nome: " + objBanco.getNome() +
    		   "\nAgencia: " + objBanco.getAgencia() +
    		   "\nNome do Cliente: " + objBanco.getClienteBanco() .getNomeCliente() + 
    		   "\nIdade: " + objBanco.getClienteBanco() .getIdade()+
    		   "\nRG: " + objBanco.getClienteBanco().getRg()+
    		   "\nNúmero do Cartão: " + objBanco.getClienteBanco(). getNumeroCartao() +
    		   "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
    		   "\nLogradouro: " + objBanco.getEnderecoBanco().getLogradouro() +
               "\nNúmero: " + objBanco.getEnderecoBanco().getNumero()+
               "\nBairro: " + objBanco.getEnderecoBanco().getBairro()+
               "\nMunicípio: " + objBanco.getEnderecoBanco().getMunicipio());
	}
}
