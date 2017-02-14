package entidades;

public class tbl_categoriacliente {
	
	private int idCategoriaCliente;
	private char nombre;
	private float tarifaFija;
	private char descripcion;
	private int idUnidadesDeMedida;
	private int rango;
	
	
	public int getIdCategoriaCliente() {
		return idCategoriaCliente;
	}
	public void setIdCategoriaCliente(int idCategoriaCliente) {
		this.idCategoriaCliente = idCategoriaCliente;
	}
	public char getNombre() {
		return nombre;
	}
	public void setNombre(char nombre) {
		this.nombre = nombre;
	}
	public float getTarifaFija() {
		return tarifaFija;
	}
	public void setTarifaFija(float tarifaFija) {
		this.tarifaFija = tarifaFija;
	}
	public char getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(char descripcion) {
		this.descripcion = descripcion;
	}
	public int getIdUnidadesDeMedida() {
		return idUnidadesDeMedida;
	}
	public void setIdUnidadesDeMedida(int idUnidadesDeMedida) {
		this.idUnidadesDeMedida = idUnidadesDeMedida;
	}
	public int getRango() {
		return rango;
	}
	public void setRango(int rango) {
		this.rango = rango;
	}
	
	

}
