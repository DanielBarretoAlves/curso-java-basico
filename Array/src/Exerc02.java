import java.util.Scanner;
public class Exerc02 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scan = new Scanner(System.in);
		int[] a = new int[8];
		int[] b = new int[a.length];
		
		for(int i =0; i < a.length; i++) {
			System.out.println("Informe o valor da posição " + i+1);
			a[i] = scan.nextInt();
			b[i] = (a[i] * 2);
		}
		for(int i = 0 ; i < a.length; i++) {
			System.out.println("Vetor A : " + a[i]);
			System.out.println("Vetor B : " + b[i]);
		}

	}

}
