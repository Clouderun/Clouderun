package Sorveteria;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Flavors sabores = new Flavors();
		Additionals add = new Additionals();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Seja Bem-Vindo á Sorveteria virtual BeSliced");
		System.out.println("Deseja ver o cardápio?");
		String resposta = leia.next();
		if (resposta.equals("Sim")) {
			sabores.Cardapio();
		} else if (resposta.equals("sim")) {
			sabores.Cardapio();
		} else if (resposta.equals("não")) {
			System.out.println("Volte sempre!");
		} else if (resposta.equals("Não")){
			System.out.println("Volte sempre!");
		} else {
			System.out.println("Resposta inválida, tente novamente!");
		}
		
		
		
		
		System.out.println("Deseja ver os adicionais? ");
		resposta = leia.next();
		if (resposta.equals("Sim")) {
			add.cardapio();
		} else if (resposta.equals("sim")) {
			add.cardapio();
		} else if (resposta.equals("não")) {
			System.out.println("Volte sempre!");
		} else if (resposta.equals("Não")){
			System.out.println("Volte sempre!");
		} else {
			System.out.println("Resposta inválida, tente novamente!");
		}
	}

}
