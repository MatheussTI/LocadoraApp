package entidades;

public class Carro {
	
	private int codigo;
	private String modelo;
	private boolean locado;
	private static int numLocados = 0;
	
	public Carro(int codigo, String modelo) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.locado = false;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public static int getNumLocados() {
		return numLocados;
	}
	public boolean isLocado() {
		return locado;
	}
	public boolean locar() {
		if(isLocado()) {
			return false;
		}
		locado = true;
		numLocados++;
		return true;
	}
	public boolean devolver() {
		if(isLocado() == false) {
			return false;
		}
		locado = false;
		numLocados--;
		return true;
	}
	
	
	
	                                                                                     	

}
