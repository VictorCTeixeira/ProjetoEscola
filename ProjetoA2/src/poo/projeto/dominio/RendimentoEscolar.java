package poo.projeto.dominio;
import java.util.ArrayList;

public class RendimentoEscolar extends BaseObjetoAluno{
    private Turma turma;
    private double nota1Prova;
    private double nota2Prova;
    private ArrayList<NotaTrabalho> trabalhos; 
    private double mediaTrabalhos;
    private double mediaGeral;
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public double getNota1Prova() {
        return nota1Prova;
    }
    public void setNota1Prova(double nota1Prova) {
        this.nota1Prova = nota1Prova;
    }
    public double getNota2Prova() {
        return nota2Prova;
    }
    public void setNota2Prova(double nota2Prova) {
        this.nota2Prova = nota2Prova;
    }
    public ArrayList<NotaTrabalho> getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(ArrayList<NotaTrabalho> Notastrabalhos) {
        this.trabalhos = Notastrabalhos;
    }
    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }
    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }
    public double getMediaGeral() {
        return mediaGeral;
    }
    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
    public RendimentoEscolar() {
    }
    public RendimentoEscolar(int codigo, Aluno aluno, Turma turma, double nota1Prova, double nota2Prova,
            ArrayList<NotaTrabalho> Notastrabalhos) {
        super(codigo, aluno);
        this.turma = new Turma();
        this.nota1Prova = nota1Prova;
        this.nota2Prova = nota2Prova;
        this.trabalhos = new ArrayList<NotaTrabalho>();
        this.mediaTrabalhos = this.CalcularMediaTrabalho();
        this.mediaGeral = this.CalcularMediaGeral();
    }
    @Override
    public String toString() {
        return "RendimentoEscolar [codigo = "+ codigo + "aluno = "+ aluno + "turma=" + turma + ", nota1Prova=" + nota1Prova + ", nota2Prova=" + nota2Prova
                + ", Notastrabalhos=" + trabalhos + ", mediaTrabalhos=" + mediaTrabalhos + ", mediaGeral="
                + mediaGeral + "]";
    }

    public double CalcularMediaTrabalho(){
        double somaTotal = 0;
        for(NotaTrabalho t1 : trabalhos){
            somaTotal += t1.getNota();
        }
        double mediaTotal = somaTotal/4;
        return mediaTotal;
    }

    public double CalcularMediaGeral(){
        double MediaGeral = (mediaTrabalhos + nota1Prova + nota2Prova)/3;
        return MediaGeral;
    }
    
}
