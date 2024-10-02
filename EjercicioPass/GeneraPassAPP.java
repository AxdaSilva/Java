package EjercicioContraseñas;

public class GeneraPassAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneraPass pack1=new GeneraPass(12, 1);
		pack1.generaPass();
		pack1.imprimePass();
		pack1.devuelveLongitud();
		pack1.comprobarSegura();
		
	}

}
