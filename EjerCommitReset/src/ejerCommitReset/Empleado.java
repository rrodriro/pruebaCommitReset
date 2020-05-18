package ejerCommitReset;

public class Empleado {

	private int numEmple;
	private String nombre;
	
	
	public Empleado(int numEmple, String nombre) {
		super();
		this.numEmple = numEmple;
		this.nombre = nombre;
	}


	public int getNumEmple() {
		return numEmple;
	}


	public void setNumEmple(int numEmple) {
		this.numEmple = numEmple;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Empleado [numEmple=" + numEmple + ", nombre=" + nombre + "]";
	}
	
	
	
}
