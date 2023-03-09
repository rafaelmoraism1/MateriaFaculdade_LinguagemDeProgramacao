package br.com.springboot.model;

public enum Sexo {
	MASCULINO ("Masculino"),
	FEMININO("Feminino"); // opções

	private String descricao; // declarando um string
	
	Sexo(String descricao)  // construtor do Enum
	{
		this.descricao = descricao;
	}
	
	public String getDescricao() // método para obter a descrição de cada enum
	{
		return this.descricao;
	}
}
