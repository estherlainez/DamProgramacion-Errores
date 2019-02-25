package Ejemplos;
import java.util.Scanner;
public class DivisionEntreCerosSinManejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzc a un numero entero");
		int num=teclado.nextInt();
		System.out.println("Introduzc a un denominador entero");
		int den=teclado.nextInt();
		int result=cociente(num,den);
		System.out.println("resultado: "+result);

		}

	public static int cociente(int numerador,int denominador) {
		return numerador/denominador;
	}
}
