package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString());
		
		aluno = new Aluno();
		System.out.println(aluno);
		
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
		
		//vc chama a classe que deseja iniciar (criar o obj)
		//a partir deste momento o aluno se torna um obj
		Aluno aluno1 = new Aluno(); 
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
		
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " +pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " +pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover disciplina?");
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("ual disciplina: 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue());
		}
		
		System.out.println(aluno1); //descrição do obj na memoria
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("Resultado 2 = " + (aluno1.getAlunoAprovado2() ? "Aprovado" : "Reprovado")); //com operador ternario
		
		
	}
}
