package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Cliente;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped

public class ClienteController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteService cService;
	
	@Inject
	private IUsuarioService uService;
	
	private Cliente cliente;
	private Usuario usuario;
	
	List<Cliente> listaClientes;
	List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		usuario = new Usuario();
		
		listaClientes = new ArrayList<Cliente>();
		listaUsuarios = new ArrayList<Usuario>();
		
		this.listCliente();
		this.listUsuario();
	}
	
	public String nuevoCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void insertar() {
		cService.insertar(cliente);
		limpiarCliente();
		this.listCliente();
	}
	
	public void listCliente() {
		listaClientes = cService.listar();
	}
	
	public void listUsuario() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarCliente() {
		this.init();
	}
	
	public void eliminar(Cliente cliente) {
		cService.eliminar(cliente.getIdCliente());
		this.listCliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
}
