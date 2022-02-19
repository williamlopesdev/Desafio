import javax.swing.JOptionPane;

public class Desafio3 {

	public static void main(String[] args) {

		String palavra = Digite_a_palavra();
		char vetor[];

		palavra = Retira_Espaco(palavra);

		vetor = new char[palavra.length()];

		Quebra_Palavra(palavra, vetor);

	
		Calcula_Anagrama(vetor, 0);

		System.exit(0);
	}
	
	private static String Digite_a_palavra() {
		String palavra = "";
		while (palavra.length() <= 2) {
			palavra = JOptionPane.showInputDialog(null,
					"Digite uma palavra de no minimo 3 caracteres",
					"Calculando Anagrama", JOptionPane.INFORMATION_MESSAGE);
		}
		return palavra;
	}
	
	private static void Mostra(char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("");
	}
	
	private static String Retira_Espaco(String palavra) {
		String alterada = "", interna = (palavra).trim();
		char c;

		for (int i = 0; i < interna.length(); i++) {
			c = interna.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				alterada += c;
			}
		}

		return alterada;
	}
	
	private static void Calcula_Anagrama(char vetor[], int k) {
		int i;
		if (k == vetor.length - 1)
			Mostra(vetor);
		else {
			Calcula_Anagrama(vetor, k + 1);
			i = k + 1;
			while (i < vetor.length) {
				Troca_Posicao(vetor, k, i);
				Calcula_Anagrama(vetor, k + 1);
				Troca_Posicao(vetor, k, i);
				i = i + 1;
			}
		}
	}

	
	private static void Troca_Posicao(char[] vetor, int k, int i) {
		char aux;
		aux = vetor[i];
		vetor[i] = vetor[k];
		vetor[k] = aux;
	}


	private static void Quebra_Palavra(String palavra, char vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}
	}
}

