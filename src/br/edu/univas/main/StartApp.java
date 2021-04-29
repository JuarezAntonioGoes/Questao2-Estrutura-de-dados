package br.edu.univas.main;

import java.util.Arrays;
import java.util.List;

public class StartApp {
	
	public static void main(String[] args) {
		List<String> array1 = Arrays.asList("1", "2", "3");
		List<String> array2 = Arrays.asList("1", "2", "3");	
		
		ProductList lista1 = new ProductList();
		lista1.setLista(array1);	
		
		ProductList lista2 = new ProductList();
		lista2.setLista(array2);
		
		System.out.println(lista1.equals(lista2));

	}
}
