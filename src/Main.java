import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Ola mundo!");
		System.out.println("Bom dia");
		
		//imprimindo variavel
		int y = 2;
		System.out.println(y);
		
		//variavel ponto flutuante
		double x = 10.5784;
		System.out.println(x);
		Locale.setDefault(Locale.US);
		//imprindo formatado ja com ajusto do ponto no comando acima
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado " + x + " metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		// testando formatados maiores
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,renda);

	}

}
