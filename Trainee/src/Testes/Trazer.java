package Testes;

import java.util.Scanner;

public class Trazer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Classes.BD bd = new Classes.BD();
		
		bd.conectar();
		bd.verificar_chamado();
				
	}

}
