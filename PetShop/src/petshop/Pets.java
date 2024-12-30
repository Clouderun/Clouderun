package petshop;

public class Pets {
	// cachorro, gato, coelho, passaro, ramster
	
	private String PetTipo;
	private String Raça;
	private String Pelagem;
	private String Tamanho;
	
	public Pets() {
		
	}
	
	
	public Pets(String pet, String raça, String pelagem, String tamanho) {
		PetTipo = pet;
		Raça = raça;
		Pelagem = pelagem;
		Tamanho = tamanho;
	}


	public String getPet() {
		return PetTipo;
	}


	public void setPet(String pet) {
		PetTipo = pet;
	}


	public String getRaça() {
		return Raça;
	}


	public void setRaça(String raça) {
		Raça = raça;
	}


	public String getPelagem() {
		return Pelagem;
	}


	public void setPelagem(String pelagem) {
		Pelagem = pelagem;
	}


	public String getTamanho() {
		return Tamanho;
	}


	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}


	public String impress() {
		return "Animal = " + PetTipo + ", Raça =" + Raça + ", Pelagem =" + Pelagem + ", Tamanho =" + Tamanho;
	} 
	
	
	
	
}
