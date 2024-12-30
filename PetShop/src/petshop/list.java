package petshop;

import java.util.ArrayList;

public class list {

	private static ArrayList<Pets> ListaPetShop = new ArrayList<>();

	public static ArrayList<Pets> getListaPetShop() {
		return ListaPetShop;
	}
	
	// adiciona algo na lista
	public static void AdicionarPet(Pets add) {
		ListaPetShop.add(add);
	}
	
	public static String listar() {
		String saida = "";
		int l = 1;
		
		for (Pets i : ListaPetShop) {
			saida += "\n------------*Animal " + (l++) + "*------------";
			saida += i.impress();
		}
		
		return saida;
	}
	
	public static int search(String pelagem) {
		int qtd =0;
		
		for (Pets i : ListaPetShop)  {
			// utiliza este pra nao precisar se preocupar de ta maiusculo ou nn
			if (i.getPelagem().equalsIgnoreCase(pelagem)) {
				qtd++;
			}
		}
		
		return qtd;
	}
	
	public static int search2(String PetTipo) {
		int qtd =0;
		
		for (Pets i : ListaPetShop)  {
			// utiliza este pra nao precisar se preocupar de ta maiusculo ou nn
			if (i.getPet().equalsIgnoreCase(PetTipo)) {
				qtd++;
			}
		}
		
		return qtd;
	}
	
	
	//remover animal pois foi vendido..
	
	public static boolean remove(String pet) {
		for (Pets i : ListaPetShop) {
			if(i.getPet().equalsIgnoreCase(pet)) {
				ListaPetShop.remove(pet);
				return true;
			}
		}
		return false;
	}
	
	//total de bichos
	public static int total() {
		
		int counter=0;
		
		for (Pets i : ListaPetShop) {
			counter++;
		}
		
		return counter;
	}
	
	
	
}
