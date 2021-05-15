package Project_Vac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Verificacao {

public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		Especiais esp = new Especiais(); 			//objetos(instancias)
		Idade id = new Idade();						//objetos(instancias)
		Pessoa pe = new Pessoa();       			//objetos(instancias)
		Profissao prof = new Profissao(); 			//objetos(instancias)
		Alimentos alimentos = new Alimentos();		//objetos(instancias)
		
		int linha = 1;//quantidade de cadastros
		String [][] agenda = new String [linha][3]; //matriz(1 linha, 3 colunas[Linha=Cadastro][Colunas[Data,Nome,Prioridade])
		int dia, mes, ano = 2021;
		int li, c;
		int prioridade = 0; 
		
		Random gera = new Random(); // Classe Java que dentro dele tem uma função de gerar numeros aleatórios
		
		System.out.println("========================================================");
		System.out.println("                      Sys - Vac");
		System.out.println("========================================================");
		System.out.println("   Sistema de cadastro para idades entre 0 e 59 anos"
				+" \n      Se você possui idade superior, ligue 1599"
				+" \n========================================================");
		
		//anda as linhas
		for(li = 0; li<agenda.length; li++) {
			
			int aux =0;
		
			// Inserção de dados
			System.out.print("Nome: ");		
			pe.setNome(l.next()); //  nome
			//System.out.println(pe.getNome());
			
			System.out.print("Endereço: "); // endereço
			pe.setEndereço(l.next());
			
			System.out.print("Idade: ");
			id.setIdade(l.nextInt());  //  idade
			aux =id.getIdade();
			
			//System.out.println(aux);
			
			if(aux<60){
			
			//System.out.print("Prioridade: " + id.condicao(id.getIdade())); 
			
			//---------------------------idade menor de 18 --------------
			
				if(id.getIdade()<18) {
					
					System.out.print("\n=========================== Necessário acompanhamento adulto ============================ "
							+        "\n============== Agendamento presencial acompanhado de um adulto responsável ============== ");
												
				} 
				else {
					
								
			
			System.out.println("[1]Área da Saúde\n[2]Motoristas/Cobrador\n[3]Profissional da Educação\n[4]Profissional da Segurança Pública"
					+ "\n[0]Outros ou Nenhum");
			System.out.print("\nTrabalha em uma dessas áreas: ");	
			prof.setProfissoes(l.nextInt());
			
			//System.out.print("Prioridade: " + prof.condicao(prof.getProfissoes()));
			
			System.out.println("[1]Sindrome de Down\n[2]Problemas renais em diálise\n[3]Transplantados Imunossuprimidos\n[4]Grávidas e Puéperas com comorbidades\n[5]BPC\n[0]Nenhuma das Opções");
			System.out.print("\nPossui alguma dessas doenças: ");	
			esp.setEspeciais(l.nextInt());
			
			//System.out.println(esp.condicao(esp.getEspeciais())); 
			
			//---------------------Collection - Integer-----------------
			
			Collection<Integer> condicao = new ArrayList<Integer>();
			condicao.add(id.getIdade());
			condicao.add(prof.getProfissoes());
			condicao.add(esp.getEspeciais());
			
			System.out.println("\n==============================================================================");
			
			System.out.println("\nSuas opções foram ["+ ((ArrayList<Integer>) condicao).get(0) + "] para idade, ["
					+ ((ArrayList<Integer>) condicao).get(1) + "] para profissão e [" + ((ArrayList<Integer>) condicao).get(2) +
					"] para doenças.");
			System.out.println("\n======= Digite [1] para confirmar e prosseguir ou [2] para sair ========");
			System.out.print("Confirme: ");
			int conf = l.nextInt();
			
			if(conf == 1) {
			

			/********************   prioridade    ****************************/	
			//será recuperado no cadastro de cada pessoa			
			prioridade = (id.condicao(id.getIdade())); 
			

			if ( prioridade < prof.condicao(prof.getProfissoes())){									//idade<profissão
				if(prof.condicao(prof.getProfissoes()) < esp.condicao(esp.getEspeciais())) {		//profissão>especiais
					prioridade = esp.condicao(esp.getEspeciais());
				}
				else {
					prioridade = prof.condicao(prof.getProfissoes());								//idade<profissao
				}
			}else if(prioridade < prof.condicao(esp.getEspeciais())){								//idade<especiais
				prioridade = (id.condicao(esp.getEspeciais()));
			}
			else {
				prioridade = (id.condicao(id.getIdade())); 											//idade
			}
			
			/********************   prioridade    ****************************/	
		
				
			
			
			/****************************** Gera data ********************************/
			//                  ou
			if (prioridade == 5 || prioridade == 4) { //se a prioridade for 4 ou 5
				//					MAX - MIN        MIN
				mes = gera.nextInt((7 - 5)+    1) + 5;  //gera um mês entre 05 e 08
				
			}else if (prioridade == 3 || prioridade == 2) { ////se a prioridade for 4 ou 5
				mes = gera.nextInt((10 - 8) + 1) + 8; //gera um mês entre 09 e 10
				
			}else {					
				mes = gera.nextInt((12 - 11) + 1) + 11; //gera um mês entre 11 e 12
			}				
			
			if (mes == 5){// se cair no mês atual	gerar o dia que não passou				
				dia = gera.nextInt(15)+15; //+ 15;gerando um dia aleatório
			}
			else {
				dia = gera.nextInt(30) + 1;//gerando um dia aleatório*/
				
			}	
			
			
			/****************************** Fim Gera data ********************************/	
			
			//anda as colunas
			for(c = 0; c < agenda[li].length; c++) {		
				
				/********************   preenche as colunas    ****************************/	
				if (c == 0)//adiciona data
					agenda[li][c] = dia+"/"+mes+"/"+ano;
				else if(c == 1)//adiciona o nome
					agenda[li][c] = pe.getNome();
				else //adiciona prioridade
					agenda[li][c] = Integer.toString(prioridade);
				}
			
		
			System.out.println();

		for(li = 0; li<agenda.length; li++) {
			for(c = 0; c < agenda[li].length; c++) {
				if (c == 0)//adiciona data
						System.out.println("===================Data de Vacinação===================\n\nData: " +  agenda[li][c] + " - nome: " +  agenda[li][c+1] + " - Prioridade: " + agenda [li][c+2] + "\n\n=======================================================");	
						}
			
					}	
					System.out.println();
					System.out.println("========================================================");
					System.out.println("                      Doação");
					System.out.println("========================================================");
					
				
		
					alimentos.Doacao();
					
					
					
				
					}else {
						System.out.println("======================= Dados errados? ========================");
						System.out.println("========== Atualize a página para iniciar novamente ===========");
					}
							}
			
					
				
					
			}
				else {
			System.out.println("========= Você possui idade superior, ligue 1599 =========");
			}
		}
}
}