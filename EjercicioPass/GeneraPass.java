package EjercicioContraseñas;

import java.util.Random;

import javax.swing.JOptionPane;

public class GeneraPass {

	public int longitudPass;
	public int cantidadPass;
	String [] contraseñas;
	
	public GeneraPass(int longitudPass, int cantidadPass) {
		this.longitudPass=longitudPass;
		this.cantidadPass=cantidadPass;
		this.contraseñas= new String [cantidadPass];

	}
	public void pideLongitud() {
		longitudPass=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la longitud que quieras para tus contraseñas"));
	}
	public void pideCantidad() {
		cantidadPass=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de contraseñas que quieres generar"));
	}
	public void generaPass() {
		Random rnd = new Random();
		for (int i = 0; i < contraseñas.length; i++) {
			String pass = "";
			for(int j = 0; j < longitudPass; j++) {
				int aleatorio = rnd.nextInt(126 - 33 + 1) + 33;
				pass += (char)aleatorio;
			}
			contraseñas[i] = pass;
		}		
		
	}
	public void imprimePass() {
		for(int i = 0; i < contraseñas.length; i++) {
			System.out.println(contraseñas[i]);
		}
	}
	public void devuelveLongitud() {
		System.out.println("La longitud de las contraseñas es de " + longitudPass + " caracteres");
		
	}
	public void comprobarSegura() {
		int contadorSeguras=0;
		
		for(int i = 0; i < contraseñas.length; i ++) {
			int mayus=0;
			int minus=0;
			String passActual=contraseñas[i];
			for(int j = 0; j < passActual.length(); j++) {
				int letra = passActual.charAt(j);
				boolean isMayus = Character.isLowerCase(letra);
				boolean isMinus = Character.isUpperCase(letra);
				if(isMayus) {
					mayus++;
				
				}else if (isMinus) {
					minus++;
				}
			}
			if(mayus>2 && minus>1 && longitudPass>5) {
				contadorSeguras++;
			}
		}
		if(contadorSeguras==contraseñas.length) {
			System.out.println("Todas tus contraseñas son seguras");
			
		}else if(contadorSeguras<contraseñas.length && contadorSeguras>0) {
			System.out.println("Alguna de tus contraseñas no son seguras");
		}else System.out.println("Ninguna de tus contraseñas es segura");
	}
	
}
