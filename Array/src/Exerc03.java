import java.util.Scanner;
public class Exerc03 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[] a = new int[15];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o valor : " + i+1);
			a[i] = scan.nextInt();
			b[i] = (a[i] * a[i]);
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println("Vetor A : " + a[i]);
			System.out.println("Vetor B: " + b[i]); 
		}
	}

}
