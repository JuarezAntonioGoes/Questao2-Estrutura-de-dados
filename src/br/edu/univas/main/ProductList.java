package br.edu.univas.main;

import java.util.Arrays;
import java.util.List;

public class ProductList {
	List<String> lista;
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	boolean equals(ProductList other) {
		List<String> listaa2 = other.getLista();
		
		String convert1 = String.join("", lista);
		String convert2 = String.join("", listaa2);
		
		return convert1.equals(convert2);		
	}
}
