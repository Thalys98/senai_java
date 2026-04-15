package controller;
import java.io.InputStream;
import java.util.Scanner;

import model.Aluno;
import model.Professor;

public class Teste {
public static void main(String[]args) {
	Scanner sc = Scanner(System.in);
	
	Aluno aluno = new Aluno ("Joao Mendes silva","10099876-5","035568843-06","21-87553456","jmendes_silva@gmail.com","10001","tecnico de ti");
	Professor professor = new Professor ("Marcelo roberto campos","10054987-7","075598845-75","21-77938574","mrcampos@senai.rj.gov.br","901","TI");
	
	System.out.println("Digite o seu nome: ");
	String nomeAluno = sc.next();
	
	System.out.println(nomeAluno);
	
	System.out.println(aluno.getMatricula());

	sc.close();
	
}

private static Scanner Scanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}


			
}

