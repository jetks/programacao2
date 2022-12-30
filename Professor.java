// a palavra extends indica que está ocorrendo a herença
public class Professor extends Pessoa {
	
	private String vinculo;
	private float salario;
	private int siape;
	private int cargaHoraria;
	
	// vinculos válidos são 20 | 40 | DE | VI
	public void setVinculo(String vinculo) {
		if (vinculo == "20" || vinculo == "40" || vinculo == "DE") {
			this.vinculo = vinculo;
			if (vinculo == "20")	// quando o vinculo eh de 20 horas, define a cargaHoraria com 20
				this.cargaHoraria = 20;
			if (vinculo == "40" || vinculo == "DE")	// quando o vinculo eh de 40 horas OU dedicação exclusiva, define a cargaHoraria com 40
				this.cargaHoraria = 40;
		} else if (vinculo == "VI") {
			this.vinculo = vinculo;
			System.out.println("\nPara professor visitante, é preciso específicar o número de horas trabalhadas\n");
		} else {
			System.out.println("\nSó é permitido vínculos 20 | 40 | DE OU VI\n");
			System.out.println("\nAltere o vínculo empregaticio para calcular o salario corretamente\n");
		}
	}
	
	public void setCargaHoraria (int ch) {
		// A carga horária só pode ser alterada para o professor for visitante.
		// Testa também se ch contém um valor válido
		if (this.vinculo == "VI" && ch > 0 ) {
			this.cargaHoraria = ch;
			calcularSalario();
		} else
			System.out.println("\nSó é possível alterar a carga horária do professor visitante. Também não é possível usar valores negativos para CH\n");
	}
	
	// é necessário receber os parametros para inicializar os objetos da classe Pessoa, pois professor está herdando as caracteristícas da classe.
	public Professor (String vinculo, int siape, String nome, String cpf, Data nascimento){
		/* A referencia super SEMRPE deve estar na primeira linha do método construtor, caso contrário, o programação não irá compilar.
		 * A referencia super, executa o método construtor da classe PAI
		 */
		super(nome, cpf, nascimento);
		// Inicializando os demais atributos da classe.
		// Para inicializar o atributo siape (que é a matrícula), só verificamos se o valor é positvo para ser válido
		if (siape > 0)
			this.siape = siape;
		else 
			// em caso de valor inválido, apresentamos uma "mensagem", pois não foi codificado o método setSiape. Em uma aplicação real, ele seria gerado aleatóriamente, e nunca mais seria alterado.
			System.out.println("\nProcure o setor de TI para alterar o SIAPE\n");
		
		setVinculo(vinculo);
		// necessário chamar o método calcularSalario() para inicializar o atributo salario. Para calcular o valor do salário há o requisito do atributo vinculo estar incializado (feito com a chamada ao método setVinculo() ) 
		calcularSalario();	
	}
	
	// Calcula o salario de acordo com o vinculo. 
	private void calcularSalario() {
		// uma alternativa a esses vários ifs aninhados seria utilizar a estrutura de decisão switch
		if (this.vinculo == "20") {
			this.salario = 2400f;
		} else if (this.vinculo == "40") {
			this.salario = 3500f; 
		} else if (this.vinculo == "DE") {
			this.salario = 4500f;
		} else if (this.vinculo == "VI") {
			this.salario = cargaHoraria * 30; // O calculo do salario do professor visitante usa um valor fixo de 30 reais a hora
		}
	}
	
	public void mostrarDados() {
		// o método mostrar() é definido na classe Pessoa, permitindo reaproveitar o que já está pronto
		System.out.println( mostrar() );
		System.out.printf("Matricula: %d\n", siape);
		System.out.printf("Vinculo: %s\n", vinculo);
		System.out.printf("Salario: %s\n", salario);
	
	}
	
}
