class Data {
	private int dia;
	private int mes; 
	private int ano;
	
	public String escreverPorExtenso(){
		String meses[] = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		return dia + " de " + meses[mes] + " de " + ano;
	}

	public boolean ehBissexto() {
		if ( (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) )
			return true;
		else
			return false;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia (int dia) {
		int diasmes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
		
		if (ehBissexto() == true)
			diasmes[2] = 29;
		else 
			diasmes[2] = 28;
			
		// condição para dia invalido
		// testando se os valores são inválidos
		if (dia < 1 || dia > diasmes[this.mes])
			this.dia = 1; // inicializando o dia com valor padrao
		else
			this.dia = dia;		
			
	}
	
	public int getMes(){
		return mes;
	}
	
	public void setMes(int mes) {
		// validacao do mes
		// condicao que testa os valores validos
		if (mes >= 1 && mes <=12)
			// condicao mes valido
			this.mes = mes;
		else
			// mes invalido
			this.mes = 1;	// inicializando com mes padrao
	}
	
	public void setAno (int ano) {
				// validação do ano
		if (ano > 0)
			this.ano = ano;
		else 
			this.ano = 1970;
	}
	
	public int getAno() {
		return ano;
	}
	
	public Data (int dia, int mes, int ano) {	
		setAno(ano);
		setMes(mes);
		setDia(dia);
	}
}
