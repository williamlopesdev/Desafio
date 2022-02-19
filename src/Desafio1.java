import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		 

		System.out.print("Digite a quantidade de vezes: ");
		int qtdDegraus = entrada.nextInt();

		 

		for (int i = 0; i < qtdDegraus; i++) {
		degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}

		 

		for (String d : degraus ) {
		System.out.println(d);
		}

}
}
