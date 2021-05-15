package Project_Vac;

import java.util.Scanner;

public class Alimentos {
	

	String doacaoAlimentos(int i, int i2) {	
		
		return "\nRegistrado\n" + i + " Alimento(s)\n" + i2 + " Produto(s) de Higiene";		

	}
	
	String doacaoAlimentos(int i) {
				
		return "\nRegistrado\n" + i + " Alimento(s)";
		
	}

	public void Doacao() {
		
			Scanner ler = new Scanner(System.in);
			
			System.out.print("\n[1]Sim\n[2]Não\nVocê pretende levar doações: ");		
			int resp = ler.nextInt();
			
			if(resp == 1) {
				
			 System.out.print("\n[1]Alimento não perecível e Produto de Higiene\n[2]Alimento não perecível\nVocê doará: ");
			char resp2 = ler.next().charAt(0);
			 
				switch(resp2) {
				
				case '1':
					
					System.out.print("\nQuantos alimentos não perecíveis você doará: "); 
					int alimentos = ler.nextInt();
					
					System.out.print("\nQuantos produtos de higiene você doará: ");
					int higiene = ler.nextInt();
									
					System.out.println(doacaoAlimentos(alimentos,higiene));				//dois parametros
					
					System.out.println("\nAgradecemos pela colaboração\n\n===Se mantenha seguro, use máscara!===");
					
					break;
					
			
					
				case '2':
					
					System.out.print("\nQuantos alimentos não perecíveis você doará: ");
					alimentos = ler.nextInt();
									
					System.out.println(doacaoAlimentos(alimentos)); 					//um parametro
					
					System.out.println("\nAgradecemos pela colaboração\n\n===Se mantenha seguro, use máscara!===");
					
					break;
					
				
				}
							
			}
			else {
				System.out.println("\nAgradecemos pela colaboração\n\n===Se mantenha seguro, use máscara!===");
			}
			
		
	}
}
