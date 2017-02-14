package entidades;

import java.sql.Date;

public class tbl_cliente {

	private int idCliente;
	private char nombre;
	private char apellido;
	private char cedula;
	private char telefono;
	private char sexo;
	private int estado;
	private char celular;
	private char edad;
	private char usuario_creacion;
	private char usuario_modificacion;
	private char usuario_eliminacion;
	private Date fecha_creacion;
	private Date fecha_modificacion;
	private Date fecha_eliminacion;
	private char activo;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public char getNombre() {
		return nombre;
	}
	public void setNombre(char nombre) {
		this.nombre = nombre;
	}
	public char getApellido() {
		return apellido;
	}
	public void setApellido(char apellido) {
		this.apellido = apellido;
	}
	public char getCedula() {
		return cedula;
	}
	public void setCedula(char cedula) {
		this.cedula = cedula;
	}
	public char getTelefono() {
		return telefono;
	}
	public void setTelefono(char telefono) {
		this.telefono = telefono;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public char getCelular() {
		return celular;
	}
	public void setCelular(char celular) {
		this.celular = celular;
	}
	public char getEdad() {
		return edad;
	}
	public void setEdad(char edad) {
		this.edad = edad;
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
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	}
}
