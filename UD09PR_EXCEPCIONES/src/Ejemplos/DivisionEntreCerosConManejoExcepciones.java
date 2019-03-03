package Ejemplos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionEntreCerosConManejoExcepciones {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzc a un numero entero");
		
		try {
			int num=teclado.nextInt();
			System.out.println("Introduzca un denominador entero");
			int den=teclado.nextInt();
			int result=cociente(num,den);
			System.out.println("resultado: "+result);
		}catch (InputMismatchException e) {
			System.out.println("has introducido un String en vez de un int. "
					+ "Estoy tratando la excepcion InputMismatchException");
		}
		catch (ArithmeticException e) {
			System.out.println("no se puede dividir por cero ");
		}
		
		teclado.nextLine();
		try {
			int [] array = new int[5];
			System.out.println("Introduzca los valores del array");
			array[0]=teclado.nextInt();
			System.out.println("Introduzca los valores del array");
			array[1]=teclado.nextInt();
			System.out.println("Introduzca los valores del array");
			array[2]=teclado.nextInt();
			System.out.println("Introduzca los valores del array");
			array[3]=teclado.nextInt();
			System.out.println("Introduzca los valores del array");
			array[4]=teclado.nextInt();
			System.out.println("Introduzca los valores del array");
			array[5]=teclado.nextInt();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("no caben mas numeros,te has salido de rango,este campo no entra ");
		}

		}

	public static int cociente(int numerador,int denominador) throws ArithmeticException{
		return numerador/denominador;
	}
}
