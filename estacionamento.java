package estacionamento;

import java.util.Scanner;

public class estacionamento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//declaracao variaveis
		int idoso, deficiente, gestante;
		
		//exibicao texto
		System.out.println(
				"pesquisa vaga especial\nDigite:\n1 para sim\n2 para nao");
		System.out.println("voce e idoso?\n1.sim\n2.nao");
		
		//atribuicao de valor
		idoso = leia.nextInt();
		System.out.println("voce e deficiente? \n1.sim\n2.nao");
		deficiente = leia.nextInt();
		System.out.println("voce e gestante?\n1.sim\n2.nao");
		gestante = leia.nextInt();
		
		//encerando
		leia.close();
		
		//condicao
		if (idoso == 1 || deficiente == 1 || gestante == 1) {
			System.out.println("Voce pode estacionar!");
		} else {
			System.out.println("Voce não pode estacionar!");
		}
	}

}
