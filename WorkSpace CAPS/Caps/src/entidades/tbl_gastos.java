package entidades;
import java.sql.Date;

public class tbl_gastos {

	private int idGastos;
	private char concepto;
	private char numFactura;
	private char numRecibo;
	private int total;
	private Date fecha_creacion;
	private Date fecha_modificacion;
	private Date fecha_eliminacion;
    private char usuario_creacion;
    private char usuario_modificacion;
    private char usuario_eliminacion;
	public int getIdGastos() {
		return idGastos;
	}
	public void setIdGastos(int idGastos) {
		this.idGastos = idGastos;
	}
	public char getConcepto() {
		return concepto;
	}
	public void setConcepto(char concepto) {
		this.concepto = concepto;
	}
	public char getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(char numFactura) {
		this.numFactura = numFactura;
	}
	public char getNumRecibo() {
		return numRecibo;
	}
	public void setNumRecibo(char numRecibo) {
		this.numRecibo = numRecibo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}
	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	public Date getFecha_eliminacion() {
		return fecha_eliminacion;
	}
	public void setFecha_eliminacion(Date fecha_eliminacion) {
		this.fecha_eliminacion = fecha_eliminacion;
	}
	public char getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(char usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public char getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(char usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
	public char getUsuario_eliminacion() {
		return usuario_eliminacion;
	}
	public void setUsuario_eliminacion(char usuario_eliminacion) {
		this.usuario_eliminacion = usuario_eliminacion;
	}
    
    
}
