/* 19. Determinar si un carácter es un dígito numérico (función esDigito(char c)) */

package EjerciciosLoo;

public class Ejercicio19Loo {
	
	public static boolean esDigito(char c) {

		// return Character.isDigit(c);
		return c >= 48 && c <= 57;

}