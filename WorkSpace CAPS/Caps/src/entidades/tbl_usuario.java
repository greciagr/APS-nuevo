package entidades;

public class tbl_usuario {
	
	private int idUsuario;
	private char login;
	private int IdRoles;
	private char pwd;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public char getLogin() {
		return login;
	}
	public void setLogin(char login) {
		this.login = login;
	}
	public int getIdRoles() {
		return IdRoles;
	}
	public void setIdRoles(int idRoles) {
		IdRoles = idRoles;
	}
	public char getPwd() {
		return pwd;
	}
	public void setPwd(char pwd) {
		this.pwd = pwd;
	}

}
