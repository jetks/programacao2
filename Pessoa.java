public class Pessoa{
	private String nome;
	private String cpf;
	private Data nascimento;
	
	// método para definir o atributo nome com um valor válido
	public void setNome (String nome) {
		if (nome.length() >= 2) 
			this.nome = nome;
		 else 
			this.nome = "";
	}
	
	// método para retornar o atributo nome
	public String getNome(){
		return nome;
	}
	
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	public Data getNascimento() {
		return nascimento;
	}
	
	public void setCpf(String cpf) {
		
		if (CpfCnpjUtils.isValidCPF(cpf) == true)
			this.cpf = cpf;
		else 
			this.cpf = "CPF.INV.ALI-DO";
	}
	
	// método construtor
	public Pessoa (String nome, String cpf, Data nascimento) {
		setNome(nome);
		setCpf(cpf);
		setNascimento(nascimento);
	}
	
	// sobrecarga no método construtor 
	public Pessoa (String nome) {
		setNome(nome);
	}
		
	public String mostrar() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de nascimento: " + nascimento.escreverPorExtenso().toLowerCase();
	}
	
	
}
