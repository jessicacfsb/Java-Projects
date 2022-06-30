package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		//entrada de dados
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String rg = JOptionPane.showInputDialog("Qual o rg do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual data da matrícula do aluno?");
		String serie = JOptionPane.showInputDialog("Qual a série do aluno?");
		String escola = JOptionPane.showInputDialog("Qual a escola do aluno?");
		String nota1 = JOptionPane.showInputDialog("Primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Quarta nota: ");
		
		//vc chama a classe que deseja iniciar (criar o obj)
		//a partir deste momento o aluno se torna um obj
		Aluno aluno1 = new Aluno(); //aqui será o joao
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nome da Mãe: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("Resultado 2 = " + (aluno1.getAlunoAprovado2() ? "Aprovado" : "Reprovado")); //com operador ternario
		
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
