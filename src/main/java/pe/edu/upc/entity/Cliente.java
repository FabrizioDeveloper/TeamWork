package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name="emailCliente", nullable=false, length=45)
	private String correoCliente;
	
	@Column(name="namesCliente", nullable=false, length=40)
	private String nombresCliente;
	
	@Column(name="passwordCliente", nullable=false, length=40)
	private String contrase�aCliente;
	
	private Date fechaCliente;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCliente, String correoCliente, String nombresCliente, String contrase�aCliente,
			Date fechaCliente) {
		super();
		this.idCliente = idCliente;
		this.correoCliente = correoCliente;
		this.nombresCliente = nombresCliente;
		this.contrase�aCliente = contrase�aCliente;
		this.fechaCliente = fechaCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getNombresCliente() {
		return nombresCliente;
	}

	public void setNombresCliente(String nombresCliente) {
		this.nombresCliente = nombresCliente;
	}

	public String getContrase�aCliente() {
		return contrase�aCliente;
	}

	public void setContrase�aCliente(String contrase�aCliente) {
		this.contrase�aCliente = contrase�aCliente;
	}

	public Date getFechaCliente() {
		return fechaCliente;
	}

	public void setFechaCliente(Date fechaCliente) {
		this.fechaCliente = fechaCliente;
	}
	
}
