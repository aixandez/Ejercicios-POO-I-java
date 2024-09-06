/* 12. Dado un conjunto de valores numéricos que se ingresan por teclado determinar el valor promedio.
El fin de datos se indicará ingresando un valor igual a cero */

import java.util.Scanner;

package EjerciciosLoo;

public class Ejercicio12Loo {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0; // suma los valores ingresados
        int conteo = 0; // cuenta la cantidad de valores que se ingresan
        int valor; // almacena los valores ingresados

        while (true) {
            System.out.print("Ingrese un valor entero (0 para terminar): ");
            valor = sc.nextInt();

            if (valor == 0) {
                break; //si el valor es cero sale del bucle
            }

            suma += valor; // suma los valores ingresados
            conteo++;// incrementa el conteo
        }

        if (conteo > 0) {
            double promedio = (double) suma / conteo; // divide todos los numeros a promediar por la cantidad de numeros que se ingresaron
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron valores.");
        }

        sc.close();
    }

}
