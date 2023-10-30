package poo.projeto.FakeDB;
import poo.projeto.dominio.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{ 
    private TurmaFakeDB turmas = new TurmaFakeDB();
    private ArrayList<Turma> listaTurmas = turmas.getLista();
  

    @Override
    protected void CarregarDados() {//0 - 99 -> Aluno
       this.lista.add(new Aluno(1, "Caio Monteiro", "CM12039", LocalDate.of(2005, 8, 16), "Caio", 1, listaTurmas.get(0), null));
       this.lista.add(new Aluno(2, "Fabricio Ortiz", "FB120983", LocalDate.of(2005, 4, 29), "Fabricio", 1, listaTurmas.get(0), null));
       this.lista.add(new Aluno(3, "Fagner Souza", "FS10213", LocalDate.of(2005, 3,21), "Fagner", 1, listaTurmas.get(0), null));
       this.lista.add(new Aluno(4, "Gabriel Barbosa", "GB091283", LocalDate.of(2003, 2, 15), "Gabriel", 2, listaTurmas.get(1), null));
       this.lista.add(new Aluno(5, "Felipe Neto", "FN09213", LocalDate.of(2003, 3, 13), "Felipe", 2, listaTurmas.get(1), null));
       this.lista.add(new Aluno(6, "Fernando Moura", "FM0912", LocalDate.of(2003, 1, 10), "Fernando", 2, listaTurmas.get(1), null));
       this.lista.add(new Aluno(7, "Henrique Matos", "HM019283", LocalDate.of(2002, 12, 1), "Henrique", 3, listaTurmas.get(2), null));
       this.lista.add(new Aluno(8, "Bruno Henrique", "BG273123", LocalDate.of(2003, 11, 4), "Bruno", 3, listaTurmas.get(2), null));
       this.lista.add(new Aluno(9, "Giorgian de Arrascaeta", "GA091283", LocalDate.of(1999, 9, 5), "Giorgian", 3, listaTurmas.get(2), null));
       this.lista.add(new Aluno(10, "Gerson Junior", "GJ891273", LocalDate.of(2000, 7, 10), "Gerson", 4, listaTurmas.get(3), null));
       this.lista.add(new Aluno(11, "Piquerez Gomes", "PG10912783", LocalDate.of(1998, 10, 19), "Piquerez", 4, listaTurmas.get(3), null));
       this.lista.add(new Aluno(12, "Rony Gomes", "RG019283", LocalDate.of(20000, 12, 10), "Rony", 4, listaTurmas.get(3), null));
       this.lista.add(new Aluno(13, "Victor Conceição", "VC019283", LocalDate.of(1999, 6, 29), "Victor", 5, listaTurmas.get(4), null));
       this.lista.add(new Aluno(14, "Diogo Molina", "DM09182", LocalDate.of(1996, 5, 28), "Diogo", 5, listaTurmas.get(4), null));
       this.lista.add(new Aluno(15, "Guilherme Freitas", "GF9182376", LocalDate.of(1997, 4, 30), "Guilherme", 5, listaTurmas.get(4), null));
       this.lista.add(new Aluno(16, "Daniel Sampaio", "DS019283", LocalDate.of(1996, 5, 31), "Daniel", 6, listaTurmas.get(5), null));
       this.lista.add(new Aluno(17, "Igor Pires", "IP019283", LocalDate.of(1995, 4, 21), "Igor", 6, listaTurmas.get(5), null));
       this.lista.add(new Aluno(18, "Roberto Cruzes", "RC019283", LocalDate.of(1995, 3, 20), "Roberto", 6, listaTurmas.get(5), null));
       this.lista.add(new Aluno(19, "Cruz Ramires", "CR1231231", LocalDate.of(1994, 10, 15), "Cruz", 7, listaTurmas.get(6), null));
       this.lista.add(new Aluno(20, "Jackson Storm", "JS091123", LocalDate.of(1993, 11, 13), "Jackson", 7, listaTurmas.get(6), null));
       this.lista.add(new Aluno(21, "Doc Hudson", "DH9812738", LocalDate.of(1997, 12, 10), "Doc", 7, listaTurmas.get(6), null));
       this.lista.add(new Aluno(22, "Fabricio Bruno", "FB01987", LocalDate.of(1999, 6, 11), "Fabricio", 8, listaTurmas.get(7), null));
       this.lista.add(new Aluno(23, "Everton Ribeiro", "ER0129381", LocalDate.of(1999, 7, 8), "Everton", 8, listaTurmas.get(7), null));
       this.lista.add(new Aluno(24, "Hemerson Vieira", "HV1928372", LocalDate.of(1997, 10, 6), "Hemerson", 8, listaTurmas.get(7), null));
    }
    public AlunoFakeDB() {
        super();
    }
    
}
