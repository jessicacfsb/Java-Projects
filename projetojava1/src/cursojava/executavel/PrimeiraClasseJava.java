package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		//vc chama a classe que deseja iniciar (criar o obj)
		//a partir deste momento o aluno se torna um obj
		Aluno aluno1 = new Aluno(); //aqui será o joao
		aluno1.setNome("Jõao da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("445454-2");
		aluno1.setNumeroCpf("123.123.123-12");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola Jdev");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado2() ? "Aprovado" : "Reprovado")); //com operador ternario
		
		//--------------------------------------------------------------------
		
		Aluno aluno2 = new Aluno(); //aqui será o pedro
		Aluno aluno3 = new Aluno(); //aqui será o alex
		Aluno aluno4 = new Aluno("Maria"); //pre definido na classe: ALUNO
		Aluno aluno5 = new Aluno("Jose", 50); //pre definido na classe: ALUNO
	//new == instanciar um obj
	//as var aluno1,2,3,4,5 == fazem referência ao obj aluno
	//os atributos são as caracteristicas definidas na classe ALUNO
	}
}
