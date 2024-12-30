package petshop;

import java.util.Scanner;

public class ApplicationPS {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiastrings = new Scanner(System.in);
		
		int menu;
		// referencia a classe
		Pets pets;
		String pelagem, PetTipo, raça, tamanho;
		
		
		do {
			exibirMenu();
			menu = leia.nextInt();
			
			switch(menu) {
			
				case 1: //cadastro
					System.out.println("-------Cadastrar Pet");
					System.out.println("Insira o tipo: ");
					PetTipo = leiastrings.nextLine();
					System.out.println("Insira a raça: ");
					raça = leiastrings.nextLine();
					System.out.println("Insira a pelagem: ");
					pelagem = leiastrings.nextLine();
					System.out.println("Insira o tamanho: ");
					tamanho = leiastrings.nextLine();
					
					// criar obj da classe
					
					pets = new Pets(PetTipo, raça, pelagem, tamanho);
					
					// guardar o cadastro na lista
					
					list.AdicionarPet(pets);
					
					break;
				case 2: // listar
					System.out.println("-------Listar Pets");
					System.out.println(list.listar());
					break;
				case 3: // pesquisar por pelagem
					System.out.println("-------Pesquisar Pet por pelagem");
					System.out.println("Insira a cor da pelagem: ");
					pelagem = leiastrings.nextLine();
					
					System.out.println("Existem "+ list.search(pelagem) + " pelagens" + pelagem);
					break;
				case 4: // pesquisar por tipo
					System.out.println("-------Pesquisar Pet por tipo");
					System.out.println("Insira o tipo do animal: ");
					PetTipo = leiastrings.nextLine();
					
					System.out.println("Existem "+ list.search2(PetTipo) + " deste tipo");
					break;
				case 5: // remover
					System.out.println("-------Remover Pet vendido");
					System.out.println("Insira o Pet: ");
					PetTipo = leiastrings.nextLine();					
					if (! (list.getListaPetShop().isEmpty())) {
						if(list.remove(PetTipo)) {
							System.out.println("Pet Vendido com Sucesso!");
						}else {
							System.out.println("Pet não encontrado..");
						}
					}else {
						System.out.println("Não tem animais na loja.");
					}
					break;
				case 6: // total
					System.out.println("-------Total de Pets");
					System.out.println(list.total());
					break;
				case 7: //sair
					System.out.println("Volte Sempre!ο(=•ω＜=)ρ⌒☆");
					break;
					
				default:
					System.out.println("Opção inválida!");
			
			}
			
		}while(menu !=7);
		
		
		
		
	}

	static void exibirMenu() {
		System.out.println("☆*: .｡.ฅ^•ﻌ•^ฅ/ᐠ - ˕ -マ Ⳋ  Pet Shop ʕ•ᴥ•ʔ(⌯’▾’⌯) ∫ .｡.:*☆");
		System.out.println("1- Cadastrar Pet");
		System.out.println("2- Listar Pet");
		System.out.println("3- Pesquisar Pet por pelagem");
		System.out.println("4- Pesquisar Pet por tipo");
		System.out.println("5- Remover Pet vendido");
		System.out.println("6- Total de Pets");
		System.out.println("7- Sair");

		System.out.println(".｡.:*☆ESCOLHA UMA OPÇÃO: ");
		
		
	}
	
}
