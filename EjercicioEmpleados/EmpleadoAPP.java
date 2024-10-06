package EjercicioClasesAbstractas;



public class EmpleadoAPP {

	static Empleado[] array=new Empleado[4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	EmpleadoAsalariado Antonio=new EmpleadoAsalariado("6546546Z", "Antonio", "López", 2014, 1125);
	EmpleadoComision Sandra=new EmpleadoComision("7879879S", "Sandra", "Nieto", 2011, 169, 7.10);
	EmpleadoComision Manuel=new EmpleadoComision("4654654D", "Manuel", "Ruíz", 2010, 35, 6.90);
	EmpleadoAsalariado Maria=new EmpleadoAsalariado("77878978F", "María", "Ramos", 2011, 1055);
	
	array[0]=Antonio;
	array[1]=Sandra;
	array[2]=Manuel;
	array[3]=Maria;
		
	mostrarTodos();
	
	sueldoMayor();
	
	}
	public static void mostrarTodos() {
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i].imprimir() + " Salario: " + array[i].getSalario());
		}
	}
	public static void sueldoMayor() {
		double mayor=0;
		int idArray=0;
		for(int i=0; i<4; i++) {
			if (array[i].getSalario()>mayor) {
				mayor=array[i].getSalario();
				idArray=i;
			}
		}System.out.println("La persona con mayor sueldo es " + array[idArray].getNombre() + " " + array[idArray].getApellidos() + " y su salario es de "+ mayor + "€");
	}
}
