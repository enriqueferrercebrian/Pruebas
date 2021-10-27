package pruebas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Número de preguntas para responder:");
		String respuestaUsuario = scanner.nextLine();
		int numPreguntas = Integer.parseInt(respuestaUsuario); // Cantidad de preguntas de usuario
		boolean repetir = true; // Repetir el juego
		boolean nRep1 = false, nRep2 = false, nRep3 = false, nRep4 = false, nRep5 = false, nRep6 = false, nRep7 = false, nRep8 = false, nRep9 = false, nRep10 = false; // Numeros repetidos al azar
		int numeroAleatorio; // Número random
		int minPreguntas = 0; // Número mínimo de preguntas
		int maxPreguntas = 10; // Número máximo de preguntas
		int aciertos = 0; // Número de aciertos del usuario
		boolean salir = false; // Falso hasta que el número random deja de repetirse
		int i = 0; // Contador bucle
		
		do {
			
			while(i < numPreguntas){
				numeroAleatorio = (int) Math.floor(Math.random()*(maxPreguntas-minPreguntas+1)+minPreguntas);
				
				// Mostramos pregunta según numero random
				if(numeroAleatorio == 1 && !nRep1) {
					nRep1 = true;
					i++;
					System.out.println("¿Pregunta 1? (Solo V o F aunque no está muy controlado): ");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("v") || respuestaUsuario.equals("V")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				} else if(numeroAleatorio == 2 && !nRep2) {
					nRep2 = true;
					i++;
					System.out.println("¿Pregunta 2? (Solo V o F aunque no está muy controlado): ");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("f") || respuestaUsuario.equals("F")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				}  else if(numeroAleatorio == 4 && !nRep3) {
					nRep3 = true;
					i++;
					System.out.println("¿Pregunta 3? (Solo V o F aunque no está muy controlado): ");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("v") || respuestaUsuario.equals("V")){
						aciertos++;
						System.out.println("Correcto");
					}
				} else if(numeroAleatorio == 5 && !nRep4) {
					nRep4 = true;
					i++;
					System.out.println("¿Pregunta 4? (Solo V o F aunque no está muy controlado): ");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("f") || respuestaUsuario.equals("F")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				} else if(numeroAleatorio == 6 && !nRep5) {
					nRep5 = true;
					i++;
					System.out.println("¿Pregunta 5? (Solo V o F aunque no está muy controlado)::");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("v") || respuestaUsuario.equals("V")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				} else if(numeroAleatorio == 7 && !nRep6) {
					nRep6 = true;
					i++;
					System.out.println("¿Pregunta 6? (Solo V o F aunque no está muy controlado)::");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("f") || respuestaUsuario.equals("F")){
						aciertos++;
						System.out.println("Correcto");
					}
				} else if(numeroAleatorio == 8 && !nRep7) {
					nRep7 = true;
					i++;
					System.out.println("¿Pregunta 7? (Solo V o F aunque no está muy controlado):");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("v") || respuestaUsuario.equals("V")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				} else if(numeroAleatorio == 9 && !nRep8) {
					nRep8 = true;
					i++;
					System.out.println("¿Pregunta 8? (Solo V o F aunque no está muy controlado):");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("f") || respuestaUsuario.equals("F")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				} else if(numeroAleatorio == 10 && !nRep9) {
					nRep9 = true;
					i++;
					System.out.println("¿Pregunta 9? (Solo V o F aunque no está muy controlado)::");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("f") || respuestaUsuario.equals("F")){
						aciertos++;
						System.out.println("Correcto");
					}
				} else if(numeroAleatorio == 3 && !nRep10) {
					nRep10 = true;
					i++;
					System.out.println("¿Pregunta 10? (Solo V o F aunque no está muy controlado):");
					respuestaUsuario = scanner.nextLine();
					if(respuestaUsuario != null && respuestaUsuario.equals("v") || respuestaUsuario.equals("V")){
						aciertos++;
						System.out.println("Correcto");
					} else {
						System.out.println("Falso");
					}
				}
				
			}
			
			System.out.println("¿Quieres volver a jugar? (v o f)");
			respuestaUsuario = scanner.nextLine();
			
			if(respuestaUsuario != null && respuestaUsuario.equals("f") || respuestaUsuario.equals("F")){
				int fallos = aciertos - numPreguntas; // Número de fallos
				repetir = false;
				System.out.println("Has acertado: " + aciertos + " y has fallado: " + fallos);
			}
			else {
				int fallos = aciertos - numPreguntas; // Número de fallos
				System.out.println("Has acertado: " + aciertos + " y has fallado: " + fallos);
				i = 0;
				nRep1 = false;
				nRep2 = false;
				nRep3 = false;
				nRep4 = false;
				nRep5 = false;
				nRep6 = false;
				nRep7 = false;
				nRep8 = false;
				nRep9 = false;
				nRep10 = false;
			}
			
		} while(repetir);

		
	}

}