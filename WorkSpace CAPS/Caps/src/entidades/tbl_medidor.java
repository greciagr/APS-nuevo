package entidades;
import java.sql.Date;


public class tbl_medidor {
	
	private int idMedidor;
	private char serial;
	private int estado;
	private int idUnidadesDeMedida;
	private Date fecha_creacion;
	private Date fecha_modificacion;
	private char usuario_creacion;
	private char usuario_modificacion;
	private char observaciones;
	private char activo;
	public int getIdMedidor() {
		return idMedidor;
	}
	public void setIdMedidor(int idMedidor) {
		this.idMedidor = idMedidor;
	}
	public char getSerial() {
		return serial;
	}
	public void setSerial(char serial) {
		this.serial = serial;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdUnidadesDeMedida() {
		return idUnidadesDeMedida;
	}
	public void setIdUnidadesDeMedida(int idUnidadesDeMedida) {
		this.idUnidadesDeMedida = idUnidadesDeMedida;
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
	public char getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(char observaciones) {
		this.observaciones = observaciones;
	}
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	}
	

}
