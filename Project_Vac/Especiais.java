package Project_Vac;

public class Especiais extends Pessoa implements Condicao_Vac {
	private int especiais;

	public int getEspeciais() {
		return especiais;
	}

	public void setEspeciais(int especiais) {
		this.especiais = especiais;
	}
	
	@Override
	public int condicao(int i) 
	{
		int resultado;
		
		if(i == 1) {		//Sindrome de Down
			resultado = 5;
		}
		else if (i == 2)	//Problemas renais em diálise
		{
			resultado = 4;
		}
		else if (i == 3)	//Transplantados Imunossuprimidos
		{
			resultado = 3;
		}
		else if (i == 4)	//Grávidas e Puéperas com comorbidades
		{
			resultado = 2;
		}
		else if (i == 5)	//BPC
		{
			resultado = 1;
		}
		else
		{
			resultado = 0;	//Nenhuma das Opções
		}
		
		return resultado;	
	}

	

}