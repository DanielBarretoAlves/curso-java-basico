import java.util.Scanner;
public class Exerc01 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[a.length];
		for(int i = 0 ; i < a.length; i++) {
			System.out.println("Informe o valor " + i);
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
	}

}
