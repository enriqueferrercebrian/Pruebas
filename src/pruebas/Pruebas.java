/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Enrique
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String nombre = "Quique";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        // Como sacar la ultima letra de CUALQUIER nombre
        // declaramos una variable int que se llame ultima_letra
        int ultima_letra;
        //Asignamos a la variable de arriba el valor que nos devuelve nombre.length()

        ultima_letra = nombre.length();

        System.out.println("la ultima letra de " + nombre + " es la " + nombre.charAt(ultima_letra - 1));
         */
        Set<Integer> values = new HashSet<>();
        Random rand = new Random();

        while (values.size() <= 6) {
            int n = rand.nextInt(50) + 1;
            values.add(n);
        }
        System.out.println(values);

    }
}
