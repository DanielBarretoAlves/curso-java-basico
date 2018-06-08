import java.util.Scanner;
public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int escolha;
		
		System.out.println("Bem Vindo a Tabuada!");
		System.out.println("Informe o numero de qual tabuada você deseja usar");
		escolha = scan.nextInt();
		if(escolha ==1) {
			for(int i = 0; i < escolha * 11; i++) {
				System.out.println(i);
			}
		}else if(escolha ==2) {
			for(int i = 0; i < escolha * 11; i = i + 2) {
				System.out.println(i);
			}
		}else if(escolha ==3) {
			for(int i = 0; i < escolha * 11; i = i + 3) {
				System.out.println(i);
			}
		}else if(escolha ==4) {
			for(int i = 0; i < escolha * 11; i = i + 4) {
				System.out.println(i);
			}
		}else if(escolha ==5) {
			for(int i = 0; i < escolha * 11; i = i + 5) {
				System.out.println(i);
			}
		}else if(escolha ==6) {
			for(int i = 0; i < escolha * 11; i = i + 6) {
				System.out.println(i);
			}
		}else if(escolha ==7) {
			for(int i = 0; i < escolha * 11; i = i + 7) {
				System.out.println(i);
			}
		}else if(escolha ==8) {
			for(int i = 0; i < escolha * 11; i = i + 8) {
				System.out.println(i);
			}
		}else if(escolha ==9) {
			for(int i = 0; i < escolha * 11; i = i + 9) {
				System.out.println(i);
			}
		}else if(escolha ==10) {
			for(int i = 0; i < escolha * 11; i = i + 10) {
				System.out.println(i);
			}
		}
		
	}

}
