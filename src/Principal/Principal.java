package Principal;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*Denunciado denunciado = new Denunciado();
		Ofendido ofendido = new Ofendido();
		Testigo testigo = new Testigo();*/
		
		boolean centinelaPrincipal = true;
		
		Expediente expediente = new Expediente();
		
		Scanner scint = new Scanner(System.in);
		Scanner scstring = new Scanner(System.in);
		
		LinkedList<Expediente> lstExpediente = new LinkedList<>();
		
		while(centinelaPrincipal) {
		
		System.out.println("Bienvenido\nSeleccione la accion a realizar:");
		
		System.out.println("1. Crear nuevo expediente");
		System.out.println("2. Ver expediente");
		System.out.println("3. Eliminar expediente");
		System.out.println("4. Salir");
		
		int i = scint.nextInt();
		
		switch(i){
			
			case 1:
				System.out.println("Ingrese el nombre del denunciado");
				String nombreDenunciado = scstring.nextLine();
				System.out.println("Ingrese el sexo del denunciado");
				String sexoDenunciado = scstring.nextLine();
				System.out.println("Ingrese numero de indentidad del denunciado");
				int numIdentidadDenunciado = scint.nextInt();
				System.out.println("Ingrese la direccion del denunciado");
				String direccionDenunciado = scstring.nextLine();
				System.out.println("Ingrese la descripcion del denunciado");
				String descripcionDenunciado = scstring.nextLine();
				
				Denunciado d1 = new Denunciado(nombreDenunciado, sexoDenunciado, numIdentidadDenunciado, direccionDenunciado, descripcionDenunciado);
				
				expediente.setDenunciado(d1);
				
				
				System.out.println("\nIngrese el nombre del ofendido");
				String nombreOfendido = scstring.nextLine();
				System.out.println("Ingrese el sexo del ofendido");
				String sexoOfendido = scstring.nextLine();
				System.out.println("Ingrese numero de indentidad del ofendido");
				int numIdentidadOfendido = scint.nextInt();
				System.out.println("Ingrese la nacionalidad del ofendido");
				String nacionalidadOfendido = scstring.nextLine();
				System.out.println("Ingrese la direccion del ofendido");
				String direccionOfendido = scstring.nextLine();
				System.out.println("Ingrese el telefono del ofendido");
				int telefonoOfendido = scint.nextInt();
				
				Ofendido o1 = new Ofendido(nombreOfendido, sexoOfendido, numIdentidadOfendido, nacionalidadOfendido, direccionOfendido, telefonoOfendido);
				
				expediente.setOfendido(o1);
				
				System.out.println("¿Hay testigos?");
				System.out.println("1. Si   2. No");
				int testigos = scint.nextInt();
				
				if(testigos == 1) {
					
					System.out.println("\nIngrese el nombre del testigo");
					String nombreTestigo = scstring.nextLine();
					System.out.println("Ingrese el sexo del testigo");
					String sexoTestigo = scstring.nextLine();
					System.out.println("Ingrese numero de indentidad del testigo");
					int numIdentidadTestigo = scint.nextInt();
					System.out.println("Ingrese la nacionalidad del testigo");
					String nacionalidadTestigo = scstring.nextLine();
					System.out.println("Ingrese la direccion del testigo");
					String direccionTestigo = scstring.nextLine();
					System.out.println("Ingrese el telefono del testigo");
					int telefonoTestigo = scint.nextInt();
					
					Testigo t1 = new Testigo(nombreTestigo, sexoTestigo, numIdentidadTestigo, nacionalidadTestigo, direccionTestigo, telefonoTestigo);
					
					expediente.setTestigo(t1);
					
				}
				
				System.out.println("Delitos a denunciar:");
				System.out.println("Seleccione el numero que indica el delito, si hay mas de uno escriba los numeros separados por coma.");
				System.out.println("1. Robo  2. Homicidio  3. Asesinato  4. Amenaza  5. Agresion  6. Fraude");
				String delitos = scstring.nextLine();
				
				LinkedList<String> lstDelitos = new LinkedList<>();
				
				if (delitos.contains(Character.toString(1))) {
		            lstDelitos.add("Robo");
		        }
				
				if (delitos.contains(Character.toString(2))) {
		            lstDelitos.add("Homicidio");
		        }
				
				if (delitos.contains(Character.toString(3))) {
		            lstDelitos.add("Asesinato");
		        }
				
				if (delitos.contains(Character.toString(4))) {
		            lstDelitos.add("Amenaza");
		        }
				
				if (delitos.contains(Character.toString(5))) {
		            lstDelitos.add("Agresion");
		        }
				
				if (delitos.contains(Character.toString(6))) {
		            lstDelitos.add("Fraude");
		        }
				
				expediente.setDelitos(lstDelitos);
				
				lstExpediente.add(expediente);
				
				break;
			
				
			case 2:
				
				System.out.println(expediente.toString());
				
				break;
				
			case 4:
				
				centinelaPrincipal = false;
				
				break;
				
			}
		

		}
	}

}
