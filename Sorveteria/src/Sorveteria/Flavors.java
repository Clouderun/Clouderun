package Sorveteria;

public class Flavors {
	private String morango;
	private String chocolate;
	private String baunilha;
	private String flocos;
	private String cheesecake;
	private String babalu;
	private String frutasVermelhas;
	private String tropical;
	
	public Flavors() {
		super();
		this.morango = morango;
		this.chocolate = chocolate;
		this.baunilha = baunilha;
		this.flocos = flocos;
		this.cheesecake = cheesecake;
		this.babalu = babalu;
		this.frutasVermelhas = frutasVermelhas;
		this.tropical = tropical;
	}
	
	public void Cardapio() {
		System.out.println("O cardapio está aberto e sendo visualizado.");
		System.out.println("Os sabores de sorvete que tem na loja são: \n 🍓Morango \n 🍫Chocolate \n 🌼Baunilha \n 🍪Flocos \n 🍰Cheesecake \n 🔵Babalu \n 🫐Frutas Vermelhas \n 🥭Tropical \n");
	}
}
