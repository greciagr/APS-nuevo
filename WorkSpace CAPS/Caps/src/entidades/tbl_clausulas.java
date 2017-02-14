package entidades;

import java.sql.Date;

public class tbl_clausulas {
	
	private int idClausulas;
	private char clausulas;
	private int idDocumento;
	private int estado;
	private char activo;
	private int numClausulas;
	private char usuaruio_creacion;
	private char usuario_modificacion;
	private Date fecha_creacion;
	private Date fecha_modificacion;
	public int getIdClausulas() {
		return idClausulas;
	}
	public void setIdClausulas(int idClausulas) {
		this.idClausulas = idClausulas;
	}
	public char getClausulas() {
		return clausulas;
	}
	public void setClausulas(char clausulas) {
		this.clausulas = clausulas;
	}
	public int getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	}
	public int getNumClausulas() {
		return numClausulas;
	}
	public void setNumClausulas(int numClausulas) {
		this.numClausulas = numClausulas;
	}
	public char getUsuaruio_creacion() {
		return usuaruio_creacion;
	}
	public void setUsuaruio_creacion(char usuaruio_creacion) {
		this.usuaruio_creacion = usuaruio_creacion;
	}
	public char getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(char usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
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
	
	
	

}
