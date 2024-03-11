package Principal;

import java.util.LinkedList;


public class Denunciado {
	
	private String nombre;
	private String sexo;
	private int numero_identidad;
	private String direccion;
	private String descripcion;
	
	public Denunciado(String nombre, String sexo, int numero_identidad, String direccion, String descripcion) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.numero_identidad = numero_identidad;
		this.direccion = direccion;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getNumero_identidad() {
		return numero_identidad;
	}
	public void setNumero_identidad(int numero_identidad) {
		this.numero_identidad = numero_identidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return String.format("Denunciado [%s]",
				super.toString()
				);
	}
	
	
	
}
