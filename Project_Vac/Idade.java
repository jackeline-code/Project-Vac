package Project_Vac;

public class Idade extends Pessoa implements Condicao_Vac{
	
	
	private int idade;
	int resultado;
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public int condicao(int i) {
		
		if(i >=18 && i <= 19) 
		{
			resultado = 1;
		}
		else if (i >=20 && i <=29 )
		{
			resultado = 2;
		}
		else if (i >= 30 && i <= 39)
		{
			resultado = 3;
		}
		else if (i >=49 && i <= 49)
		{
			resultado = 4;
		}
		else if(i >= 50 && i <=59 ) 
		{
			resultado = 5;
		}
		else
		{
			resultado = 0;
		}
		return resultado;	
	}	

}