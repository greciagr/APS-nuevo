package entidades;

import java.sql.Date;

public class tbl_contrato {

	
	private int idContrato;
	private char direccion;
	private int estado;
	private int idCliente;
	private int idEmpresa;
	private int idBarrio;
	private int idCtegoriaCliente;
	private int numContrato;
	private int idMedidor;
	private Date fechaCorte;
	private Date fecha_creacion;
	private Date fecha_modificacion;
	private Date fecha_anulacion;
	private char usuario_creacion;
	private char usuario_modificacion;
	private char usuario_anulacion;
	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public char getDireccion() {
		return direccion;
	}
	public void setDireccion(char direccion) {
		this.direccion = direccion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public int getIdBarrio() {
		return idBarrio;
	}
	public void setIdBarrio(int idBarrio) {
		this.idBarrio = idBarrio;
	}
	public int getIdCtegoriaCliente() {
		return idCtegoriaCliente;
	}
	public void setIdCtegoriaCliente(int idCtegoriaCliente) {
		this.idCtegoriaCliente = idCtegoriaCliente;
	}
	public int getNumContrato() {
		return numContrato;
	}
	public void setNumContrato(int numContrato) {
		this.numContrato = numContrato;
	}
	public int getIdMedidor() {
		return idMedidor;
	}
	public void setIdMedidor(int idMedidor) {
		this.idMedidor = idMedidor;
	}
	public Date getFechaCorte() {
		return fechaCorte;
	}
	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
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
	public char getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(char usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
	public char getUsuario_anulacion() {
		return usuario_anulacion;
	}
	public void setUsuario_anulacion(char usuario_anulacion) {
		this.usuario_anulacion = usuario_anulacion;
	}
	
	
}
