package EjercicioClasesAbstractas;

public abstract class Empleado {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int anoAlta;
	
	public Empleado(String dni, String nombre, String apellidos, int anoAlta) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.anoAlta=anoAlta;
	
}
	public String imprimir() {
		return "Nombre: " + nombre + " " + apellidos + " DNI: " + dni +" Año: " + anoAlta;
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public abstract double getSalario();
	
}

class EmpleadoAsalariado extends Empleado{
	
	private int salario;
	private int incentivo;

	public EmpleadoAsalariado(String dni, String nombre, String apellidos, int anoAlta, int salario) {
		super(dni, nombre, apellidos, anoAlta);
		
		this.salario=salario;
		if(anoAlta<2) {
			incentivo=0;
		}else if (anoAlta>=2 && anoAlta<=3) {
			incentivo=7;
		}else if (anoAlta>=4 && anoAlta<=8) {
			incentivo=11;
		}else if (anoAlta>=9 && anoAlta<=15) {
			incentivo=17;
		}
	}

	public double getSalario() {	
		return salario+(salario*incentivo/100);
	}	
}
class EmpleadoComision extends Empleado{

	public int clientesCaptados;
	private double comision;
	private int salarioBase;
	private double salarioTotal;
	
	public EmpleadoComision(String dni, String nombre, String apellidos, int anoAlta, int clientesCaptados, double comision) {
		super(dni, nombre, apellidos, anoAlta);
		this.salarioBase=950;
		this.clientesCaptados=clientesCaptados;
		this.comision=comision;		
		this.salarioTotal=salarioBase+(clientesCaptados*comision);
		
	}

	public double getSalario() {
		
		return salarioTotal;
	}
	
}







