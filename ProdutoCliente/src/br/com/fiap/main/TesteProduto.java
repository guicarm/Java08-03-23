package br.com.fiap.main;

import br.fiap.com.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
	     Produto objProduto = new Produto();

          objProduto.setTipo("Celular");	
          objProduto.setMarca("Samsung");
          objProduto.setQuant(1);
          objProduto.setPreco(1000);
          
          
          
          System.out.println("Tipo: " + objProduto.getTipo() +
                            "\n" + "Marca: " + objProduto.getMarca() +
                            "\n" + "Quantidade: " + objProduto.getQuant() +
                            "\n" + "Preço: " + objProduto.getPreco()); 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
