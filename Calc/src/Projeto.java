import java.util.Scanner;
import trapeze.trapeze;
import Circle.circle;
import cilindro.cilindro;
public class Projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		trapeze x;
		x = new trapeze();
		
		circle y;
		y = new circle();
		
		cilindro z;
		z = new cilindro();
	
		
		System.out.println("Esse projeto realiza calculos do Trapézio, Circunferencia e da Elipse \nEscolha: \n	1 para Trapézio \n	2 para circuferencia\n	3 para cilindro");
		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();
		
		
		System.out.println(escolha);
		
		
		if (escolha == 1) {
			
			System.out.println("A figura selecionada é trapézio");
			
			System.out.println("\nInsira o valor da altura do trapézio:");
			
			x.altura = sc.nextInt();
			System.out.println("Insira o valor da base maior do trapézio:");
			x.Base = sc.nextInt();
			System.out.println("Insira o valor da base menor do trapézio:");
			x.base = sc.nextInt();
			System.out.println("\nA área do trapézio é:");
			System.out.println(x.area());
		}
		else if (escolha == 2){
			
			System.out.println("A figura selecionada é circunferencia");
			
			System.out.println("Insira o valor do raio da circunferencia");
			y.raio=sc.nextDouble();
			
			System.out.printf("A area da circunferencia é = %.2f%n",y.area());
			System.out.printf("O perímetro da circunferencia é = %.2f%n", y.perimetro());
			
			
			
			
		}
		else if (escolha == 3) {
			System.out.println("A figura selecionada é uma cilindro");
			
			System.out.println("Insira o valor do raio:");
			z.raio= sc.nextDouble();
			System.out.println("insira o valor da altura:");
			z.h = sc.nextDouble();
			System.out.printf("O Volume do clindro é: %.2f%n", z.volume());
			System.out.printf("A área do clindro é: %.2f%n", z.areaa());
		}
		else if (escolha > 3 || escolha < 1) {
			System.out.println("A figura selecionada não pode ser calculada por esse programa");
		}
		sc.close();
}
}