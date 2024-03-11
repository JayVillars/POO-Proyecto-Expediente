package Principal;

import java.util.LinkedList;


public class Expediente {
	
	private Denunciado denunciado;
	private Ofendido ofendido;
	private Testigo testigo;
	private LinkedList<String> delitos = new LinkedList<>();
	private String descripcion;
	private String fecha;
	
	
	public Expediente() {
		super();
	}
	
	
	
	public Expediente(Denunciado denunciado, Ofendido ofendido, Testigo testigo, LinkedList<String> delitos,
			String descripcion, String fecha) {
		super();
		this.denunciado = denunciado;
		this.ofendido = ofendido;
		this.testigo = testigo;
		this.delitos = delitos;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}



	public Denunciado getDenunciado() {
		return denunciado;
	}
	public void setDenunciado(Denunciado denunciado) {
		this.denunciado = denunciado;
	}
	public Ofendido getOfendido() {
		return ofendido;
	}
	public void setOfendido(Ofendido ofendido) {
		this.ofendido = ofendido;
	}
	public Testigo getTestigo() {
		return testigo;
	}
	public void setTestigo(Testigo testigo) {
		this.testigo = testigo;
	}
	public LinkedList<String> getDelitos() {
		return delitos;
	}
	public void setDelitos(LinkedList<String> delitos) {
		this.delitos = delitos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return String.format("%s",
				super.toString()
				);
	}
}
	
	
	
	