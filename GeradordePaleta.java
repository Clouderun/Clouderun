package Colorpallette;

import java.util.Random;
import java.util.Scanner;

public class GeradordePaleta {

	public static void main(String[] args) {

		//O usuario podera escolher entre 3 a 5 cores para paleta
		// gerar elas aleatoriamente
		// e gerar aleatoriamente se é claro escuro ou pastel ou neon
		//sistema pra ajudar artistas a dar cor a um personagem.
		
		Scanner leia = new Scanner(System.in);
		//Random random = new Random();
		
		int numCores, numEscolha;
		String[] cores = {"vermelho", "laranja", "amarelo", "verde", "azul", "roxo", "rosa","marrom", "preto", "branco"};
		String[] tons = {"claro", "pastel", "neon", "escuro"};
		
		
		String colors = cores[new Random().nextInt(cores.length)];
		String colors2 = cores[new Random().nextInt(cores.length)];
		String colors3 = cores[new Random().nextInt(cores.length)];
		String colors4 = cores[new Random().nextInt(cores.length)];
		String colors5 = cores[new Random().nextInt(cores.length)];
		String tom = tons[new Random().nextInt(tons.length)];
		String tom2 = tons[new Random().nextInt(tons.length)];
		String tom3 = tons[new Random().nextInt(tons.length)];
		String tom4 = tons[new Random().nextInt(tons.length)];
		String tom5 = tons[new Random().nextInt(tons.length)];
		
		//numCores = cores.length;
		
		System.out.println("Olá! Bem-vindo ao sistema de Paletas(✿◠‿◠)");
		System.out.println("Por favor, escolha de um número entre 1 e 5, quantas cores você quer na sua paleta.");
		numEscolha = leia.nextInt();
		
		switch(numEscolha) {
		
			case 1: // 1 cor
				System.out.println("Você ecolheu apenas 1 cor: " + colors);
				System.out.println("E seu tom é: " + tom);
		
				break;
			case 2: // 2 cores
				System.out.println("Você escolheu 2 cores: " + colors + " e "+ colors2);
				System.out.println("E seus tons são: " + tom + " e "+ tom2);
				
				break;
			case 3: // 3 cores
				System.out.println("Você escolheu 3 cores: " + colors + ", "+ colors2 + " e "+ colors3);
				System.out.println("E seus tons são: " + tom + ", "+ tom2 + " e "+ tom3);
				
				break;
			case 4: // 4 cores
				System.out.println("Você escolheu 4 cores: "+ colors + ", "+ colors2 + ", "+ colors3 + " e " + colors4);
				System.out.println("E seus tons são: " + tom + ", "+ tom2 + ", "+ tom3 + " e "+ tom4);
				
				break;
			case 5: // 5 cores
				System.out.println("Você escolheu 5 cores: "+ colors + ", "+ colors2 + ", "+ colors3 + ", " + colors4 + " e " + colors5);
				System.out.println("E seus tons são: " + tom + ", "+ tom2 + ", "+ tom3 + ", "+ colors4 + " e " + tom5);
				
			default:
				System.out.println("Não é possivel escolher este tipo de numero.");
		}
		
		System.out.println("Espero que tenha gostado! o(^▽^)o");
		
	}
	

}
