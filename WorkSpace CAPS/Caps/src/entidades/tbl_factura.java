package entidades;

import java.sql.Date;

public class tbl_factura {
	
	private int id_Factura;
	private int numFactura;
	private Date fechaFactura;
	private float total;
	private float subTotal;
	private char observacion;
	private char activo;
	private int idEmpresa;
	private int idContrato;
	private Date fecha_creacion;
	
	
	public int getId_Factura() {
		return id_Factura;
	}
	public void setId_Factura(int id_Factura) {
		this.id_Factura = id_Factura;
	}
	public int getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	public char getObservacion() {
		return observacion;
	}
	public void setObservacion(char observacion) {
		this.observacion = observacion;
	}
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public Date getFecha_anulacion() {
		return fecha_anulacion;
	}
	public void setFecha_anulacion(Date fecha_anulacion) {
		this.fecha_anulacion = fecha_anulacion;
	}
	public char getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(char usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public char getUsuario_anulacion() {
		return usuario_anulacion;
	}
	public void setUsuario_anulacion(char usuario_anulacion) {
		this.usuario_anulacion = usuario_anulacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	private Date fecha_anulacion;
	private char usuario_creacion;
	private char usuario_anulacion;
	private int estado;

}

