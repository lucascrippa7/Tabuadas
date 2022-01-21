import java.util.Locale;
import java.util.Scanner;

public class Tabuadas {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o numero que deseja ter a tabuada");
		
		a = sc.nextInt();
		
		System.out.println("Digite o valor maximo da tabuada");
		
		b = sc.nextInt();
		
		for(int i=0;i<=b;i++) {
			
			c = a * i;
			System.out.printf("%d \n", c);
			
		}
		
		
		
		
		

	}

}
