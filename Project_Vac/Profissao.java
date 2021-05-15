package Project_Vac;


	import java.util.Scanner;

	public class Profissao extends Pessoa implements Condicao_Vac {
		
		private int profissoes;
		
		Scanner ler = new Scanner(System.in);

		public int getProfissoes() {
			return profissoes;
		}

		public void setProfissoes(int profissoes) {
			this.profissoes = profissoes;
		}
		
		@Override
		public int condicao(int i) {
			
			int resultado;
			
			if(i == 1) {		//�rea da Sa�de
				resultado = 5;
			}
			else if (i == 2)	//Motoristas/Cobrador
			{
				resultado = 4;
			}
			else if (i == 3)	//Profissional da Educa��o
			{
				resultado = 3;
			}
			else if (i == 4)	//Profissional da Seguran�a P�blica
			{
				resultado = 2;
			}
			else
			{
				resultado = 0;	//Outros ou Nenhum
			}
			return resultado;	
		}

}