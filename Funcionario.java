//ALUNOS: Jéssica E. Tolksdorf e Juan M. A. Carvalho

// classe funcionario esta herdando da classe pessoa com o comando extends
public class Funcionario extends Pessoa { 
	private String cargo;
	private char classe;
	private int nivel;
	private float salario;

	//verificando se o nome do cargo é valido
	public void setCargo(String cargo) {
		if (cargo.length() >= 2) 
			this.cargo = cargo;
		 else 
			this.cargo = "";
	}
	
	//validando as classes
	public void setClasse(char classe) {
		if (classe == 'C' || classe == 'D' || classe == 'E') {
			this.classe = classe;
		}if (classe == 'C'){
			this.salario = 2403.06f;
		}else if (classe == 'D') {
			this.salario = 2904.96f;
		}else if(classe == 'E'){
			this.salario = 4403.66f;
		}else {
			this.classe = 'A';
			System.out.println("\nClasse inexistente\n");
		}
	} 
	
	//retornando o atributo classe
	public char getClasse(){
		return classe;
	}
	
	//validando os niveis de 1 a 4
	public void setNivel (int nivel){
		if (nivel == 1 || nivel == 2 || nivel == 3 || nivel == 4) {
			this.nivel = nivel;
			calcularSalario();
		}else {
			System.out.println("\nNivel inexistente\n");
		}
	}

	//retornando o atributo nivel
	public int getNivel() {
		return nivel;
	}
	
	//retornando o atributo salario
	public void setSalario (float salario){
			this.salario = salario;
	}
	
	//calculando o salario do funcionario
	public void calcularSalario (){
		if (nivel == 1 && classe != 'A') {
			this.salario = salario;
		}else if (nivel == 2 && classe != 'A') {
			this.salario = salario + 99.78f; 
		}else if (nivel == 3 && classe != 'A') {
			this.salario = salario + 101 ;
		}else if (nivel == 4 && classe != 'A') {
			this.salario = salario + 103;
		}
	}

	// metodo construtor
	public Funcionario (String cargo, char classe, String nome, String cpf, Data nascimento) {
		super(nome, cpf, nascimento); //inicializando os atributos
		this.cargo = cargo;
		setClasse(classe);
		setNivel (1);
		if (classe != 'A'){
			calcularSalario();
		}
	}
	
	// mostrar os dados definidos
	// o método mostrar() é definido na classe Pessoa, reaproveitando o que já tem
		public void mostrarDados() {
		System.out.println( mostrar() );
		System.out.printf("Cargo: %s\n", cargo);
		System.out.printf("Classe: %c\n", classe);
		System.out.printf("Nivel: %s\n", nivel);
		System.out.printf("Salario: %.2f\n", salario);
		}
		
		//criando os funcionarios
		public static void main (String args[]) {
		Funcionario jess = new Funcionario("estagiario", 'C', "Jessica Tolksdorf", "807.583.280-95", new Data(28, 4, 2004));
		jess.setNivel (2);
		jess.mostrarDados();
	}
}
