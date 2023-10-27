import java.util.ArrayList;
import java.util.Scanner;

import poo.projeto.dominio.Aluno;
import poo.projeto.dominio.Professor;
import poo.projeto.dominio.Servico.AlunoServico;
import poo.projeto.dominio.Servico.ProfessorServico;

public class Menu {
    
    private Scanner scan;

    public Menu() {
    
        this.scan = new Scanner(System.in);

    }

    public void Executar() {
        this.ExibirMenu();
    }

    private void ExibirMenu() {

        int continuar = 99;

        do {

            System.out.println("1. Professores:");

            System.out.println("2. Alunos:");

            System.out.println("0. Encerrar programa:");

            continuar = this.scan.nextInt();

            switch(continuar) {

                case 1:
                    this.professores();
                break;

                case 2:
                    this.alunos();
                break;

                case 0:
                    this.encerramento();
                break;

                default:

                System.out.println("Digite uma opção válida\n");

            }

        } while (continuar != 0);
    }

    private void professores() {

        ProfessorServico prof = new ProfessorServico();
        ArrayList<Professor> lista = prof.Listar();

        for(Professor p1 : lista){
            System.out.println("Nome: " + p1.getNome() + " e Codigo " + p1.getCodigo());
        }

        System.out.println("\nDigite o codigo do professor:");
        int codigo = scan.nextInt();

        prof.Obter(codigo);

    }

    private void alunos() {

        AlunoServico aluno = new AlunoServico();
        ArrayList<Aluno> lista = aluno.Listar();
        
        for(Aluno c1 : lista){
            System.out.println("Nome: " + c1.getNome() + " e Codigo " + c1.getCodigo());
        }

        System.out.println("\nDigite o codigo do aluno:");
        int codigo = scan.nextInt();

        aluno.Obter(codigo);
    }

    private void encerramento() {

        System.out.println("Programa encerrando!\n");
        
    }

}
