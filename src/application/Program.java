package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com um produto: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		Product product = new Product(nome, preco);
		
		System.out.println();
		System.out.println("Produto: " + product);
		System.out.println();
		
		System.out.print("Entre com um numero de produto que queira adicionar: ");
		int quantidade = sc.nextInt();
		product.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Produto atualizado: " + product);
		System.out.println();
		System.out.print("Entre com um numero de produto que queira remover: ");
		quantidade = sc.nextInt();
		product.removeProducts(quantidade);
		
		System.out.println();
		System.out.println("Produto atualizado: " + product);
		
		
		sc.close();
	}
}