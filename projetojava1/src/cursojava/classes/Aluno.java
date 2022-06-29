package cursojava.classes;

public class Aluno {
	//Definindo os atributos de aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String NumeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	//construtor padrão
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	//construtor que define parâmetro padão, ou seja:
	//valores obrigatórios para criação do obj
	
	public Aluno (String nomePadrao) { //construtor com 1 parâmetro
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) { //construtor com 2 parâmetros
		nome = nomePadrao;
		idade = idadePadrao;
	/*Quando for criar um aluno que receba esses 2 parâmetros
	 * lá vai ser obrigatório declarar os valores de idade e 
	 * nome (VER NA CLASSE PRIMEIRACLASSEJAVA*/
	}
	
	/*Adicionando os metodos getters e setters dos obj
	 * Seetter = recebe os dsdos dos atributos (adicionar)
	 * Getter = obter os dados dos atributos (resgata)*/
	
	public void setNome (String nome) {
		this.nome = nome; //o this vai fazer referencia ao nome do atributo criado lá em cima (private nome) 
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return NumeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		NumeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	//Método que retorna a média do aluno
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	//verificar se o aluno reprovou ou foi aprovado
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >=70) {
			return "Aluno está aprovado";
		}else {
			return "Aluno está reprovado";
		}
	}
	//Com retorno BOOLEANO
	public boolean getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >=70) {
			return true;
		}else {
			return false;
		}	
		
	}
}