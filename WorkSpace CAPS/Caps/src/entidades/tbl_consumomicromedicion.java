package entidades;

import java.sql.Date;

public class tbl_consumomicromedicion {
	
	private int idMicroMedicion;
	private int mesCorresponde;
	private int consumoActual;
	private int consumoAnterior;
	private int consumoTotal;
	private int idFactura;
	private int idCliente;
	private int idContrato;
	private char usuario_creacion;
	private char usuario_modificacion;
	private char usuario_eliminacion;
	private Date fecha_creacion;
	private Date fecha_modificacion;
	private Date fecha_eliminacion;
	private int estado;
	
	
	public int getIdMicroMedicion() {
		return idMicroMedicion;
	}
	public void setIdMicroMedicion(int idMicroMedicion) {
		this.idMicroMedicion = idMicroMedicion;
	}
	public int getMesCorresponde() {
		return mesCorresponde;
	}
	public void setMesCorresponde(int mesCorresponde) {
		this.mesCorresponde = mesCorresponde;
	}
	public int getConsumoActual() {
		return consumoActual;
	}
	public void setConsumoActual(int consumoActual) {
		this.consumoActual = consumoActual;
	}
	public int getConsumoAnterior() {
		return consumoAnterior;
	}
	public void setConsumoAnterior(int consumoAnterior) {
		this.consumoAnterior = consumoAnterior;
	}
	public int getConsumoTotal() {
		return consumoTotal;
	}
	public void setConsumoTotal(int consumoTotal) {
		this.consumoTotal = consumoTotal;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
