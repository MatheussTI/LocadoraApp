package locadoraProgram;

import java.util.Scanner;
import entidades.Carro;
import java.util.ArrayList;
import java.util.Scanner;

public class AppLocadora {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		
		ArrayList<Carro> vetCarro = new ArrayList<Carro>();
		cadastrar(vetCarro);
		
		do {
			
			System.out.println("Informe uma opção dentre as abaixo: "
					+ "\n1 - LOCAR"
					+ "\n2 - DEVOLVER"
					+ "\n3 - SAIR");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				//metodo locar
			case 2:
				//metodo devolver
			case 3:
				System.out.println("Encerrando sistema...");
				break;
			default:
				System.out.println("A opção informada é inválida, por favor insira novamente uma opção válida.");
			}
			
		}while(opcao != 3);
	}
	
	public static void cadastrar(ArrayList<Carro> vetCarro) {
		int codigo;
		String modelo;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Informe o codigo do carro: ");
			codigo = sc.nextInt();
			System.out.println("Informe o modelo do carro: ");
			modelo = sc.next();
			
			Carro carro = new Carro(codigo, modelo);
			vetCarro.add(carro);
		}
	}
	
	public static void locar(ArrayList<Carro> vetCarro) {
		int codigo;
		
		System.out.println("Informe o código do carro: ");
		codigo = sc.nextInt();
		
		for(int i = 0; i < vetCarro.size(); i++) {
			if(vetCarro.get(i).getCodigo() != codigo) {
				System.out.println("CARRO NÃO EXISTE");
			}
			else if(vetCarro.get(i).isLocado() == true) {
				System.out.println("CARRO INDISPONIVEL");
			}
			else {
				vetCarro.get(i).locar();
			}
		}
	}
	
	public static void devolver(ArrayList<Carro> vetCarro) {
		int codigo;
		
		System.out.println("Informe o código do carro: ");
		codigo = sc.nextInt();
		
		for(int i = 0; i < vetCarro.size(); i++) {
			if (vetCarro.get(i).getCodigo() != codigo) {
				System.out.println("CARRO NÃO EXISTE");
			}
			else if (vetCarro.get(i).isLocado() == false) {
				System.out.println("CARRO NAO ESTA LOCADO");
			}
			else {
				vetCarro.get(i).devolver();
				System.out.println(Carro.getNumLocados());
			}
		}
	}
	
}
