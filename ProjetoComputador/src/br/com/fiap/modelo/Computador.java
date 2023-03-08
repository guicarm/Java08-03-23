package br.com.fiap.modelo;

    // Import dos dados da classe "Monitor"
import br.com.fiap.modelo.Monitor;

public class Computador {

	private String marcaPc;
	private double precoPc;
	private Monitor monitor;
	
	 // Setter (Entrada de dados)
    public void setMarcaPc(String marcaPc){
          this.marcaPc = marcaPc;
    }
    public void setPrecoPc(double precoPc){
        this.precoPc = precoPc;
    }
	public void setMonitor(Monitor monitor){
	    this.monitor = monitor;
    }
	
	
	// Getter (Saída de dados)
    public String getMarcaPc (){
    	return marcaPc;
    }
    public double getPrecoPc (){
    	return precoPc;
    }
    public Monitor monitor () {
    	return monitor;
    }	
    	
}
